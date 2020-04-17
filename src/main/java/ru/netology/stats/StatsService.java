package ru.netology.stats;

public class StatsService {

    public long getSum(long[] monthlySum) {
        long sum = 0;
        for (long monthSum : monthlySum) {
            sum += monthSum;
        }
        return sum;
    }

    public long getAverageSum(long[] monthlySum) {
        long sum = getSum(monthlySum);
        return sum / monthlySum.length;
    }

    public int getMaxMonthSale(long[] monthlySum) {
        long maxSales = monthlySum[0];
        int maxMonthSale = 0;
        for (int i = 0; i < monthlySum.length; i++) {
            if (maxSales <= monthlySum[i]) {
                maxSales = monthlySum[i];
                maxMonthSale = i + 1;
            }
        }
        return maxMonthSale;
    }

    public int getMinMonthSale(long[] monthlySum) {
        long minSales = monthlySum[0];
        int minMonthSale = 0;
        for (int i = 0; i < monthlySum.length; i++) {
            if (minSales >= monthlySum[i]) {
                minSales = monthlySum[i];
                minMonthSale = i + 1;
            }
        }
        return minMonthSale;
    }


    public long getMonthCountLessAverage(long[] monthlySum) {
        long averageSum = getAverageSum(monthlySum);
        int result = 0;

        for (long sum : monthlySum) {
            if (sum < averageSum) {
                result++;
            }
        }

        return result;
    }

    public long getMonthCountMoreAverage(long[] monthlySum) {
        long averageSum = getAverageSum(monthlySum);
        int result = 0;

        for (long sum : monthlySum) {
            if (sum > averageSum) {
                result++;
            }
        }
        return result;
    }

    public long getMaxSum(long[] monthlySum) {
        long maxSum = monthlySum[0];
        for (long sum : monthlySum) {
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }


    public int[] getMonthWithMaxSum(long[] monthlySum) {
        int[] result = new int[0];
        long maxSum = getMaxSum(monthlySum);
        int month = 1;
        for (long sum : monthlySum) {
            if (sum == maxSum) {
                int[] temp = new int[result.length + 1];
                System.arraycopy(result, 0, temp, 0, result.length);
                temp[temp.length - 1] = month;
                result = temp;
            }
            month++;
        }
        return result;
    }
}

