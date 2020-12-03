package com.csvw.springsecurityoauth.server.service.impl;

import com.csvw.springsecurityoauth.server.domain.TbUser;
import com.csvw.springsecurityoauth.server.mapper.TbUserMapper;
import com.csvw.springsecurityoauth.server.service.TbUserService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

/**
 * @author lk
 */
@Service
public class TbUserServiceImpl implements TbUserService {

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getByUsername(String username) {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username", username);
        return tbUserMapper.selectOneByExample(example);
    }
}
