package com.codewalnut.web;

import com.codewalnut.model.User;
import com.codewalnut.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Optional;

/**
 * 用户控制器
 *
 * @author KelvinZ
 * @date 2018-09-17 21:18
 */
@RestController
public class UserController {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    public User getUser(String id) {
        log.info("getUser({})", id);
        Optional<User> user = userService.findById(id);
        return user.orElse(new User());
    }

    @RequestMapping("/save")
    public User saveUser(String id, String mobile) {
        log.info("saveUser({}, {})", id, mobile);
        User user = new User();
        user.setId(id);
        user.setMobile(mobile);
        user.setCtime(new Date());
        userService.save(user);
        return user;
    }

}
