package br.com.shages.Shages;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppSystem {
    private List<Shapes> shapes;
    private Scanner sc;

    public AppSystem() {
        this.shapes = new ArrayList<>();
        this.sc = new Scanner(System.in);
    }

    public void run() {
        int control = 0;
        while (control == 0) {
            int option = IO.menu();
            if (option == 1) {
                shapes.add(createSquare()); // Quadrado
            } else if (option == 2) {
                shapes.add(createTrangle()); // Triangulo
            } else if (option == 3) {
                shapes.add(createCircle()); // Circulo
            } else if (option == 4) {
                shapes.add(createHexagon()); // Hexagono
            } else if (option == 5) {
                shapes.add(createRectangle()); // Retangulo
            } else if (option == 0) {
                control = 1;
                System.out.println("Fim do programa");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
            for (Shapes shape : shapes) {
                System.out.println("Área: " + shape.calculateArea());
            }
        }
        sc.close();
    }

    private Square createSquare(){
        System.out.println("Digite o valor do lado para o calculo:");
        System.out.print("Lado: ");
        double squareSide = sc.nextDouble();
        return new Square(squareSide);
    }
    private Triangle createTrangle(){
        System.out.println("Digite o valor da base para o calculo:");
        System.out.print("Base: ");
        double base = sc.nextDouble();
        System.out.println("Digite o valor da Altura para o calculo:");
        System.out.print("Altura: ");
        double height = sc.nextDouble();
        return new Triangle(base, height);
    }

    private Circle createCircle() {
        System.out.println("Digite o valor do raio para o cálculo:");
        System.out.print("Raio: ");
        double radius = sc.nextDouble();
        return new Circle(radius);
    }

    private Hexagon createHexagon() {
        System.out.println("Digite o valor do lado para o calculo:");
        System.out.print("Lado: ");
        double side = sc.nextDouble();
        return new Hexagon(side);
    }
    private Rectangle createRectangle() {
        System.out.println("Digite o valor da largura para o calculo:");
        System.out.print("Largura: ");
        double width = sc.nextDouble();
        System.out.println("Digite o valor da altura para o calculo:");
        System.out.print("Altura: ");
        double height = sc.nextDouble();
        return new Rectangle(width, height);
    }

}