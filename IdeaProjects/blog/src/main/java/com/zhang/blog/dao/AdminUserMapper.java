package com.zhang.blog.dao;

import com.zhang.blog.entity.AdminUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_admin_user
     *
     * @mbg.generated Fri Mar 13 22:10:26 CST 2020
     */
    int deleteByPrimaryKey(Integer adminUserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_admin_user
     *
     * @mbg.generated Fri Mar 13 22:10:26 CST 2020
     */
    int insert(AdminUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_admin_user
     *
     * @mbg.generated Fri Mar 13 22:10:26 CST 2020
     */
    int insertSelective(AdminUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_admin_user
     *
     * @mbg.generated Fri Mar 13 22:10:26 CST 2020
     */
    AdminUser selectByPrimaryKey(Integer adminUserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_admin_user
     *
     * @mbg.generated Fri Mar 13 22:10:26 CST 2020
     */
    int updateByPrimaryKeySelective(AdminUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_admin_user
     *
     * @mbg.generated Fri Mar 13 22:10:26 CST 2020
     */
    int updateByPrimaryKey(AdminUser record);

    /**
     * 登录
     * @param userName  登录名
     * @param password  密码
     * @return
     */
    AdminUser login(@Param("userName") String userName, @Param("password") String password);
}