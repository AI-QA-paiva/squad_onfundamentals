package org.fundamentosjava.leituras.padroes.aplicadecorator;

public class SimpleCar implements Car {

    private String color;
    private String motor;
    private String steering;

    public SimpleCar() {
    }

    public SimpleCar(String color, String motor, String steering) {
        this.color = color;
        this.motor = motor;
        this.steering = steering;
    }

    @Override
    public void peripheralComponents() {
        System.out.println("Simple car with no peripheral components");
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public String motor() {
        return motor;
    }

    @Override
    public String steering() {
        return steering;
    }
}
