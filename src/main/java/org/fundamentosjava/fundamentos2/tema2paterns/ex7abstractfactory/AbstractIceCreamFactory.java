package org.fundamentosjava.fundamentos2.tema2paterns.ex7abstractfactory;

public interface AbstractIceCreamFactory {

    VanillaIceCream makeVanillaIceCream();

    ChocolateIceCream makeChocolateIceCream();

    MixedIceCream makeMixedIceCream();

}
