package br.com.shages.Shages;

public class Circle implements Shapes {
    private double radius;

    // Construtor
    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("O raio deve ser maior que zero.");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Fórmula correta para a área
    }


    public double calculatePerimeter() {
        return 2 * Math.PI * radius; // Fórmula para a circunferência
    }

    // Getter e Setter (opcionais)
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("O raio deve ser maior que zero.");
        }
        this.radius = radius;
    }
}