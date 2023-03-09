package com.shaluy;

import com.shaluy.properties.DataSourceProterties;
import com.shaluy.properties.DataSourceProterties2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EnableConfigurationProperties(DataSourceProterties2.class)
class SpringbootAutoApplicationTests {

    @Autowired
    private DataSourceProterties dataSourceProterties;

    @Autowired
    private DataSourceProterties2 dataSourceProterties2;

    @Test
    void testSpringBootProperties() {

        System.out.println("dataSourceProterties = " + dataSourceProterties);
        System.out.println("dataSourceProterties2 = " + dataSourceProterties2);
    }

}
