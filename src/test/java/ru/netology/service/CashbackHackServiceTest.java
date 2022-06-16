package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remainTest1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
        System.out.println("Dlya polucheniya bonusa dokupitye na " + service.remain(amount) + " rubley");
    }
    
     @Test
    void remainTest2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
        System.out.println("Dlya polucheniya bonusa dokupitye na " + service.remain(amount) + " rubley");
    }
    
     @Test
    void remainTest3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
        System.out.println("Dlya polucheniya bonusa dokupitye na " + service.remain(amount) + " rubley");
    }
}
