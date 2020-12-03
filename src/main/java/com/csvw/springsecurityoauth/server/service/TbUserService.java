package com.csvw.springsecurityoauth.server.service;

import com.csvw.springsecurityoauth.server.domain.TbUser;

/**
 * @author lk
 */
public interface TbUserService {
    default TbUser getByUsername(String username) {
        return null;
    }
}