package ru.netology;

public class CashbackHackServiceTest {


    @org.junit.Test

    public void testRemain500() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 500;
        int expected = 500;
        int actual = cashbackHackService.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test

    public void testRemainZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test

    public void testRemainWhenAmountExceedsBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1500;
        int expected = 500;
        int actual = cashbackHackService.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test

    public void testRemain500_jupiter() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 500;
        int expected = 500;
        int actual = cashbackHackService.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test

    public void testRemainZero_jupiter() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test

    public void testRemainWhenAmountExceedsBoundary_jupiter() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1500;
        int expected = 500;
        int actual = cashbackHackService.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }


}
