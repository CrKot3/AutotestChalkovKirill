package homework1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class IsPositiveTests extends CalculatorInit {
    @ParameterizedTest
    @ValueSource(longs = {69, 1, 781034, 9223372036854775807L})
    void testPositive(long number) {
        assertTrue(calculator.isPositive(number));
    }

    @ParameterizedTest
    @ValueSource(longs = {-69, -1, -781034, -9223372036854775808L})
    void testNegative(long number) {
        assertFalse(calculator.isPositive(number));
    }

    @Test
    void testZero() {
        assertFalse(calculator.isPositive(0));
    }
}
