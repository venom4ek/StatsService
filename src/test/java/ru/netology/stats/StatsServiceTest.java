package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextParsingException;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    long[] monthlySum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldGetSum() {
        long expected = 180;
        assertEquals(expected, service.getSum(monthlySum));
    }

    @Test
    void shoukdGetAverageSum() {
        long expected = 15;
        assertEquals(expected, service.getAverageSum(monthlySum));
    }

    @Test
    void souldGetMaxMonthSale() {
        long expected = 8;
        assertEquals(expected, service.getMaxMonthSale(monthlySum));
    }

    @Test
    void getMinMonthSale() {
        long expected = 9;
        assertEquals(expected, service.getMinMonthSale(monthlySum));
    }

    @Test
    void getMonthCountLessAverage() {
        long expected = 5;
        assertEquals(expected, service.getMonthCountLessAverage(monthlySum));
    }

    @Test
    void getMonthCountMoreAverage() {
        long expected = 5;
        assertEquals(expected, service.getMonthCountMoreAverage(monthlySum));
    }

    @Test
    void shouldTest() {
        int[] expeted = {6, 8};
        assertArrayEquals(expeted, service.getMonthWithMaxSum(monthlySum));
    }
}