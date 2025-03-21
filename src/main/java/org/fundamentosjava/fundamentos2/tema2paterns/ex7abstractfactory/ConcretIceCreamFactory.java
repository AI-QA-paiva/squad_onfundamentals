package org.fundamentosjava.fundamentos2.tema2paterns.ex7abstractfactory;

public class ConcretIceCreamFactory implements AbstractIceCreamFactory {

    @Override
    public VanillaIceCream makeVanillaIceCream() {
        return new ConcretVanillaIceCream();
    }

    @Override
    public ChocolateIceCream makeChocolateIceCream() {
        return new ConcretChocolateIceCream();
    }

    @Override
    public MixedIceCream makeMixedIceCream() {
        return new ConcretMixedIceCream();
    }
}
