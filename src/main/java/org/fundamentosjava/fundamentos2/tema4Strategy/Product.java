package org.fundamentosjava.fundamentos2.tema4Strategy;

import java.math.BigDecimal;

public class Product {

    private String name;
    private String description;
    private BigDecimal price;


    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = BigDecimal.valueOf(price);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Produto: " + name + "\n" +
                "Descrição: " + description + "\n" +
                "Preço: R$" + price.setScale(2) + "\n";
    }

}
