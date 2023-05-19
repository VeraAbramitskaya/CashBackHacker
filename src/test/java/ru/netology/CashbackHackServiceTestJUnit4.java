package ru.netology;

public class CashbackHackServiceTestJUnit4 {


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


}
