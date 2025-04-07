package org.fundamentosjava.fundamentos2.tema4Strategy;

import java.math.BigDecimal;

public class ShippingMain {

    public static void calculateTotalValue(BigDecimal totalProductsValue, BigDecimal shippingCost) {
        if (shippingCost.compareTo(BigDecimal.ZERO) >= 0) {
            BigDecimal totalValue = totalProductsValue.add(shippingCost);

            System.out.println("Valor do Produto: R$ " + totalProductsValue);
            System.out.println("Valor Total (Produto + Frete): R$ " + totalValue);
        } else {
            System.out.println("Não foi possível calcular o valor total devido a um erro no cálculo do frete.");
        }
    }


    public static void main(String[] args) {

        InsertingProducts insertingProducts = new InsertingProducts();
        InsertCart insertCart = new InsertCart();

//        System.out.println("\n------------->>------ Produtos disponíveis:");
//        for (Product product : insertingProducts.getProductsList()) {
//            System.out.println(product);
//        }

        insertCart.chooseProducts();

        insertCart.listCartSumary();

        BigDecimal totalProductsValue = insertCart.getTotalCartValue();

        CalculateShipping calculateShipping = new CalculateShipping();

        //Listar os produtos do carrinho
//        System.out.println("\n------------->>------ Fechando pedido com os seguintes Produtos no carrinho:");
//        for (int i = 0; i < insertCart.getCart().size(); i++) {
//            System.out.println((i + 1) + ". " + insertCart.getCart().get(i));
//        }

        // Testando SEDEX
        System.out.println("\n--- SEDEX ---");
        calculateShipping.setShippingStrategy(new SedexStrategy());
        BigDecimal totalValueWithSedex = calculateShipping.calculateShipping("RJ");
        calculateTotalValue(totalProductsValue, totalValueWithSedex);



        // Testando PAC
        System.out.println("\n--- PAC ---");
        calculateShipping.setShippingStrategy(new PacStrategy());
        BigDecimal totalValueWithPac = calculateShipping.calculateShipping("RS");
        calculateTotalValue(totalProductsValue, totalValueWithPac);

        // Testando Entrega Imediata
        System.out.println("\n--- Entrega Imediata ---");
        calculateShipping.setShippingStrategy(new ImmediateDelivery());
        BigDecimal totalValueWithDelivery = calculateShipping.calculateShipping("CE");
        calculateTotalValue(totalProductsValue, totalValueWithDelivery);

    }


}
