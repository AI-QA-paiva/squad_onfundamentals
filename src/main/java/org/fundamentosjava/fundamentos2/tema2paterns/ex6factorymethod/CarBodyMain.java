package org.fundamentosjava.fundamentos2.tema2paterns.ex6factorymethod;

import java.util.Scanner;

public class CarBodyMain {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tipo de carroceria: \nSEDAN \nHACTH");
        String carType = scanner.nextLine().toUpperCase();


        switch (carType){
            case "SEDAN":
                CarBodyType carBodyType = CarBodyFactoryMethod.createCarBody(BodyType.SEDAN, "Fiat", "Siena", "1002");
                carBodyType.manufactureBodywork();
                carBodyType.bodyAssembly();
                carBodyType.carPainting();
                carBodyType.showCarBodyType();
                break;
            case "HACTH":
                carBodyType = CarBodyFactoryMethod.createCarBody(BodyType.HACTH, "Fiat", "Palio", "1001");
                carBodyType.manufactureBodywork();
                carBodyType.bodyAssembly();
                carBodyType.carPainting();
                carBodyType.showCarBodyType();
                break;
            default:
                System.out.println("Tipo de carroceria não encontrado");
        }

    }
}
