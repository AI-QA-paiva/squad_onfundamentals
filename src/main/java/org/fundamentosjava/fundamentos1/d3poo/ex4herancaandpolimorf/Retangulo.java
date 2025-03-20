package org.fundamentosjava.fundamentos1.d3poo.ex4herancaandpolimorf;

public class Retangulo extends FormaGeometrica {

    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {

        double calcularAreaRetangular = base * altura;

        System.out.println("\nO valor da área retangular é de: " + calcularAreaRetangular + " ua²!");

        return calcularAreaRetangular;
    }
}
