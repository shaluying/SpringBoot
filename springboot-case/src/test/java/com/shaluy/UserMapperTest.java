package com.shaluy;

import com.shaluy.dao.UserMapper;
import com.shaluy.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    /**
     * 测试查询所有
     */
    @Test
    public void testSelectAll(){
        List<User> users = userMapper.selectAll();

        for (User user : users) {
            System.out.println("user = " + user);
        }
    }

}
