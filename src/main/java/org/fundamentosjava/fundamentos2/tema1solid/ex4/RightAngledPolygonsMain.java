package org.fundamentosjava.fundamentos2.tema1solid.ex4;

public class RightAngledPolygonsMain {

    public static void main(String[] args) {

        try {
            RightAngledPolygons rectangle = new Rectangle(9, 8);
            rectangle.getArea();
        }catch (IllegalArgumentException e) {
            System.out.println("\nO cálculo da ÁREA RETANGULAR não pode ser executado! Avaliar: " + e.getMessage());
        }

        try {
            RightAngledPolygons square = new Square(0);
            square.getArea();
        }catch (IllegalArgumentException e) {
            System.out.println("\nO cálculo da ÁREA QUADRADA não pode ser executado! Avaliar: " + e.getMessage());
        }

    }
}
