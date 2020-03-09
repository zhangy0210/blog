package com.zhang.blog.service;

import com.zhang.blog.entity.AdminUser;

public interface AdminUserService {
    /**
     * 登录
     * @param userName
     * @param password
     * @return
     */
    AdminUser login(String userName, String password);

    /**
     * 获取当前登录用户信息
     * @param loginUserId
     * @return
     */
    AdminUser getAdminUserById(Integer loginUserId);

    /**
     * 修改密码
     * @param loginUserId
     * @param originPassword
     * @param newPassword
     * @return
     */
    boolean updatePassword(Integer loginUserId, String originPassword, String newPassword);

    /**
     * 修改用户名
     * @param loginUserId
     * @param userName
     * @param nickName
     * @return
     */
    boolean updateNickName(Integer loginUserId, String userName, String nickName);


}
