package br.com.shages.Shages;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestHexagon {
    @Test
    void testCalculateArea() {
        Hexagon hexagon = new Hexagon(6);
        assertEquals(93.53, hexagon.calculateArea(), 0.01);
    }

    @Test
    void testCalculatePerimeter() {
        Hexagon hexagon = new Hexagon(6);
        assertEquals(36, hexagon.calculatePerimeter());
    }

    @Test
    void testInvalidSide() {
        assertThrows(IllegalArgumentException.class, () -> new Hexagon(-1));
    }
}
