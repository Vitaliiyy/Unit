package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void returnBonus(){
        CashbackHackService  hackService = new CashbackHackService();
        int amount = 1000;

        int actual = hackService.remain(999);
        int expected = 1;

        assertEquals(expected, actual);
    }

}