package com.codewalnut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * 项目启动类
 *
 * @author KelvinZ
 * @date 2018-09-14 19:12.
 */
@SpringBootApplication
@PropertySources(value = {@PropertySource(value = "${config.folder}application-druid.properties")})
public class SpringdataMysqlDruidApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringdataMysqlDruidApplication.class, args);
    }
}
