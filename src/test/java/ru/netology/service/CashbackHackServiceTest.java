package ru.netology.service;

import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService ();

    @Test
    public void shouldCashBackPlus() {
        assertEquals(service.remain(900), 100);
    }

    @Test
    public void shouldCashBackBoundaryMoreThan1000() {
        assertEquals(service.remain(1001), 999);
    }

    @Test
    public void shouldCashBackBoundaryLessThan1000() {
        assertEquals(service.remain(999), 1);
    }
    @Test
    public void shouldCashBackBoundary1() {
        assertEquals(service.remain(1), 999);
    }

    @Test
    public void shouldCashBack1000IfZero() {
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldCashBackNoMore() {
        assertEquals(service.remain(1000), 0);
    }
}

