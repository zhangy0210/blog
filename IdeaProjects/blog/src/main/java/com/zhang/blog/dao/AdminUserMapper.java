package com.zhang.blog.dao;


import com.zhang.blog.entity.AdminUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface AdminUserMapper {
    int insert(AdminUser adminUser);

    int insertSelective(AdminUser adminUser);

    /**
     * 登陆方法
     *
     * @param userName
     * @param password
     * @return
     */
    AdminUser login(@Param("userName") String userName, @Param("password") String password);

    AdminUser selectByPrimaryKey(Integer adminUserId);

    int updateByPrimaryKeySelective(AdminUser adminUser);

    int updateByPrimaryKey(AdminUser adminUser);
}
