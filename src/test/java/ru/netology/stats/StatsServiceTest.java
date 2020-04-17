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



        long[][] calculate = service.calculateSales(monthlySum);

        long expectedSum = 180;
        assertEquals(expectedSum, calculate[0][0]);


        long expectedOverageSum = 15;
        assertEquals(expectedOverageSum, calculate[1][0]);


        long maxSale =8;
        assertEquals(maxSale, calculate[2][0]);


        long minSale = 9;
        assertEquals(minSale, calculate[3][0]);


   //     long[] minAverageMonthly = {1, 3, 9};
    //    assertEquals(minAverageMonthly, sum[4]);




    System.out.println(calculate[0][0] + " Общая сумма дохода за 12 месяцев");
    System.out.println(calculate[1][0] +" Средний сумма дохода за 12 месяцев");
    System.out.println(calculate[2][0] + " Месяц, в котором сумма максимальная");
    System.out.println(calculate[3][0] + " Месяц, в котором сумма минимальна");
    System.out.println(calculate[4][0] + " Месяц, в котором сумма продаж меньше средней");
    System.out.println(calculate[4][1] + " Месяц, в котором сумма продаж меньше средней");
    System.out.println(calculate[4][2] + " Месяц, в котором сумма продаж меньше средней");
    System.out.println(calculate[4][3] + " Месяц, в котором сумма продаж меньше средней");

}

}