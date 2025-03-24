package org.fundamentosjava.fundamentos2.tema2paterns.ex8.builderpart;

import org.fundamentosjava.fundamentos1.d3poo.ex2heranca.Veiculo;

public class Car extends Veiculo {

    private String brand;
    private String model;
    private int year;
    private String modelVersion;
    private int doorsNumber;
    private String enginePower;
    private String chassisType;
    private String suspensionType;

    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.modelVersion = builder.modelVersion;
        this.doorsNumber = builder.doorsNumber;
        this.enginePower = builder.enginePower;
        this.chassisType = builder.chassisType;
        this.suspensionType = builder.suspensionType;
    }

    //getters para acessar os atributos privados classe car

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getModelVersion() {
        return modelVersion;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public String getChassisType() {
        return chassisType;
    }

    public String getSuspensionType() {
        return suspensionType;
    }
    //metodo para exibirDetalhes trazendo as características do carro
    @Override
    public String toString() {
        return "\n(INTERFACE) Veículo que possui dados de um Carro: " +
                "\nMarca: " + brand +
                "\nModelo: " + model +
                "\nAno: " + year +
                "\nVersão do Modelo: " + modelVersion +
                "\nQuantidade de Portas: " + doorsNumber +
                "\nPotência do Motor: " + enginePower +
                "\nTipo de Chassi: " + chassisType +
                "\nTipo de Suspensão: " + suspensionType;
    }


    // construindo builder
    // classe statica para nao precisar criar um outra classe para o builder

    public static class CarBuilder {

        private String brand;
        private String model;
        private int year;
        private String modelVersion;
        private int doorsNumber;
        private String enginePower;
        private String chassisType;
        private String suspensionType;


        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder setModelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            return this;
        }

        public CarBuilder setDoorsNumber(int doorsNumber) {
            this.doorsNumber = doorsNumber;
            return this;
        }

        public CarBuilder setEnginePower(String enginePower) {
            this.enginePower = enginePower;
            return this;
        }

        public CarBuilder setChassisType(String chassisType) {
            this.chassisType = chassisType;
            return this;
        }

        public CarBuilder setSuspensionType(String suspensionType) {
            this.suspensionType = suspensionType;
            return this;
        }

        //metodo que criar o objeto Carro a partir do padrão builder
        public Car build() {
            return new Car(this);
        }

    }
}
