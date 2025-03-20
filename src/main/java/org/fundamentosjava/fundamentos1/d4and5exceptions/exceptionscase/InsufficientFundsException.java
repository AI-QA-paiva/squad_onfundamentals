package org.fundamentosjava.fundamentos1.d4and5exceptions.exceptionscase;

public class InsufficientFundsException extends Exception{

    //faz um construtor para poder passar uma mensagem personalizada

    public InsufficientFundsException(String message) {
        super(message);
    }

}
