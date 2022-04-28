package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2500;
        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(actual,expected);

    }
    @org.testng.annotations.Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(actual,expected);

    }
    @org.testng.annotations.Test
    public void testRemain3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual,expected);

    }
    @org.testng.annotations.Test
    public void testRemain4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(actual,expected);

    }
}