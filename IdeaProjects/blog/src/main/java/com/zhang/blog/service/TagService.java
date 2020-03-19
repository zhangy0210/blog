package com.zhang.blog.service;

import com.zhang.blog.utils.PageQueryUtil;
import com.zhang.blog.utils.PageResult;

public interface TagService {

    /**
     * 查询标签的分页数据
     *
     * @param pageUtil
     * @return
     */
    PageResult getBlogTagPage(PageQueryUtil pageUtil);

    Boolean saveTag(String tagName);

    Boolean deleteBatch(Integer[] ids);
}
