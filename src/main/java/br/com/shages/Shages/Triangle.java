package br.com.shages.Shages;

public class Triangle implements Shapes {
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    private double sideC;

    // Construtor para cálculo de área (base e altura)
    public Triangle(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Base e altura devem ser maiores que zero.");
        }
        this.base = base;
        this.height = height;
    }

    // Construtor para cálculo de perímetro (três lados)
    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException("Os lados do triângulo devem ser maiores que zero.");
        }
        if (!isValidTriangle(sideA, sideB, sideC)) {
            throw new IllegalArgumentException("Os lados fornecidos não formam um triângulo válido.");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private boolean isValidTriangle(double sideA, double sideB, double sideC) {
        return (sideA + sideB > sideC) &&
                (sideA + sideC > sideB) &&
                (sideB + sideC > sideA);
    }

    @Override
    public double calculateArea() {
        if (base > 0 && height > 0) {
            return (base * height) / 2;
        }
        throw new UnsupportedOperationException("A área só pode ser calculada com base e altura.");
    }

    public double calculatePerimeter() {
        if (sideA > 0 && sideB > 0 && sideC > 0) {
            return sideA + sideB + sideC;
        }
        throw new UnsupportedOperationException("O perímetro só pode ser calculado com os três lados.");
    }

    // Getters e Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("A base deve ser maior que zero.");
        }
        this.base = base;
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

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        if (sideA <= 0) {
            throw new IllegalArgumentException("O lado deve ser maior que zero.");
        }
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        if (sideB <= 0) {
            throw new IllegalArgumentException("O lado deve ser maior que zero.");
        }
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        if (sideC <= 0) {
            throw new IllegalArgumentException("O lado deve ser maior que zero.");
        }
        this.sideC = sideC;
    }
}
