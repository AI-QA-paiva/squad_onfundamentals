package org.fundamentosjava.fundamentos2.tema2paterns.ex6factorymethod;

public class HatchBody extends CarBodyType {


    public HatchBody(String carBrand, String carModel, BodyType carBodyType, String projectNumber) {
        super(carBrand, carModel, carBodyType, projectNumber);
    }

    @Override
    public void manufactureBodywork() {
        System.out.println("\nDimensões da carroceria HATCH: \nComprimento: 3,5m <> Largura: 1,70m <> Altura: 1,45m");
        System.out.println("\nIniciar fabricação da Carroceria HATCH: \nEstampar carroceria: corte , dobra, prensagem");
    }

    @Override
    public void bodyAssembly() {
        System.out.println("nMontar Carroceria HATCH: \nIniciar união da carroceria por processo de soldagem:  \nsoldagem de paineis, soldagem de portas, soldagem de teto");
    }

    @Override
    public void carPainting() {
        System.out.println("\nPintar Carroceria HATCH: \nPreparar a pintura: \nlimpeza, lixamento, aplicação de primer, aplicação de tinta");
    }

    @Override
    public void showCarBodyType() {
        System.out.println("\nCarroceria HATCH produzida com sucesso!");
    }


}
