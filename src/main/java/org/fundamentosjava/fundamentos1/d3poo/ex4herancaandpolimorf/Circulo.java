package org.fundamentosjava.fundamentos1.d3poo.ex4herancaandpolimorf;

public class Circulo extends FormaGeometrica {

    private double raio;
    private double constantePi;

    public Circulo(double raio, double constantePi) {
        this.raio = raio;
        this.constantePi = constantePi;
    }

    @Override
    public double calcularArea() {

        double calcularAreaCircular = raio * raio * constantePi;

        System.out.println("\nO valor da área circular é de: " + calcularAreaCircular + " ua²!");

        return  calcularAreaCircular;
    }

}