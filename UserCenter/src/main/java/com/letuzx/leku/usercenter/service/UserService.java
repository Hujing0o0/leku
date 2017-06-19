package com.letuzx.leku.usercenter.service;

import com.letuzx.leku.usercenter.domain.po.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by hu on 2017/4/21.
 */
public interface UserService extends UserDetailsService {
    User findByUserAccount(String userAccount);
}
