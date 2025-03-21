package org.fundamentosjava.fundamentos2.tema2paterns.ex7abstractfactory;

public class ConcretVanillaIceCream implements VanillaIceCream {

    @Override
    public void makeVanillaIceCream() {
        processorOrder();
    }

    @Override
    public void processorOrder() {
        System.out.println("\nProcessing Vanilla Ice Cream Order");
        System.out.println("\nPosicionar pote na posição marcada para abertura da boca de saida do sorvete");
        System.out.println("liberar valvula do sorvete baunilha");
        System.out.println("Aguardar sensor de nível atingir limite padrão de enchimento do pote");
        System.out.println("Fechar valvula do sorverte baunilha");
        System.out.println("Tocar bip para retirar pote com sorvete");
        System.out.println("Sorvete de baunilha entregue com sucesso\n");
    }
}
