import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        // Arrange: Initialize the Calculator before each test
        calculator = new Calculator();
        System.out.println("Setup: Calculator instance created.");
    }

    @After
    public void tearDown() {
        // Teardown: Clean up after each test
        calculator = null;
        System.out.println("Teardown: Calculator instance set to null.");
    }

    @Test
    public void testAddition() {
        // Arrange is done in setUp()
        int a = 2;
        int b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals("Addition should return the sum", 5, result);
    }

    @Test
    public void testSubtraction() {
        // Arrange is done in setUp()
        int a = 5;
        int b = 2;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals("Subtraction should return the difference", 3, result);
    }
}
