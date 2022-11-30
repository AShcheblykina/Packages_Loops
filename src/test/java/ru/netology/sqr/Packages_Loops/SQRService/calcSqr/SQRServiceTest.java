package ru.netology.sqr.Packages_Loops.SQRService.calcSqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();
        int expected = 20;
        int actual = service.calcSqr(400);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcInexact() {
        SQRService service = new SQRService();
        int expected = 21;
        int actual = service.calcSqr(441);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcexac() {
        SQRService service = new SQRService();
        int expected = 22;
        int actual = service.calcSqr(484);

        Assertions.assertEquals(expected, actual);
    }
}
