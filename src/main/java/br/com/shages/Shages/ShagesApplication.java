package br.com.shages.Shages;

public class ShagesApplication {
    public static void main(String[] args) {
        Circle circle = new Circle(5);

        // Calcula e imprime área e perímetro
        System.out.println("Área do círculo: " + circle.calculateArea());
        System.out.println("Perímetro do círculo: " + circle.calculatePerimeter());

        // Alterando o raio
        circle.setRadius(7);
        System.out.println("Nova área do círculo: " + circle.calculateArea());
        System.out.println("Novo perímetro do círculo: " + circle.calculatePerimeter());
    }
}
