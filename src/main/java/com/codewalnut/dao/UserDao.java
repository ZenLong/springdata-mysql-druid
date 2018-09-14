package com.codewalnut.dao;

import com.codewalnut.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by KelvinZ on 2018-09-14 19:11.
 */
public interface UserDao extends JpaRepository<User, String> {
}
