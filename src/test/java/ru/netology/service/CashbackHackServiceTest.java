package ru.netology.service;

import org.testng.Assert;


public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testInsert() {
        CashbackHackService service = new CashbackHackService();
        int expected1 = 990;
        Assert.assertEquals(expected1, service.remain(8));
        int expected2 = 1010;
        Assert.assertEquals(expected2, service.remain(-8));
        int expected3 = 1000;
        Assert.assertEquals(expected3, service.remain(0));

    }
}








