package org.fundamentosjava.fundamentos2.tema2paterns.ex7abstractfactory;

import java.util.Scanner;

public class StartFactory {

    private VanillaIceCream vanillaIceCream;
    private ChocolateIceCream chocolateIceCream;
    private MixedIceCream mixedIceCream;

    public StartFactory(AbstractIceCreamFactory abstractIceCreamFactory) {
        vanillaIceCream = abstractIceCreamFactory.makeVanillaIceCream();
        chocolateIceCream = abstractIceCreamFactory.makeChocolateIceCream();
        mixedIceCream = abstractIceCreamFactory.makeMixedIceCream();
    }

    public void execute(int order) {

        System.out.println("Order in processing: ");

        switch (order) {
            case 1:
                vanillaIceCream.makeVanillaIceCream();
                break;
            case 2:
                chocolateIceCream.makeChocolateIceCream();
                break;
            case 3:
                mixedIceCream.makeMixedIceCream();
                break;
            case 4:
                System.out.println("invalid option");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nSeja muuuuito bem vindo! Nós servimos o melhor sorvete em copinho da região! \nInicializando nossas deliciosas opções de sorvete ..... \nA máquina está pronta! ");

        int action;
        do {
            System.out.println("Digite [1] para escolher o sorvete ou [0] desligar a Maquina: ");

            action = scanner.nextInt();

            if (action == 1) {

                System.out.println("\nEscolha uma das opções: \n[1]: Sorvete de Baunilha.\n[2]: Sorvete de Chocolate.\n[3]: Sorvete Misto.");
                int order = scanner.nextInt();
                AbstractIceCreamFactory abstractIceCreamFactory = new ConcretIceCreamFactory();
                StartFactory startFactory = new StartFactory(abstractIceCreamFactory);
                startFactory.execute(order);
            }
        } while (action != 0);

        System.out.println("\nDê sabor a vida!. Nós temos o sabor que você precisa!\n......Desligando Máquina....\nAté logo.");

    }


}
