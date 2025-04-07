package org.fundamentosjava.fundamentos2.tema4Strategy;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SedexStrategy implements ShippingStrategy {

    private static final BigDecimal COST_RJ_SP = BigDecimal.valueOf(25.0);
    private static final BigDecimal COST_RS = BigDecimal.valueOf(45.0);
    private static final BigDecimal COST_NORTH = BigDecimal.valueOf(60.0);
    private static final int DELIVERY_DAYS = 5;


    @Override
    public BigDecimal calculateShippingCost(String destinationState) {

        BigDecimal shippingCost;

        switch (destinationState.toUpperCase()) {
            case "RJ":
            case "SP":
                shippingCost = COST_RJ_SP;
                break;
            case "RS":
                shippingCost = COST_RS;
                break;
            case "PA":
            case "AM":
            case "RR":
                shippingCost = COST_NORTH;
                break;
            default:
                throw  new IllegalArgumentException("Esse Estado não possui entregas por SEDEX.");
        }

        LocalDate shippingDate = LocalDate.now();
        LocalDate estimateDate = shippingDate.plusDays(DELIVERY_DAYS);
        System.out.println("Frete SEDEX: R$ " + shippingCost);
        System.out.println("Data de envio: " + shippingDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Estimativa de entrega: " + estimateDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        return shippingCost;

    }

}
