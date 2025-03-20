package org.fundamentosjava.fundamentos2.tema1solid.ex3isp;

public class ProcessCreditCardPayment implements PaymentProcessor {

    @Override
    public void execute() {

        //logica para tipo de pagamento desta classe
        System.out.println("Processing credit card payment");
    }
}
