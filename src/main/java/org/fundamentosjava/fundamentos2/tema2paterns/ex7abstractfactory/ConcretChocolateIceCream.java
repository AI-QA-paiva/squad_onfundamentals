package org.fundamentosjava.fundamentos2.tema2paterns.ex7abstractfactory;

public class ConcretChocolateIceCream implements ChocolateIceCream {

    @Override
    public void makeChocolateIceCream() {
        processorOrder();
    }

    @Override
    public void processorOrder() {
        System.out.println("\nProcessing Chocolate Ice Cream Order");
        System.out.println("\nPosicionar pote na posição marcada para abertura da boca de saida do sorvete");
        System.out.println("liberar valvula do sorvete chocolate");
        System.out.println("Aguardar sensor de nível atingir limite padrão de enchimento do pote");
        System.out.println("Fechar valvula do sorvete chocolate");
        System.out.println("Tocar bip para retirar pote com sorvete");
        System.out.println("Sorvete de chocolate entregue com sucesso\n");
    }

}
