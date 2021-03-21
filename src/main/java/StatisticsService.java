public class StatisticsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
        }
        return sum;
    }

    public long calculateMedSum(long[] purchases) {
        long medSum = calculateSum(purchases) / 12;

        return medSum;
    }

    public long findMax(long[] purchases) {
        int month = 0;
        long currentMax = purchases[month];

        for (int i = 1; i < purchases.length; i++) {
            if (currentMax <= purchases[i]){
                month = i;
                currentMax = purchases[i];
            }
        }
        return month + 1;
    }

    public long findMin(long[] purchases) {
        int month = 0;
        long currentMin = purchases[month];

        for (int i = 1; i < purchases.length; i++) {
            if (currentMin >= purchases[i]){
                month = i;
                currentMin = purchases[i];
            }
        }
        return month + 1;
    }

    public long findMonthsMin(long[] purchases){
        long medSum = calculateMedSum(purchases);//17
        int monthCount = 0;
        for (long purchase : purchases) {
            if (purchase < medSum){
                monthCount++;
            }
        }
        return monthCount;
    }

    public long findMonthsMax(long[] purchases) {
        long medSum = calculateMedSum(purchases);
        int monthCount = 0;
        for (long purchase : purchases){
            if (purchase > medSum){
                monthCount++;
            }
        }
        return monthCount;
    }
}