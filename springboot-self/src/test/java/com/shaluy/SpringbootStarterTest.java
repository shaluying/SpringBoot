package com.shaluy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootApplication
public class SpringbootStarterTest {


    @Autowired
    private DataSource dataSource;

    @Test
    public void testSpringbootStarter(){
        //让其加载SpringbootStarterTest类，以扫描到@SpringBootApplication注解
        SpringApplication.run(SpringbootStarterTest.class);

        System.out.println("dataSource = " + dataSource);
    }
}
