package com.zhang.blog.controller;


import com.zhang.blog.entity.AdminUser;
import com.zhang.blog.service.AdminUserService;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private AdminUserService adminUserService;

    @GetMapping("/login")
    public String login(){
        return "admin/login";
    }

    @PostMapping("/login")
    public String login(String userName, String password, String verifyCode, HttpSession httpSession) {
        if (StringUtils.isEmpty(verifyCode)) {
            httpSession.setAttribute("errorMsg", "验证码不能为空");
            return "admin/login";
        }
        if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
            httpSession.setAttribute("errorMsg", "用户名或密码不能为空");
            return "admin/login";
        }
        String kaptchaCode = httpSession.getAttribute("verifyCode") + "";
        if (StringUtils.isEmpty(kaptchaCode) || !verifyCode.equals(kaptchaCode)) {
            httpSession.setAttribute("errorMsg", "验证码错误");
            return "admin/login";
        }
        AdminUser adminUser = adminUserService.login(userName, password);
        if (adminUser != null) {
            httpSession.setAttribute("loginUser", adminUser.getNickName());
            httpSession.setAttribute("loginUserId", adminUser.getAdminUserId());
            //session过期时间设置为7200秒 即两小时
            httpSession.setMaxInactiveInterval(60 * 60 * 2);
            return "redirect:/admin/index";
        } else {
            httpSession.setAttribute("errorMsg", "登陆失败");
            return "admin/login";
        }
    }
        @GetMapping({"", "/", "/index", "/index.html"})
        public String index() {
            return "admin/index";
        }


        @GetMapping("/profile")
        public String profile(HttpServletRequest httpServletRequest){
            Integer loginUserId = (int) httpServletRequest.getSession().getAttribute("loginUserId");
            AdminUser adminUser = adminUserService.getAdminUserById(loginUserId);
            if (adminUser == null) {
                return "admin/login";
            }
            httpServletRequest.setAttribute("path", "profile");
            httpServletRequest.setAttribute("loginUserName", adminUser.getLoginUserName());
            httpServletRequest.setAttribute("nickName", adminUser.getNickName());
            return "admin/profile";
        }

        @PostMapping("/profile/password")
        @ResponseBody
        public String updatePassword(HttpServletRequest httpServletRequest, @RequestParam("originPassword") String originPassword, @RequestParam("newPassword") String newPassword){
            if(StringUtils.isEmpty(originPassword) || StringUtils.isEmpty(newPassword)){
                return "参数不能为空啊";
            }
            Integer loginUserId = (Integer) httpServletRequest.getSession().getAttribute("loginUserId");
            if(adminUserService.updatePassword(loginUserId, originPassword, newPassword)){
                httpServletRequest.getSession().removeAttribute("loginUserId");
                httpServletRequest.getSession().removeAttribute("loginUser");
                httpServletRequest.getSession().removeAttribute("errorMsg");
                return "success";
            }else{
                return "修改失败";
            }
        }

        @PostMapping("/profile/name")
        @ResponseBody
        public String updateNickName(HttpServletRequest httpServletRequest, @RequestParam("userName") String userName, @RequestParam("nickName") String nickName){
            if(StringUtils.isEmpty(userName) || StringUtils.isEmpty(nickName)){
                return "参数不能为空";
            }
            Integer loginUserId = (Integer) httpServletRequest.getSession().getAttribute("loginUserId");
            if(adminUserService.updateNickName(loginUserId, userName, nickName)){
                return "success";
            }else{
                return "修改失败";
            }
        }

        @GetMapping("/logout")
        public String logout(HttpServletRequest httpServletRequest){
            httpServletRequest.getSession().removeAttribute("loginUserId");
            httpServletRequest.getSession().removeAttribute("loginUser");
            httpServletRequest.getSession().removeAttribute("errorMsg");
            return "admin/login";
        }


}
