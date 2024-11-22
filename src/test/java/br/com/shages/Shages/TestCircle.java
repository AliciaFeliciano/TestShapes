package br.com.shages.Shages;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestCircle {

    @Test
    void testCalculateArea() {
        Circle circle = new Circle(5);
        assertEquals(78.54, circle.calculateArea(), 0.01); // Tolerância de 0.01
    }

    @Test
    void testCalculatePerimeter() {
        Circle circle = new Circle(5);
        assertEquals(31.42, circle.calculatePerimeter(), 0.01); // Tolerância de 0.01
    }

    @Test
    void testInvalidRadius() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(-1));
    }
}