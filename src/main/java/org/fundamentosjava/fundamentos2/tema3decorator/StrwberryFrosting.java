package org.fundamentosjava.fundamentos2.tema3decorator;

public class StrwberryFrosting extends IceCreamDecorator {

    public StrwberryFrosting(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String makeIceCream() {
        return super.makeIceCream() + " + cobertura de morango";
    }
}
