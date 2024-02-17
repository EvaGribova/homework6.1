package ru.netology.stats;

public class StatsService {

    public int getAmountSales(long[] sales) {
        int amountSales = 0;

        for (long i : sales) {
            amountSales = (int) (amountSales + i);
        }
        return amountSales;
    }

    public int getAverageAmount(long[] sales) {
        int amountSales = 0;

        for (long i : sales) {
            amountSales = (int) (amountSales + i);
        }

        int averageAmount = amountSales / sales.length;
        return averageAmount;
    }

    public int getMaxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int getMinSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int getSalesBelowAverage(long[] sales) {
        int averageSales = 15;
        int count = 0;

        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] < averageSales) {
                count++;
            }
        }
        return count;
    }

    public int getSalesUnderAverage(long[] sales) {
        int averageSales = 15;
        int count = 0;

        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] > averageSales) {
                count++;
            }
        }
        return count;
    }

}
