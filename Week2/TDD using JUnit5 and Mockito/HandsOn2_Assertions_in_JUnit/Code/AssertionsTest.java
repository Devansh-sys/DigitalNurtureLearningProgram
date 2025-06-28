import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert equals
        assertEquals("2 + 3 should be 5", 5, 2 + 3);

        // Assert true
        assertTrue("5 should be greater than 3", 5 > 3);

        // Assert false
        assertFalse("5 should not be less than 3", 5 < 3);

        // Assert null
        assertNull("Object should be null", null);

        // Assert not null
        assertNotNull("Object should not be null", new Object());
    }
}
