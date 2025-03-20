package org.fundamentosjava.fundamentos2.tema1solid.ex1srp;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessor {

    public void processOrder(Order order) {
        if (order != null && order.isValid()) {
            double total = order.calculateTotal();
            System.out.println("Total: " + total);
        }
    }
}
