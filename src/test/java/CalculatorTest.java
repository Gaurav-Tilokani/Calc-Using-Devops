import static org.junit.Assert.*;
import org.junit.Test;
public class CalculatorTest {
    Calculator calculator = new Calculator();
    private static final double DELTA = 1e-15;
    @Test
    public void factorialTruePositive() {
        assertEquals("Finding factorial for True Positive", 120.0, calculator.factorial(5.0), DELTA);
    }

    @Test
    public void factorialTrueNegative() {
        assertNotEquals("Finding factorial for True Negative", 20.0, calculator.factorial(4.0), DELTA);
    }

    @Test
    public void powerTruePositive() {
        assertEquals("Finding power for True Positive", 32.0, calculator.power(2.0, 5.0), DELTA);
    }

    @Test
    public void powerTrueNegative() {
        assertNotEquals("Finding power for True Negative", 69.0, calculator.power(2.0, 4.0), DELTA);
    }

    @Test
    public void sqrtTruePositive() {
        assertEquals("Finding natural log for True Positive", 8.0, calculator.sqrt(64.0), DELTA);
    }

    @Test
    public void sqrtTrueNegative() {
        assertNotEquals("Finding natural log for True Negative", 6.0, calculator.sqrt(30.0), DELTA);
    }

    @Test
    public void logTruePositive() {
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1.0), DELTA);
    }

    @Test
    public void logTrueNegative() {
        assertNotEquals("Finding natural log for True Negative", 69, calculator.naturalLog(2.4), DELTA);
    }

}
