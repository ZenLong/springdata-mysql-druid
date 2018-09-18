package com.codewalnut.dao;

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
 * 类描述：
 *
 * @author KelvinZ
 * @date 2018-09-18 21:10
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringdataMysqlDruidApplication.class)
public class UserDaoTest {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;

    @Test
    public void testSave() {
        log.info("UserDaoTest.save()");
        User user = new User();
        user.setId("test");
        user.setMobile("1380000000");
        user.setCtime(new Date());
        userDao.save(user);
    }
}
