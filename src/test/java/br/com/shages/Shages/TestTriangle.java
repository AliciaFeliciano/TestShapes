package br.com.shages.Shages;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTriangle {
    @Test
    void testCalculateArea() {
        Triangle triangle = new Triangle(10, 5);
        assertEquals(25.0, triangle.calculateArea(), "A área deveria ser 25.0.");
    }

    @Test
    void testCalculatePerimeter() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(12.0, triangle.calculatePerimeter(), "O perímetro deveria ser 12.0.");
    }

    @Test
    void testInvalidDimensions() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(-10, 5),
                "Deveria lançar uma exceção para base ou altura negativas.");
        assertThrows(IllegalArgumentException.class, () -> new Triangle(3, 4, -5),
                "Deveria lançar uma exceção para lados negativos.");
    }

    @Test
    void testInvalidTriangleSides() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 2, 10),
                "Deveria lançar uma exceção para lados que não formam um triângulo.");
    }

    @Test
    void testMixedOperations() {
        Triangle triangle = new Triangle(6, 8);
        assertThrows(UnsupportedOperationException.class, triangle::calculatePerimeter,
                "Deveria lançar uma exceção para cálculo de perímetro sem os três lados.");
    }
}
