package org.fundamentosjava.fundamentos2.tema1solid.ex4;

public class Square implements RightAngledPolygons {

    private int side;
    private int squareArea;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {

        if(side <= 0) {
            throw new IllegalArgumentException("Side must be greater than 0."); //IllegalArgumentException
        }

        squareArea = side * side;
        System.out.println("\nCalculated area for the SQUARE: " + squareArea + " ua².");
        return squareArea;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
