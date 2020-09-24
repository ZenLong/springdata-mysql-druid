package com.codewalnut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * 项目启动类
 *
 * @author KelvinZ
 */
@SpringBootApplication
@PropertySources(value = {@PropertySource(value = "classpath:application-druid-${spring.profiles.active}.properties")})
public class SpringdataMysqlDruidApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringdataMysqlDruidApplication.class, args);
    }
}
