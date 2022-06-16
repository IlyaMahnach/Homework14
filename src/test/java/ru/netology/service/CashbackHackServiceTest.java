package ru.netology.service;


import static org.testng.AssertJUnit.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void remainTest1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
        System.out.println("Dlya polucheniya bonusa dokupitye na " + service.remain(amount) + " rubley");
    }

    @org.testng.annotations.Test
    public void remainTest2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
        System.out.println("Dlya polucheniya bonusa dokupitye na " + service.remain(amount) + " rubley");
    }

    @org.testng.annotations.Test
    public void remainTest3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
        System.out.println("Dlya polucheniya bonusa dokupitye na " + service.remain(amount) + " rubley");
    }
}
