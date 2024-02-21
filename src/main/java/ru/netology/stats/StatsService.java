package ru.netology.stats;

public class StatsService {

    public long getAmountSales(long[] sales) {
        long amountSales = 0;

        for (long i : sales) {
            amountSales = (amountSales + i);
        }
        return amountSales;
    }

    public long getAverageAmount(long[] sales) {
        long amountSales = 0;

        for (long i : sales) {
            amountSales = (amountSales + i);
        }

        long averageAmount = amountSales / sales.length;
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
        int count = 0;
        long amountSales = 0;

        for (long i : sales) {
            amountSales = (amountSales + i);
        }

        long averageAmount = amountSales / sales.length;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmount) {
                count++;
            }
        }
        return count;
    }

    public int getSalesUnderAverage(long[] sales) {
        int count = 0;
        long amountSales = 0;

        for (long i : sales) {
            amountSales = (amountSales + i);
        }

        long averageAmount = amountSales / sales.length;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmount) {
                count++;
            }
        }
        return count;
    }

}
