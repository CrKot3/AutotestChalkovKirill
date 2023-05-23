package homework1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SubTests extends CalculatorInit {
    @ParameterizedTest
    @CsvSource({"1000, 7, 993", "-69, 420, -489", "2023, 1899, 124", "999, 666, 333"})
    void testGeneric(long a, long b, long expected) {
        assertEquals(expected, calculator.sub(a, b));
    }

    @ParameterizedTest
    @CsvSource({"202, 203, -1", "-69, -72, 3", "0, 1, -1", "0, -1, 1"})
    void testSignChange(long a, long b, long expected) {
        assertEquals(expected, calculator.sub(a, b));
    }

    @ParameterizedTest
    @CsvSource({"-9223372036854775808, 1, 9223372036854775807", "9223372036854775807, -1, -9223372036854775808", "0, 9223372036854775807, -9223372036854775807"})
    void testMaxLong(long a, long b, long expected) {
        assertEquals(expected, calculator.sub(a, b));
    }
}