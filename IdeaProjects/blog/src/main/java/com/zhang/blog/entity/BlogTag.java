package com.zhang.blog.entity;

import java.util.Date;

public class BlogTag {
    @Override
    public String toString() {
        return "BlogTag{" +
                "tagId=" + tagId +
                ", tagName='" + tagName + '\'' +
                ", isDeleted=" + isDeleted +
                ", createTime=" + createTime +
                '}';
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_blog_tag.tag_id
     *
     * @mbg.generated Fri Mar 13 22:14:26 CST 2020
     */
    private Integer tagId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_blog_tag.tag_name
     *
     * @mbg.generated Fri Mar 13 22:14:26 CST 2020
     */
    private String tagName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_blog_tag.is_deleted
     *
     * @mbg.generated Fri Mar 13 22:14:26 CST 2020
     */
    private Byte isDeleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_blog_tag.create_time
     *
     * @mbg.generated Fri Mar 13 22:14:26 CST 2020
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_blog_tag.tag_id
     *
     * @return the value of tb_blog_tag.tag_id
     *
     * @mbg.generated Fri Mar 13 22:14:26 CST 2020
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_blog_tag.tag_id
     *
     * @param tagId the value for tb_blog_tag.tag_id
     *
     * @mbg.generated Fri Mar 13 22:14:26 CST 2020
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_blog_tag.tag_name
     *
     * @return the value of tb_blog_tag.tag_name
     *
     * @mbg.generated Fri Mar 13 22:14:26 CST 2020
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_blog_tag.tag_name
     *
     * @param tagName the value for tb_blog_tag.tag_name
     *
     * @mbg.generated Fri Mar 13 22:14:26 CST 2020
     */
    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_blog_tag.is_deleted
     *
     * @return the value of tb_blog_tag.is_deleted
     *
     * @mbg.generated Fri Mar 13 22:14:26 CST 2020
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_blog_tag.is_deleted
     *
     * @param isDeleted the value for tb_blog_tag.is_deleted
     *
     * @mbg.generated Fri Mar 13 22:14:26 CST 2020
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_blog_tag.create_time
     *
     * @return the value of tb_blog_tag.create_time
     *
     * @mbg.generated Fri Mar 13 22:14:26 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_blog_tag.create_time
     *
     * @param createTime the value for tb_blog_tag.create_time
     *
     * @mbg.generated Fri Mar 13 22:14:26 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}