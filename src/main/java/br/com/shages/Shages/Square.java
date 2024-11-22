package br.com.shages.Shages;

public class Square implements Shapes {
    private double squareSide;

    public Square(double squareSide) {
        if (squareSide <= 0) {
            throw new IllegalArgumentException("O lado do quadrado deve ser maior que zero.");
        }
        this.squareSide = squareSide;
    }

    @Override
    public double calculateArea() {
        return squareSide * squareSide;
    }

    public double calculatePerimeter() {
        return 4 * squareSide;
    }

    public double getSquareSide() {
        return squareSide;
    }

    public void setSquareSide(double squareSide) {
        if (squareSide <= 0) {
            throw new IllegalArgumentException("O lado do quadrado deve ser maior que zero.");
        }
        this.squareSide = squareSide;
    }
}
