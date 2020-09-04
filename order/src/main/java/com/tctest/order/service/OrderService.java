package com.tctest.order.service;

import com.tctest.model.Order;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderService {
    public Order createOrder(int userId,int typeId){
        Order order=new Order();
        order.setUserId(userId);
        order.setCreatedDate(new Date());
        order.setOrderId(userId*100+typeId);
        order.setTypeId(typeId);
        order.setStatus(1);
        return order;
    }
}
