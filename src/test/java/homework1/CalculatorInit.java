package homework1;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.BeforeAll;

class CalculatorInit {
    protected static Calculator calculator;
    protected static final double ACCEPTABLE_ERROR = 0.0001;

    @BeforeAll
    static void init() {
        calculator = new Calculator();
    }
}