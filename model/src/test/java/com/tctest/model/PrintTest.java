package com.tctest.model;

import org.junit.Assert;
import org.junit.Test;

public class PrintTest {

    @Test
    public void print() {
        Print print=new Print();
        Assert.assertEquals("jackjaw",print.print());
    }
}