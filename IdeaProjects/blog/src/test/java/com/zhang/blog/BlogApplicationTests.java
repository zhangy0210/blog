package com.zhang.blog;

import com.zhang.blog.dao.BlogCategoryMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class BlogApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private BlogCategoryMapper blogCategoryMapper;

    @Test
    void testSelectByPrimaryKey(){
        System.out.println(blogCategoryMapper.selectByPrimaryKey(22));
    }

    @Test
    void testSelectByCategoryName(){
        System.out.println(blogCategoryMapper.selectByCategoryName("About"));
    }

}
