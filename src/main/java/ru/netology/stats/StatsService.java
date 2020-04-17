package ru.netology.stats;


//import java.sql.Struct;

public class StatsService {

    public long[] calculateSales(long[] monthlySum) {
// расчитываем общую сумму продаж
        long sum = 0;
        for (long monthSum : monthlySum) {
            sum += monthSum;
        }


//Расчитываем среднюю сумму продаж
        long overageSum = sum / monthlySum.length;


//Вычисляем месяц в котором была максимальная продажа
        long maxSales = monthlySum[0];
        int maxMonthSale = 0;
        for (int i = 0; i < monthlySum.length; i++) {
            if (maxSales <= monthlySum[i]) {
                maxSales = monthlySum[i];
                maxMonthSale = i + 1;
            }
        }


/*        long
        for (long maxSale : monthlySum) {
            if (maxSales <= maxSale) {
                maxSales = maxSale;
            }
        }
*/

//Вычисляем месяц в котором была минимальная продажа
        long minSales = monthlySum[0];
        int minMonthSale = 0;
        for (int j = 0; j < monthlySum.length; j++) {
            if (minSales > monthlySum[j]) {
                minSales = monthlySum[j];
                minMonthSale = j + 1;
            }
        }


//Вычисляем месяцы в которых сумма продаж была меньше среднего
        long minAverageMonthlySales = monthlySum[0];
        int minAverageMonths = 0;
        for (int i = 0; i < monthlySum.length; i++) {
            if (overageSum < monthlySum[i]) {
                
            }
        }


            return new long[]{sum, overageSum, maxMonthSale, minMonthSale};
    }
}
