package org.fundamentosjava.fundamentos2.tema2paterns.ex8.builderpart;

public class CarMain {

    public static void main(String[] args) {

        Car newCarByBuilder = new Car.CarBuilder()
                .setBrand("Ford")
                .setModel("Ranger")
                .setYear(2020)
                .setModelVersion("XLT - Raptor")
                .setDoorsNumber(5)
                //.setEnginePower("3.2")  //criar sem o lançamento da info, ainda assim essa caracteristica é criada
                .setChassisType("light cargo vehicle")
                .setSuspensionType("Double reinforced leaf springs and electromechanical front cylinders")
                .build();

        System.out.println(newCarByBuilder);

    }
}
