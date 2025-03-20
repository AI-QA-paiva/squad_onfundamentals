package org.fundamentosjava.fundamentos2.tema1solid.ex1srp;

public class OrderCalculator {

    public double calculateTotal(Order order) {
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getPrice();
        }

        if (order.hasDiscount()) {
            total *= 0.9;
        }
        return total;
    }


}
