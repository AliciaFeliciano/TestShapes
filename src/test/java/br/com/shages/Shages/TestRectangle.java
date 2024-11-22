package br.com.shages.Shages;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestRectangle {
    @Test
    void testCalculateArea() {
        Rectangle rectangle = new Rectangle(4, 6);
        assertEquals(24, rectangle.calculateArea(), "A área deveria ser 24.");
    }

    @Test
    void testCalculatePerimeter() {
        Rectangle rectangle = new Rectangle(4, 6);
        assertEquals(20, rectangle.calculatePerimeter(), "O perímetro deveria ser 20.");
    }

    @Test
    void testInvalidDimensions() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-4, 6));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(4, -6));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0, 0));
    }
}
