package homework1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CosTests extends CalculatorInit {
    @ParameterizedTest
    @CsvSource({"0, 1", "3.1415, -1", "1.5708, 0", "-1.5708, 0"})
    void testTableValues(double a, double expected) {
        assertEquals(expected, calculator.cos(a), ACCEPTABLE_ERROR);
    }

    @ParameterizedTest
    @CsvSource({"0, 0", "3.1415, 0", "1.5708, 1", "-1.5708, -1"})
    void testTableValuesAsSin(double a, double expected) {
        assertEquals(expected, calculator.cos(a), ACCEPTABLE_ERROR);
    }

    @ParameterizedTest
    @CsvSource({"3.3, -0.9874797699", "6.9, 0.81572510012", "-9.11, -0.95086514688"})
    void testGeneralValues(double a, double expected) {
        assertEquals(expected, calculator.cos(a), ACCEPTABLE_ERROR);
    }

    @ParameterizedTest
    @CsvSource({"3.3, -0.15774569414", "6.9, 0.57843976438", "-9.11, -0.30960534949"})
    void testGeneralValuesAsSin(double a, double expected) {
        assertEquals(expected, calculator.cos(a), ACCEPTABLE_ERROR);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0, 1, Math.PI, 69, 10.07, -2.93})
    void testAddingPi(double a) {
        assertEquals(-calculator.cos(a + Math.PI), calculator.cos(a), ACCEPTABLE_ERROR);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0, 1, Math.PI, 69, 10.07, -2.93})
    void testAddingTwoPi(double a) {
        assertEquals(calculator.cos(a + 2 * Math.PI), calculator.cos(a), ACCEPTABLE_ERROR);
    }
}
