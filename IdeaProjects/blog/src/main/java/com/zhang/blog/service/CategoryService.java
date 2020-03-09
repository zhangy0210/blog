package com.zhang.blog.service;

import com.zhang.blog.utils.PageQueryUtil;
import com.zhang.blog.utils.PageResult;
import com.zhang.blog.entity.BlogCategory;

import java.util.List;

public interface CategoryService {
    PageResult getBlogCategoryPage(PageQueryUtil pageUtil);

    int getTotalCategories();

    /**
     * 添加分类数据
     *
     * @param categoryName
     * @param categoryIcon
     * @return
     */
    Boolean saveCategory(String categoryName, String categoryIcon);

    Boolean updateCategory(Integer categoryId, String categoryName, String categoryIcon);

    Boolean deleteBatch(Integer[] ids);

    List<BlogCategory> getAllCategories();

    BlogCategory selectById(Integer id);
}
