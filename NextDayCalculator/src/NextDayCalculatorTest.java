import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    @DisplayName("case 1/1/2021")
    void testGetNextDay1() {
        int day = 1;
        int month = 1;
        int year = 2021;
        String expected = "2/1/2021";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case 31/1/2021")
    void testDay31Month1Year2021() {
        int day = 31;
        int month = 1;
        int year = 2021;
        String expected = "1/2/2021";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case 30/4/2021")
    void testDay30Month4Year2021() {
        int day = 30;
        int month = 4;
        int year = 2021;
        String expected = "1/5/2021";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("case 31/12/2021")
    void testDay31Month12Year2021() {
        int day = 31;
        int month = 12;
        int year = 2021;
        String expected = "1/1/2022";
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

}