package org.fundamentosjava.fundamentos1.d4and5exceptions.exceptionscase;

public class InvalidNumberException extends Exception {

    //faz um construtor para poder passar uma mensagem personalizada
    //mensagem será passada no metodo que trata a exceção

    public InvalidNumberException(String message) {
        super(message);
    }
}
