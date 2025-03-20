package org.fundamentosjava.leituras;

import org.fundamentosjava.fundamentos2.tema1solid.ex1srp.Item;
import org.fundamentosjava.fundamentos2.tema1solid.ex1srp.Order;

public class OrderProcessor2 {

    //Fazendo em uma classe só

    public void processOrder(Order order) {
        if (order == null) {
            return;
        }

        if (!order.isValid()) {
            return;
        }

        double total = calculateTotal(order);
        total = grantDiscount(order, total);
        printTotal(total);
    }

    private double calculateTotal(Order order) {
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getPrice();
        }
        return total;
    }

    private double grantDiscount(Order order, double total) {
        if (order.hasDiscount()) {
            total = total * 0.9;
        }
        return total;
    }

    private void printTotal(double total) {
        System.out.println("Total: " + total);
    }


}
