package com.lw.admin.service;


import com.lw.admin.model.UmsResourceCategory;

import java.util.List;

/**
 * 后台资源分类管理Service
 *
 * @Author: Brian
 * @Date: 2020/12/28 15:42
 */
public interface UmsResourceCategoryService {

    /**
     * 获取所有资源分类
     */
    List<UmsResourceCategory> listAll();

    /**
     * 创建资源分类
     */
    int create(UmsResourceCategory umsResourceCategory);

    /**
     * 修改资源分类
     */
    int update(Long id, UmsResourceCategory umsResourceCategory);

    /**
     * 删除资源分类
     */
    int delete(Long id);
}
