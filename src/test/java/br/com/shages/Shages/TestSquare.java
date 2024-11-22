package br.com.shages.Shages;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSquare {
    @Test
    void testCalculateArea() {
        Square square = new Square(4);
        assertEquals(16, square.calculateArea(), "A área deveria ser 16.");
    }

    @Test
    void testCalculatePerimeter() {
        Square square = new Square(4);
        assertEquals(16, square.calculatePerimeter(), "O perímetro deveria ser 16.");
    }

    @Test
    void testInvalidSquareSide() {
        assertThrows(IllegalArgumentException.class, () -> new Square(-1),
                "Deveria lançar uma exceção para valores negativos.");
        assertThrows(IllegalArgumentException.class, () -> new Square(0),
                "Deveria lançar uma exceção para o valor zero.");
    }
}
