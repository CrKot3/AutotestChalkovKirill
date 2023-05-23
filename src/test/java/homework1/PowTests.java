package homework1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PowTests extends CalculatorInit {
    @ParameterizedTest
    @CsvSource({"3, 2, 9", "-9, 2, 81", "5, 3, 125", "-6, 1, -6"})
    void testIntegers(double a, double b, double expected) {
        assertEquals(expected, calculator.pow(a, b));
    }

    @ParameterizedTest
    @CsvSource({"-1, 4000, 1", "1, 99999999, 1", "1, 1000, 1", "-1, 999, -1"})
    void testSign(double a, double b, double expected) {
        assertEquals(expected, calculator.pow(a, b));
    }

    @ParameterizedTest
    @CsvSource({"3.14, 2, 9.8596", "6.9, -6.9, 0.00000162907", "5.01, 2, 25.1001", "5.01, 2.21, 35.2080015088", "-3.14, 2, 9.8596"})
    void testDoubles(double a, double b, double expected) {
        assertEquals(expected, calculator.pow(a, b), ACCEPTABLE_ERROR);
    }

    @ParameterizedTest
    @CsvSource({"0, 3.45, 0", "6.9, 0, 1", "0, -1, Infinity", "-1.34, 0, 1"})
    void testZero(double a, double b, double expected) {
        assertEquals(expected, calculator.pow(a, b));
    }

    @Test
    void testControversial() {
        assertEquals(1, calculator.pow(0, 0));
    }
}
