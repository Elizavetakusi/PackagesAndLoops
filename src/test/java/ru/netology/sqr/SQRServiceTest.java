package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void testIfFewSquaresFound() {
        SQRService service = new SQRService();
        int actual = service.calc(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIfSquaresNotFound() {
        SQRService service = new SQRService();
        int actual = service.calc(10, 99);
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testIfOneSquareFound() {
        SQRService service = new SQRService();
        int actual = service.calc(100, 120);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIfMin_Range_Limit_IsGreater_Than_Maximum() {
        SQRService service = new SQRService();
        int actual = service.calc(600, 200);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIfMinAndMax_ValuesOfTheRangeAreTheSameAnd_ExpectedCountPlan_0() {
        SQRService service = new SQRService();
        int actual = service.calc(300, 300);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIfMinAndMax_ValuesOfTheRangeAreTheSameAnd_ExpectedCountPlan_1() {
        SQRService service = new SQRService();
        int actual = service.calc(100, 100);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

}
