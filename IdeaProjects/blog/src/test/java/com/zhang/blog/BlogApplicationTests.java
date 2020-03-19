package com.zhang.blog;

import com.zhang.blog.dao.*;
import com.zhang.blog.entity.Blog;
import com.zhang.blog.entity.BlogCategory;
import com.zhang.blog.service.AdminUserService;
import com.zhang.blog.service.BlogService;
import com.zhang.blog.service.CategoryService;
import com.zhang.blog.service.TagService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class BlogApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private BlogCategoryMapper blogCategoryMapper;

    @Autowired
    private AdminUserMapper adminUserMapper;

    @Autowired
    private BlogTagMapper blogTagMapper;

    @Autowired
    private BlogTagRelationMapper blogTagRelationMapper;

    @Test
    void testDao(){
        System.out.println(blogCategoryMapper.selectByPrimaryKey(22));
        System.out.println(adminUserMapper.selectByPrimaryKey(1));
        System.out.println(blogTagMapper.selectByPrimaryKey(57));
        System.out.println(blogTagRelationMapper.selectByPrimaryKey(278L));
    }

    @Autowired
    private AdminUserService adminUserService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private TagService tagService;

    @Test
    void testAdminUserService(){
//        System.out.println(adminUserService.getAdminUserById(1));
//        System.out.println(adminUserService.login("admin", "456123"));
//        System.out.println(adminUserService.updateNickName(1, "admin", "张四"));

    }

    @Test
    void testCategoryService(){
//        System.out.println(categoryService.getAllCategories());
//        System.out.println(categoryService.getTotalCategories());
//        System.out.println(categoryService.updateCategory(25, "Test", "/admin/dist/img/category/12.png"));
        Integer[] a = {26, 27, 28};
        System.out.println(categoryService.deleteBatch(a));
//        System.out.println(categoryService.saveCategory("Test4", "/admin/dist/img/category/13.png"));
//        System.out.println(categoryService.selectById(20));
    }

    @Autowired
    BlogMapper blogMapper;
    @Test
    void testBlogMapper(){
        System.out.println(blogMapper.selectByPrimaryKey(1L));
    }
    @Autowired
    BlogService blogService;
    @Test
    void testBlogService(){
        Blog blog = new Blog();
        blog.setBlogCategoryId(20);
        blog.setBlogCategoryName("test");
        blog.setBlogContent("test content");
        blog.setBlogCoverImage("/admin/dist/img/rand/33.jpg");
        blog.setBlogId(5L);
        blog.setBlogStatus(new Byte("1"));
        blog.setIsDeleted(new Byte("1"));
        blog.setBlogSubUrl("test url");
        blog.setBlogTags("test tag");
        blog.setBlogTitle("test title");
        blog.setBlogViews(1L);
        blog.setCreateTime(new Date());
        blog.setEnableComment(new Byte("1"));
        blog.setUpdateTime(new Date());
        System.out.println(blogService.saveBlog(blog));
    }
}
