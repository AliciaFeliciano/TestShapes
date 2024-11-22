package br.com.shages.Shages;

public class Rectangle implements Shapes {
    private double width;
    private double height;

    // Construtor
    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("A largura e a altura devem ser maiores que zero.");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Getters e Setters (opcionais)
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("A largura deve ser maior que zero.");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("A altura deve ser maior que zero.");
        }
        this.height = height;
    }
}
