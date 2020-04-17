package ru.netology.stats;


//import java.sql.Struct;

public class StatsService {

    public long[][] calculateSales(long[] monthlySum) {
// расчитываем общую сумму продаж
        long sum = 0;
        for (long monthSum : monthlySum) {
            sum += monthSum;
        }


//Расчитываем среднюю сумму продаж
        long averageSum = sum / monthlySum.length;


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
        int minAverageMonths = 0;
        for (int i = 0; i < monthlySum.length; i++) {
            if (monthlySum[i] > averageSum)
                minAverageMonths++;
        }
        long result[] = new long[minAverageMonths];
        int j = 0;

        for (int i = 0; i < monthlySum.length; i++) {
            if (monthlySum[i] < averageSum) {
                result[j] = monthlySum[i];
                j++;
            }

                long indices[] = result[0];
                String minAverageMonthSale = ", ";
                for (int g = 0; g < indices.length; g++) {
                    minAverageMonthSale += indices[g] + ", ";
                }

                System.out.println(minAverageMonths + " месяцы с суммами меньше среднего");


      /*          long minAverageMonthSale[] = result[];
                String minAverageMonthSaleStr = "";
                for (int g = 0; g < minAverageMonthSale.length; g++) {
                    minAverageMonthSaleStr += minAverageMonthSale[g] + ", ";
                }*/





//Вычисляем месяцы в которых сумма продаж была больше среднего
/*        int minAverageMonths = 0;

        for (int i = 0; i < monthlySum.length; i++) {
            if (monthlySum[i] < averageSum)
                minAverageMonths++;
        }
        long minAverageMonthSale[] = new long[minAverageMonths];
        int j = 0;
        for (int i = 0; i < monthlySum.length; i++) {
            if (monthlySum[i] < averageSum) {
                minAverageMonthSale[j] = monthlySum[i]+1;
                j++;
            }
        }
*/

        return new long[][]{{sum}, {averageSum}, {maxMonthSale}, {minMonthSale}, result};
    }
}
