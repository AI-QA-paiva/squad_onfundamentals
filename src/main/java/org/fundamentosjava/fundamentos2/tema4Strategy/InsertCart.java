package org.fundamentosjava.fundamentos2.tema4Strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class InsertCart {

    private List<Product> cart = new ArrayList<>();
    private InsertingProducts insertingProducts = new InsertingProducts();
    Scanner scanner = new Scanner(System.in);

    public void chooseProducts() {

        boolean keepShopping = true; // Variável para controlar o loop de compras

        while (keepShopping) {
            displayProducts();
            int productIndex = getProductIndex();

            if (isValidProductIndex(productIndex)) {
                int quantity = getProductQuantity();

                if (isValidQuantity(quantity)) {
                    addProductToCart(productIndex, quantity);
                } else {
                    System.out.println("Quantidade inválida. Deve ser maior que zero. Tente novamente.");
                }
            } else {
                System.out.println("Número inválido. Tente novamente.");
            }

            keepShopping = askToContinueShopping();
        }
    }

    // para listar os produtos existentes criados na classe InsertingProducts >> cliente vai ver o que tem no console
    private void displayProducts() {
        List<Product> productsList = insertingProducts.getProductsList();
        System.out.println("\n------------->>------ Escolha um produto para adicionar ao carrinho:");
        for (int i = 0; i < productsList.size(); i++) {
            System.out.println((i + 1) + ". " + productsList.get(i));
        }
    }

    //cliente viu a lista, agora vai escolher qual produto irá adicionar no carrinho >> de forma acumulativa
    private int getProductIndex() {
        System.out.print("\nDigite o número do produto que deseja adicionar ao carrinho: ");
        try {
            return Integer.parseInt(scanner.nextLine().trim()) - 1;
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
            return -1; // Retorna um índice inválido
        }
    }

    // Verifica se o índice do produto é válido
    private boolean isValidProductIndex(int productIndex) {
        List<Product> productsList = insertingProducts.getProductsList();
        return productIndex >= 0 && productIndex < productsList.size();
    }

    // Método para obter a quantidade do produto
    private int getProductQuantity() {
        System.out.println("Digite a quantidade do produto: ");
        String quantityInput = scanner.nextLine().trim();

        if (quantityInput.isEmpty()) {
            System.out.println("Quantidade não pode ser vazia. Tente novamente.");
            return -1; // Retorna uma quantidade inválida
        }

        try {
            return Integer.parseInt(quantityInput);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
            return -1; // Retorna uma quantidade inválida
        }
    }

    // Verifica se a quantidade é válida
    private boolean isValidQuantity(int quantity) {
        return quantity > 0;
    }

    //Método para adicionar o produto ao carrinho
    private void addProductToCart(int productIndex, int quantity) {
        List<Product> productsList = insertingProducts.getProductsList();
        Product product = productsList.get(productIndex);

        for (int i = 0; i < quantity; i++) {
            cart.add(product);
        }

        System.out.println("Produto adicionado ao carrinho: " + product + "Quantidade: " + quantity);
        //System.out.println("Quantidade adicionada ao carrinho: " + quantity);
    }

    //saber se o cliente ainda quer adicionar mais produtos ou não
    private boolean askToContinueShopping() {
        System.out.print("\nDeseja fechar o carrinho e calcular o total? (s/n): ");
        String response = scanner.nextLine().trim().toLowerCase();
        return !response.equals("s");
    }


    //cacula o valor total do carrinho; mas não mostra os produtos
    public BigDecimal getTotalCartValue() {

        BigDecimal total = BigDecimal.ZERO;

        for (Product product : cart) {
            total = total.add(product.getPrice());
        }
        return total.setScale(2, RoundingMode.HALF_UP);
    }

//    public List<Product> getCart() {
//        return cart;
//    }

    public void listCartSumary () {

        Map<Product, Integer> productSumary = new HashMap<>();

        for (Product product : cart) {
            productSumary.put(product, productSumary.getOrDefault(product, 0) + 1);
        }

        System.out.println("\n------------->>------ Resumo do Carrinho:");
        for (Map.Entry<Product, Integer> entry : productSumary.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            BigDecimal totalValue = product.getPrice().multiply(BigDecimal.valueOf(quantity)).setScale(2, RoundingMode.HALF_UP);
            System.out.println(product.getName() + " - Quantidade: " + quantity + " Total = R$ " + totalValue);
        }
    }

}
