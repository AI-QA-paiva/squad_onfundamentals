package org.fundamentosjava.fundamentos2.tema4Strategy;

import java.math.BigDecimal;

public class CalculateShipping {

    private ShippingStrategy shippingStrategy;

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public BigDecimal calculateShipping(String destinationState) {
        if (shippingStrategy == null) {
            throw new IllegalStateException("Estratégia de envio não definida.");
        }
        return shippingStrategy.calculateShippingCost(destinationState);
    }


}
