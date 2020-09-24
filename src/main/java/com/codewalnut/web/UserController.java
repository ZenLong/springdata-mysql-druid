package com.codewalnut.web;

import com.codewalnut.model.User;
import com.codewalnut.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Optional;

/**
 * 用户控制器
 *
 * @author KelvinZ
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

    @RequestMapping("/getByMobile")
    public User getUserByMobile(String mobile) {
        log.info("getUserByMobile({})", mobile);
        Optional<User> user = userService.findByMobile(mobile);
        return user.orElse(new User());
    }

    @RequestMapping("/findByCust")
    public Page<User> findByCust(String mobilePrefix) {
        return userService.findByCusomizedQuery(mobilePrefix);
    }

    @RequestMapping("/save")
    public User saveUser(String id, String mobile) {
        log.info("saveUser({}, {})", id, mobile);
        User user = new User();
        user.setId(id);
        user.setMobile(mobile);
        user.setCtime(new Date());
        User newUser = userService.save(user);
        return newUser;
    }

}
