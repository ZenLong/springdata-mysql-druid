package com.codewalnut.service;

import com.codewalnut.model.User;

import java.util.Optional;

/**
 * Created by KelvinZ on 2018-09-14 19:12.
 */
public interface UserService {

    User save(User user);

    Optional<User> findById(String id);

}
