package com.tctest.model;

import lombok.Data;

import java.util.Date;


@Data
public class Order {
    private int orderId;
    private int typeId;
    private Date createdDate;
    private int status;
    private int userId;
}
