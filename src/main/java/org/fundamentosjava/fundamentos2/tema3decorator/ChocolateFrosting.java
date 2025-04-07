package org.fundamentosjava.fundamentos2.tema3decorator;

public class ChocolateFrosting extends IceCreamDecorator {

    public ChocolateFrosting(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String makeIceCream() {
        return super.makeIceCream() + " + cobertura de chocolate";
    }
}
