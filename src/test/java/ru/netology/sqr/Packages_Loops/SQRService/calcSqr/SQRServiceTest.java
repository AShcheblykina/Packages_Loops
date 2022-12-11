package ru.netology.sqr.Packages_Loops.SQRService.calcSqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqr(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcUnit() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calcSqr(200, 250);


        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalcNull() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqr(200, 200);

        Assertions.assertEquals(expected, actual);

    }
}




