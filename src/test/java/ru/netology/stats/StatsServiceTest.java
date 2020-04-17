package ru.netology.stats;

import com.sun.security.jgss.GSSUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

@Test
    void calculateSales(){
        StatsService service = new StatsService();

        long[] monthlySum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};



        long[] sum = service.calculateSales(monthlySum);

        long expectedSum = 180;
        assertEquals(expectedSum, sum[0]);


        long expectedOverageSum = 15;
        assertEquals(expectedOverageSum, sum[1]);


        long maxSale =8;
        assertEquals(maxSale, sum[2]);


        long minSale = 9;
        assertEquals(minSale, sum[3]);


        long[] minAverageMonthly = {1, 3, 9};
        assertEquals(minAverageMonthly, sum[4]);




    System.out.println(sum[0] + " Общая сумма дохода за 12 месяцев");
    System.out.println(sum[1] +" Средний сумма дохода за 12 месяцев");
    System.out.println(sum[2] + " Месяц, в котором сумма максимальная");
    System.out.println(sum[3] + " Месяц, в котором сумма минимальна");
 //   System.out.println(sum[4]);
    }

}