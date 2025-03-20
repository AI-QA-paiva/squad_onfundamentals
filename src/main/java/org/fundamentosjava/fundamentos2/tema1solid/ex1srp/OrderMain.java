package org.fundamentosjava.fundamentos2.tema1solid.ex1srp;

import java.util.Arrays;
import java.util.List;

public class OrderMain {

    public static void main(String[] args) {

        try {
            Item item1 = new Item("Bolda de Handball", -1.0);
            Item item2 = new Item("chuteira socyet", 10.0);
            Item item3 = new Item("bola basquete", 100.0);
            Item item4 = new Item("camisa treino sem manga", 1000.0);
            Item item5 = new Item("short tactel treino", 10000.0);

            // Criação de uma lista de itens
            List<Item> items = Arrays.asList(item1, item2, item3, item4, item5);
            //List<Item> items = Arrays.asList();


            // Criação de um pedido
            Order order = new Order(items, false);

            // Instancia o OrderProcessor
            OrderProcessor orderProcessor = new OrderProcessor();


            // Imprime o pedido
            System.out.println("\n" + items);

            // Processa o pedido
            orderProcessor.processOrder(order);

        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }


    }
}


/* aqui era um outro modo que busquei isolando o calculo do processamento do pedido

Item item1 = new Item("bola de futebol", 100.0);
// Item item2 = new Item("chuteira socyet", 200.0);
//
// // Criação de uma lista de itens
// List<Item> items = Arrays.asList(item1, item2);
//
// // Criação de um pedido
// Order order = new Order(items, false);
//
// // Instancia o OrderCalculator
// OrderCalculator orderCalculator = new OrderCalculator();
//
// // Instancia o OrderProcessor com o OrderCalculator
// OrderProcessor2 orderProcessor2 = new OrderProcessor2(orderCalculator);
//
// //Processa o pedido
// orderProcessor2.processOrder(order);
// System.out.println(items);
//}


 */
