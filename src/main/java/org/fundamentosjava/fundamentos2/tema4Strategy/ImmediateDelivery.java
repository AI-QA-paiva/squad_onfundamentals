package org.fundamentosjava.fundamentos2.tema4Strategy;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ImmediateDelivery implements ShippingStrategy {

    private static final String ALLOWED_STATE = "CE";
    private static final BigDecimal SHIPPING_COST = BigDecimal.valueOf(30.0);


    @Override
    public BigDecimal calculateShippingCost(String destinationState) {

        if (!destinationState.equalsIgnoreCase(ALLOWED_STATE)) {
            throw new IllegalArgumentException("Entrega Imediata disponível apenas para o estado do Ceará (CE).");
        }

        LocalDate shippingDate = LocalDate.now();
        LocalDate estimateDate = shippingDate.plusDays(1);

        System.out.println("Entrega Imediata: R$ " + SHIPPING_COST);
        System.out.println("Data de envio: " + shippingDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Estimativa de entrega: " + estimateDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        return SHIPPING_COST;
    }
}
