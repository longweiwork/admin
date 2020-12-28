package com.lw.admin.service;


import com.lw.admin.dto.UmsPermissionNode;
import com.lw.admin.model.UmsPermission;

import java.util.List;

/**
 * 后台用户权限管理Service
 *
 * @Author: Brian
 * @Date: 2020/12/28 15:42
 */
public interface UmsPermissionService {
    /**
     * 添加权限
     */
    int create(UmsPermission permission);

    /**
     * 修改权限
     */
    int update(Long id, UmsPermission permission);

    /**
     * 批量删除权限
     */
    int delete(List<Long> ids);

    /**
     * 以层级结构返回所有权限
     */
    List<UmsPermissionNode> treeList();

    /**
     * 获取所有权限
     */
    List<UmsPermission> list();
}
