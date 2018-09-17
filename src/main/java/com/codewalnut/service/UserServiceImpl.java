package com.codewalnut.service;

import com.codewalnut.dao.UserDao;
import com.codewalnut.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * 用户服务默认实现类
 *
 * @author KelvinZ
 * @date 2018-09-14 19:13.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public Optional<User> findById(String id) {
        return userDao.findById(id);
    }

}
