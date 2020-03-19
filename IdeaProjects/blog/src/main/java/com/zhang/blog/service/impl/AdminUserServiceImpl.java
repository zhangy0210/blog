package com.zhang.blog.service.impl;

import com.zhang.blog.dao.AdminUserMapper;
import com.zhang.blog.utils.MD5Util;
import com.zhang.blog.entity.AdminUser;
import com.zhang.blog.service.AdminUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class AdminUserServiceImpl implements AdminUserService {
    @Resource
    private AdminUserMapper adminUserMapper;

    @Override
    public AdminUser login(String userName, String password) {
        String passwordToMD5 = MD5Util.MD5Encode(password, "utf-8");
        return adminUserMapper.login(userName, passwordToMD5);
    }

    @Override
    public AdminUser getAdminUserById(Integer loginUserId) {
        return adminUserMapper.selectByPrimaryKey(loginUserId);
    }

    @Override
    public boolean updatePassword(Integer loginUserId, String originPassword, String newPassword) {
        AdminUser adminUser = adminUserMapper.selectByPrimaryKey(loginUserId);
        if(adminUser != null){
            String originPasswordMD5 = MD5Util.MD5Encode(originPassword, "utf-8");
            String newPasswordMD5 = MD5Util.MD5Encode(newPassword, "utf-8");
            if(originPasswordMD5.equals(adminUser.getLoginPassword())){
                adminUser.setLoginPassword(newPasswordMD5);
                return adminUserMapper.updateByPrimaryKeySelective(adminUser) > 0;
            }
        }
        return false;
    }

    @Override
    public boolean updateNickName(Integer loginUserId, String userName, String nickName) {
        AdminUser adminUser = adminUserMapper.selectByPrimaryKey(loginUserId);
        if(adminUser != null){
            adminUser.setNickName(nickName);
            adminUser.setLoginUserName(userName);
            return adminUserMapper.updateByPrimaryKeySelective(adminUser) > 0;
        }
        return false;
    }
}

