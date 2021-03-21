import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
    @Test
    void calculateSum() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void calculateMedSum() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.calculateMedSum(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.findMax(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void findMin() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.findMin(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void findMonthsMin() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.findMonthsMin(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void findMonthsMax() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.findMonthsMax(purchases);

        assertEquals(expected, actual);
    }
}
