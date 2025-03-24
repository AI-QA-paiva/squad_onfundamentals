package org.fundamentosjava.fundamentos2.tema2paterns.ex8.builderpart.buildercomputer;

public class Computer {

    private String brand;
    private String computerType;
    private String model;
    private String cpuProcessor;
    private String gpuProcessor;
    private String memoryRam;
    private String storage;
    private int usbPorts;
    private String display;

    //Construtor privado para instanciar o objeto Computer

    private Computer(ComputerBuilder builder) {
        this.brand = builder.brand;
        this.computerType = builder.computerType;
        this.model = builder.model;
        this.cpuProcessor = builder.cpuProcessor;
        this.gpuProcessor = builder.gpuProcessor;
        this.memoryRam = builder.memoryRam;
        this.storage = builder.storage;
        this.usbPorts = builder.usbPorts;
        this.display = builder.display;
    }

    //getters para acessar os atributos privados da classe Computer

    public String getBrand() {
        return brand;
    }

    public String getComputerType() {
        return computerType;
    }

    public String getModel() {
        return model;
    }

    public String getCpuProcessor() {
        return cpuProcessor;
    }

    public String getGpuProcessor() {
        return gpuProcessor;
    }

    public String getMemoryRam() {
        return memoryRam;
    }

    public String getStorage() {
        return storage;
    }

    public int getUsbPorts() {
        return usbPorts;
    }

    public String getDisplay() {
        return display;
    }

    //metodo para exibirDetalhes trazendo as características do computador

    @Override
    public String toString() {
        return "\nComputador modelo: {" +
                "brand='" + brand + '\'' +
                ", computerType='" + computerType + '\'' +
                ", model='" + model + '\'' +
                ", cpuProcessor='" + cpuProcessor + '\'' +
                ", gpuProcessor='" + gpuProcessor + '\'' +
                ", memoryRam='" + memoryRam + '\'' +
                ", storage='" + storage + '\'' +
                ", usbPorts=" + usbPorts +
                ", display='" + display + '\'' +
                '}';
    }


    //Classe interna ComputerBuilder para construir o objeto Computer

    public static class ComputerBuilder {

        private String brand;
        private String computerType;
        private String model;
        private String cpuProcessor;
        private String gpuProcessor;
        private String memoryRam;
        private String storage;
        private int usbPorts;
        private String display;

        //Construtor padrão da classe ComputerBuilder

//        public ComputerBuilder() {
//        }

        //setters para atribuir valores aos atributos privados da classe ComputerBuilder

        public ComputerBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public ComputerBuilder setComputerType(String computerType) {
            this.computerType = computerType;
            return this;
        }

        public ComputerBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public ComputerBuilder setCpuProcessor(String cpuProcessor) {
            this.cpuProcessor = cpuProcessor;
            return this;
        }

        public ComputerBuilder setGpuProcessor(String gpuProcessor) {
            this.gpuProcessor = gpuProcessor;
            return this;
        }

        public ComputerBuilder setMemoryRam(String memoryRam) {
            this.memoryRam = memoryRam;
            return this;
        }

        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setUsbPorts(int usbPorts) {
            this.usbPorts = usbPorts;
            return this;
        }

        public ComputerBuilder setDisplay(String display) {
            this.display = display;
            return this;
        }

        //metodo para construir o objeto Computer

        public Computer build() {
            return new Computer(this);
        }
    }


}
