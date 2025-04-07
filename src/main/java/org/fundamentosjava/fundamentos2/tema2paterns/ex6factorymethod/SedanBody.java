package org.fundamentosjava.fundamentos2.tema2paterns.ex6factorymethod;

public class SedanBody extends CarBodyType {


    public SedanBody(String carBrand, String carModel, BodyType carBodyType, String projectNumber) {
        super(carBrand, carModel, carBodyType, projectNumber);
    }

    @Override
    public void manufactureBodywork() {
        System.out.println("\nDimensões da carroceria SEDAN: \nComprimento: 4,5m <> Largura: 1,75m <>Altura: 1,55m");
        System.out.println("\nIniciar fabricação da Carroceria SEDAN: \nEstampar carroceria: corte , dobra, prensagem");
    }

    @Override
    public void bodyAssembly() {
        System.out.println("\nMontar Carroceria SEDAN: \nIniciar união da carroceria por processo de soldagem:  \nsoldagem de paineis, soldagem de portas, soldagem de teto");
    }

    @Override
    public void carPainting() {
        System.out.println("\nPintar Carroceria SEDAN: \nPreparar a pintura: \nlimpeza, lixamento, aplicação de primer, aplicação de tinta");
    }

    @Override
    public void showCarBodyType() {
        System.out.println("\nCarroceria SEDAN produzida com sucesso!");
    }


}
