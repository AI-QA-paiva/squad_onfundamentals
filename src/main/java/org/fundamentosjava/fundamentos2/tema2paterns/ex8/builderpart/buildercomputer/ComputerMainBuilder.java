package org.fundamentosjava.fundamentos2.tema2paterns.ex8.builderpart.buildercomputer;

public class ComputerMainBuilder {

    public static void main(String[] args) {
        Computer newComputerByBuilder = new Computer.ComputerBuilder()
                .setBrand("Dell")
                .setComputerType("Desktop")
                .setModel("Inspiron")
                .setCpuProcessor("Intel Core i5")
                .setGpuProcessor("NVIDIA GeForce GTX 1650")
                .setMemoryRam("8GB")
                .setStorage("256GB SSD")
                .setUsbPorts(6)
                .setDisplay("23.8-inch FHD")
                .build();

        Computer newComputerByBuilder2 = new Computer.ComputerBuilder()
                .setBrand("Dell")
                .setComputerType("Notebook")
                .setModel("Inspiron")
                .setCpuProcessor("Intel Core i7")
                .setGpuProcessor("NVIDIA GeForce GTX 3500")
                .setMemoryRam("16GB")
                .setStorage("500GB SSD")
                .setUsbPorts(3)
                .setDisplay("14-inch FHD")
                .build();

        System.out.println(newComputerByBuilder);
        System.out.println(newComputerByBuilder2);

    }
}
