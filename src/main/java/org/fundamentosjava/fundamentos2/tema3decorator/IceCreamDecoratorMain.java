package org.fundamentosjava.fundamentos2.tema3decorator;

public class IceCreamDecoratorMain {

    public static void main(String[] args) {

        IceCream iceCream = new SimpleIceCream();
        System.out.println(iceCream.makeIceCream());

        iceCream = new StrwberryFrosting(iceCream);
        System.out.println(iceCream.makeIceCream());

        iceCream = new ChocolateFrosting(iceCream);
        System.out.println(iceCream.makeIceCream());
    }
}
