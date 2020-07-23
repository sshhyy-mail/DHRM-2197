package com.kingland.dhrm2197.service.impl;

import com.kingland.dhrm2197.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    Logger logger = LoggerFactory.getLogger(getClass());

    private final UserMapper userMapper;

    public UserDetailsServiceImpl(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.info("username : " + username);
        com.kingland.dhrm2197.entity.User k_user = userMapper.getUser(username);
        if(k_user != null){
            List<GrantedAuthority> authorities=new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority("ROLE_" + k_user.getRole()));
            return new User(k_user.getUsername(), k_user.getPassword(), authorities);
        }

        throw new UsernameNotFoundException("User : "+ username+ "not found");
    }
}
