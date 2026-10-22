
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testAddition() {
        assertEquals(30, Main.add(10, 20));
    }

    @Test
    void testSubtraction() {
        assertEquals(10, Main.subtract(20, 10));
    }

    @Test
    void testMultiplication() {
        assertEquals(20, Main.multiply(5, 4));
    }

    @Test
    void testDivision() {
        assertEquals(4.0, Main.divide(20, 5), 0.001);
    }

    @Test
    void testDivisionByZero() {
        assertThrows(
            IllegalArgumentException.class,
            () -> Main.divide(10, 0)
        );
    }
}
