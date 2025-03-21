package org.fundamentosjava.fundamentos2.tema2paterns.ex6factorymethod;

public class CarBodyFactoryMethod {

    public static CarBodyType createCarBody(BodyType carTypeBody, String carBrand, String carModel, String projectNumber) {

        CarBodyType carBodyType = null;

        switch (carTypeBody) {
            case SEDAN:
                carBodyType = new SedanBody(carBrand, carModel, carTypeBody, projectNumber);
                break;
            case HACTH:
                carBodyType = new HatchBody(carBrand, carModel, carTypeBody, projectNumber);
                break;
            default:
                throw new IllegalArgumentException("Tipo de carroceria não encontrado: " + carTypeBody);
        }
        return carBodyType;
    }


}
