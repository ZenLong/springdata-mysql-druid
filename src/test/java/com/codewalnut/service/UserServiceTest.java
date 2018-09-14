package com.codewalnut.service;

import com.codewalnut.SpringdataMysqlDruidApplication;
import com.codewalnut.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * Created by KelvinZ on 2018-09-14 19:22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringdataMysqlDruidApplication.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void save() {
        User user = new User();
        user.setId("test");
        user.setMobile("1380000000");
        user.setCtime(new Date());
        userService.save(user);
    }
}
