package org.fundamentosjava.fundamentos2.tema2paterns.ex6factorymethod;

public abstract class CarBodyType {

    private String carBrand;
    private String carModel;
    private BodyType carBodyType;
    private String projectNumber;


    public CarBodyType(String carBrand, String carModel, BodyType carBodyType, String projectNumber) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carBodyType = carBodyType;
        this.projectNumber = projectNumber;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public BodyType getCarBodyType() {
        return carBodyType;
    }

    public String getProjectNumber() {
        return projectNumber;
    }

    public abstract void manufactureBodywork();
    //estampagem de carroceria: corte, dobra, prensagem


    public abstract void bodyAssembly();
//soldar carroceria: soldagem de paineis, soldagem de portas, soldagem de teto


    public abstract void carPainting();
//preparar a pintura: limpeza, lixamento, aplicação de primer, aplicação de tinta

    public abstract void showCarBodyType();


}
