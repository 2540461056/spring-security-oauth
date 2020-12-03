package com.csvw.springsecurityoauth.server.service;

import com.csvw.springsecurityoauth.server.domain.TbPermission;

import java.util.List;

/**
 * @author lk
 */
public interface TbPermissionService {
    default List<TbPermission> selectByUserId(Long userId) {
        return null;
    }
}
