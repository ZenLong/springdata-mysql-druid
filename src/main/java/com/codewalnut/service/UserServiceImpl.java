package com.codewalnut.service;

import com.alibaba.druid.support.json.JSONUtils;
import com.codewalnut.dao.UserDao;
import com.codewalnut.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * 用户服务默认实现类
 *
 * @author KelvinZ
 */
@Service
public class UserServiceImpl implements UserService {
    private final static Logger log = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserDao userDao;

    @Override
    public User save(User user) {
        Optional<User> dbUser = userDao.findById(user.getId());
        if (dbUser.isPresent()) {
            log.info("User {} exists", user.getId());
            user.setCtime(dbUser.get().getCtime());
        }
        return userDao.save(user);
    }

    @Override
    public Optional<User> findById(String id) {
        return userDao.findById(id);
    }

    @Override
    public Optional<User> findByMobile(String mobile) {
        return userDao.findByMobile(mobile);
    }

    @Override
    public Page<User> findByCusomizedQuery(String mobilePrefix) {
        Pageable pageable = PageRequest.of(0, 10);
        return userDao.findByCustomizedQuery(mobilePrefix, pageable);
    }

}
