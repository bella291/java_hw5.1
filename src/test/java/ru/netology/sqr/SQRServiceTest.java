package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldEnumerateRootsFrom4000to8000() {
        SQRService service = new SQRService();
        int lowLimit = 4000;
        int upLimit = 8000;
        int expected = 26;
        int actual = service.rootEnumerate(lowLimit, upLimit);

        assertEquals(expected, actual);
    }

        @Test
        void shouldEnumerateRootsFrom500to900() {
            SQRService service = new SQRService();
            int lowLimit = 500;
            int upLimit = 900;
            int expected = 8;
            int actual = service.rootEnumerate(lowLimit, upLimit);

            assertEquals(expected, actual);
        }


    @Test
    void shouldEnumerateRootsFrom1547to6894() {
        SQRService service = new SQRService();
        int lowLimit = 1547;
        int upLimit = 4894;
        int expected = 30;
        int actual= service.rootEnumerate(lowLimit, upLimit);

        assertEquals(expected, actual);
    }
}