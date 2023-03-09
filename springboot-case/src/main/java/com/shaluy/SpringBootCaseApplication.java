package com.shaluy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.shaluy.dao") //扫描Mapper接口
@EnableTransactionManagement //开启事务注解支持
public class SpringBootCaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCaseApplication.class, args);
    }

}
