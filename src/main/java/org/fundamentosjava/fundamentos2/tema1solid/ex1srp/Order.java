package org.fundamentosjava.fundamentos2.tema1solid.ex1srp;

import java.math.BigDecimal;
import java.util.List;

public class Order {

    private List<Item> items;
    private boolean discount;
    private double valorDesconto = 0.9;
    private double valorTotal;

    public Order(List<Item> items, Boolean discount) {
        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("A lista de itens não pode ser nula ou vazia.");
        }
        this.items = items;
        this.discount = discount;
    }

    public List<Item> getItems() {
        return items;
    }

    public boolean hasDiscount() {
        // lógica de desconto se houver é indicada na criação do pedido
        return discount;
    }

    public boolean isValid() {
        // Implementar lógica de validação
        if (items.isEmpty()) {
            System.out.println("Pedido sem itens!");
            return false;
        }
        return true;
    }

    public double calculateTotal() {
        valorTotal = 0;
        for (Item item : items) {
            if(item == null){
                throw new IllegalArgumentException("Item não pode ser nulo dentro da lista!");
            }
            valorTotal += item.getPrice();
        }
        if (hasDiscount()) {
            valorTotal *= valorDesconto;
        }
        this.valorTotal = valorTotal;
        return valorTotal;
    }

}
