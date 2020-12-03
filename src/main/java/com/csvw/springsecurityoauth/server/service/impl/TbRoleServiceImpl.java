package com.csvw.springsecurityoauth.server.service.impl;

import com.csvw.springsecurityoauth.server.mapper.TbRoleMapper;
import com.csvw.springsecurityoauth.server.service.TbRoleService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @author lk
 */
@Service
public class TbRoleServiceImpl implements TbRoleService {

    @Resource
    private TbRoleMapper tbRoleMapper;

}
