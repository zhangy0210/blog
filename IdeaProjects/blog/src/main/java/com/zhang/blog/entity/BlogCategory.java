package com.zhang.blog.entity;

import java.util.Date;

public class BlogCategory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_blog_category.category_id
     *
     * @mbg.generated Mon Mar 09 18:51:08 CST 2020
     */
    private Integer categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_blog_category.category_name
     *
     * @mbg.generated Mon Mar 09 18:51:08 CST 2020
     */
    private String categoryName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_blog_category.category_icon
     *
     * @mbg.generated Mon Mar 09 18:51:08 CST 2020
     */
    private String categoryIcon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_blog_category.category_rank
     *
     * @mbg.generated Mon Mar 09 18:51:08 CST 2020
     */
    private Integer categoryRank;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_blog_category.is_deleted
     *
     * @mbg.generated Mon Mar 09 18:51:08 CST 2020
     */
    private Byte isDeleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_blog_category.create_time
     *
     * @mbg.generated Mon Mar 09 18:51:08 CST 2020
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_blog_category.category_id
     *
     * @return the value of tb_blog_category.category_id
     *
     * @mbg.generated Mon Mar 09 18:51:08 CST 2020
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_blog_category.category_id
     *
     * @param categoryId the value for tb_blog_category.category_id
     *
     * @mbg.generated Mon Mar 09 18:51:08 CST 2020
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_blog_category.category_name
     *
     * @return the value of tb_blog_category.category_name
     *
     * @mbg.generated Mon Mar 09 18:51:08 CST 2020
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_blog_category.category_name
     *
     * @param categoryName the value for tb_blog_category.category_name
     *
     * @mbg.generated Mon Mar 09 18:51:08 CST 2020
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_blog_category.category_icon
     *
     * @return the value of tb_blog_category.category_icon
     *
     * @mbg.generated Mon Mar 09 18:51:08 CST 2020
     */
    public String getCategoryIcon() {
        return categoryIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_blog_category.category_icon
     *
     * @param categoryIcon the value for tb_blog_category.category_icon
     *
     * @mbg.generated Mon Mar 09 18:51:08 CST 2020
     */
    public void setCategoryIcon(String categoryIcon) {
        this.categoryIcon = categoryIcon == null ? null : categoryIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_blog_category.category_rank
     *
     * @return the value of tb_blog_category.category_rank
     *
     * @mbg.generated Mon Mar 09 18:51:08 CST 2020
     */
    public Integer getCategoryRank() {
        return categoryRank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_blog_category.category_rank
     *
     * @param categoryRank the value for tb_blog_category.category_rank
     *
     * @mbg.generated Mon Mar 09 18:51:08 CST 2020
     */
    public void setCategoryRank(Integer categoryRank) {
        this.categoryRank = categoryRank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_blog_category.is_deleted
     *
     * @return the value of tb_blog_category.is_deleted
     *
     * @mbg.generated Mon Mar 09 18:51:08 CST 2020
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_blog_category.is_deleted
     *
     * @param isDeleted the value for tb_blog_category.is_deleted
     *
     * @mbg.generated Mon Mar 09 18:51:08 CST 2020
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_blog_category.create_time
     *
     * @return the value of tb_blog_category.create_time
     *
     * @mbg.generated Mon Mar 09 18:51:08 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_blog_category.create_time
     *
     * @param createTime the value for tb_blog_category.create_time
     *
     * @mbg.generated Mon Mar 09 18:51:08 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "BlogCategory{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryIcon='" + categoryIcon + '\'' +
                ", categoryRank=" + categoryRank +
                ", isDeleted=" + isDeleted +
                ", createTime=" + createTime +
                '}';
    }
}