package com.smart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * User: monkey
 * Date: 2018-06-12 12:03
 */
@SpringBootApplication
//启用注解事务管理
@EnableTransactionManagement
//支持MVC 需继承 SpringBootServletInitializer，然后重写configure方法
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        //开发调试时，如果是web应用，一定要用spring-boot-maven-plugin插件来运行，否则会出错
        SpringApplication.run(Application.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}
