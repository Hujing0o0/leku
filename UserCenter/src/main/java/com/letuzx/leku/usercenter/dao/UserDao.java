package com.letuzx.leku.usercenter.dao;

import com.letuzx.leku.usercenter.domain.po.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hu on 2017/4/21.
 */
@Repository
public interface UserDao extends JpaRepository<User,Integer> {
    public User findByUserAccount(String userAccount);
}
