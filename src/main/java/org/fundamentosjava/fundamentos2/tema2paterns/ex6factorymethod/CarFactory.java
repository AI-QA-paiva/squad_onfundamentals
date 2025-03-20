package org.fundamentosjava.fundamentos2.tema2paterns.ex6factorymethod;

public class CarFactory {

    private String carModel;
    private String carBrand;
    private String carColor;
    private int carYear;

    public CarFactory(String carModel, String carBrand, String carColor, int carYear) {
        this.carModel = carModel;
        this.carBrand = carBrand;
        this.carColor = carColor;
        this.carYear = carYear;
    }


}
