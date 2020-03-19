package com.zhang.blog.dao;

import com.zhang.blog.entity.BlogTag;
import com.zhang.blog.utils.PageQueryUtil;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BlogTagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_blog_tag
     *
     * @mbg.generated Fri Mar 13 22:14:26 CST 2020
     */
    int deleteByPrimaryKey(Integer tagId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_blog_tag
     *
     * @mbg.generated Fri Mar 13 22:14:26 CST 2020
     */
    int insert(BlogTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_blog_tag
     *
     * @mbg.generated Fri Mar 13 22:14:26 CST 2020
     */
    int insertSelective(BlogTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_blog_tag
     *
     * @mbg.generated Fri Mar 13 22:14:26 CST 2020
     */
    BlogTag selectByPrimaryKey(Integer tagId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_blog_tag
     *
     * @mbg.generated Fri Mar 13 22:14:26 CST 2020
     */
    int updateByPrimaryKeySelective(BlogTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_blog_tag
     *
     * @mbg.generated Fri Mar 13 22:14:26 CST 2020
     */
    int updateByPrimaryKey(BlogTag record);

    BlogTag selectByTagName(String tagName);

    List<BlogTag> findTagList(PageQueryUtil pageUtil);

    int getTotalTags(PageQueryUtil pageUtil);

    int deleteBatch(Integer[] ids);

    int batchInsertBlogTag(List<BlogTag> tagList);
}