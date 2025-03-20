package org.fundamentosjava.fundamentos2.tema1solid.ex4;

public class Rectangle implements RightAngledPolygons {

    private int width;
    private int height;
    private int rectangleArea;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public int getArea() {

        if(width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height must be greater than 0."); //IllegalArgumentException
        } else if(width == height) {
            throw new IllegalArgumentException("Width and height must be different.");
        }

        rectangleArea = width * height;
        System.out.println("\nCalculated area for the RECTANGLE: " + rectangleArea + " ua².");
        return rectangleArea;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
