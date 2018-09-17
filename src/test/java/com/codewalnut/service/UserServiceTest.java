package com.codewalnut.service;

import com.codewalnut.SpringdataMysqlDruidApplication;
import com.codewalnut.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * 用户服务测试类
 *
 * @author KelvinZ
 * @date 2018-09-14 19:22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringdataMysqlDruidApplication.class)
public class UserServiceTest {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @Test
    public void save() {
        log.info("UserServiceTest.save()");
        User user = new User();
        user.setId("test");
        user.setMobile("1380000000");
        user.setCtime(new Date());
        userService.save(user);
    }
}
