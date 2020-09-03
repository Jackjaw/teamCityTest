package com.tctest.order.service;

import com.tctest.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class OrderServiceTest {

    @Autowired
    OrderService orderService;

    @Test
    public void createOrder() {
        User user=new User();
        user.setUserId(123);
        user.setUserName("Tom");
        Assert.assertEquals(user.getUserId(),orderService.createOrder(user.getUserId(),123).getUserId());
    }
}