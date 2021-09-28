package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'shouldEnumerateRootFrom666to999', 666, 999, 6"})
    void shouldEnumerateRootFrom10to99Squares(String testname, int lowLimit, int upLimit, int expected) {
        SQRService service = new SQRService();
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
        int actual = service.rootEnumerate(lowLimit, upLimit);

        assertEquals(expected, actual);
    }

    @Test
    void shouldEnumerateRootsFromMinus154to0() {
        SQRService service = new SQRService();
        int lowLimit = -154;
        int upLimit = 0;
        int expected = 0;
        int actual = service.rootEnumerate(lowLimit, upLimit);

        assertEquals(expected, actual);
    }
}