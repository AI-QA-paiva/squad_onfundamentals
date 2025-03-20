package org.fundamentosjava.fundamentos1.d3poo.ex4herancaandpolimorf;

public class CalcAreaMain {

    public static void main(String[] args) {

        FormaGeometrica calcularAreaCircular = new Circulo(3.0, 3.14);

        FormaGeometrica calcularAreaRetangular = new Retangulo(4.0, 3.0);

        calcularAreaCircular.calcularArea();

        calcularAreaRetangular.calcularArea();

    }

}
