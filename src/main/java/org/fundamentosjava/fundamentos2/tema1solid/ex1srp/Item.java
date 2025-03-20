package org.fundamentosjava.fundamentos2.tema1solid.ex1srp;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Item {

    private double price;

    private String name;

    public Item(String name, double price) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Não é permitido nome nulo ou vazio.");
        }
        if (price < 0 || price == 0) {
            throw new IllegalArgumentException("Não é permitido preço nulo ou negativo.");
        }
        this.name = name;
        this.price = price;
    }

//    public Item() {
//    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
