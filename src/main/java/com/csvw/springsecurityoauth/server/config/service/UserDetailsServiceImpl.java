package com.csvw.springsecurityoauth.server.config.service;

import com.csvw.springsecurityoauth.server.domain.TbPermission;
import com.csvw.springsecurityoauth.server.domain.TbUser;
import com.csvw.springsecurityoauth.server.service.TbPermissionService;
import com.csvw.springsecurityoauth.server.service.TbUserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.assertj.core.util.Lists;
import java.util.List;

/**
 * @author lk
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private TbUserService tbUserService;

    @Autowired
    private TbPermissionService tbPermissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TbUser tbUser = tbUserService.getByUsername(username);
        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        if (tbUser!=null){
            List<TbPermission> tbPermissions = tbPermissionService.selectByUserId(tbUser.getId());
            tbPermissions.forEach(tbPermission -> {
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                grantedAuthorities.add(grantedAuthority);
            });
        }
        assert tbUser != null;
        return new User(tbUser.getUsername(),tbUser.getPassword(),grantedAuthorities);
    }
}
