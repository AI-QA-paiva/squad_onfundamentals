package org.fundamentosjava.fundamentos2.tema4Strategy;

import java.math.BigDecimal;

public interface ShippingStrategy {

    BigDecimal calculateShippingCost(String destinationState);

}
