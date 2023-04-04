package ru.netology.HomeWork6.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQRServiceTest {

    @Test
    public void shouldSqrNumber() {
        SQRService service = new SQRService();

        int min = 200;
        int max = 300;
        int expected = 3;
        int actual = service.sqrNumber(min, max);

        Assertions.assertEquals(expected, actual);
    }
}