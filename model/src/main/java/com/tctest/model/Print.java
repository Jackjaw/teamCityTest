package com.tctest.model;


public class Print {
    public String print(){
        User user=new User();
        user.setUserId(123);
        user.setUserName("jackjaw");
        System.out.println(user.getUserName());
        return user.getUserName();
    }
}
