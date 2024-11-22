package br.com.shages.Shages;

public class Hexagon implements Shapes {
    private double side;

    // Construtor
    public Hexagon(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("O lado do hexágono deve ser maior que zero.");
        }
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (3 * Math.sqrt(3) * side * side) / 2;
    }


    public double calculatePerimeter() {
        return 6 * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("O lado do hexágono deve ser maior que zero.");
        }
        this.side = side;
    }
}