package ru.netology.service;

import org.junit.*;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemain() {
        int amount = 1400;
        int actual = service.remain(amount);
        int expected = 600;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainZero() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}