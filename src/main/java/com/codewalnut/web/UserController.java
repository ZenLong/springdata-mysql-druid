package com.codewalnut.web;

import com.codewalnut.model.User;
import com.codewalnut.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 用户控制器
 *
 * @author KelvinZ
 * @date 2018-09-17 21:18
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    public User getUser(String id) {
        return userService.findById(id).get();
    }

    @RequestMapping("/save")
    public User saveUser(String id, String mobile) {
        User user = new User();
        user.setId(id);
        user.setMobile(mobile);
        user.setCtime(new Date());
        userService.save(user);
        return user;
    }

}
