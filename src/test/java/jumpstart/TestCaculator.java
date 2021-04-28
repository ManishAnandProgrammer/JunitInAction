package jumpstart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCaculator {

    @Test
    void addingShouldReturn60() {
        Calculator calculator = new Calculator();
        double result1 = calculator.add(10.0, 50.0);
        assertEquals(60, result1, 0);
    }

    @Test
    void addingShouldReturn50() {
        Calculator calculator = new Calculator();
        double result2 = calculator.add(0, 50);
        assertEquals(50, result2, 0);
    }
}
