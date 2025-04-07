package org.fundamentosjava.fundamentos1.d4and5exceptions.q5calculadora;

import java.math.BigDecimal;

public class Calculadora {

    private BigDecimal valor1;
    private BigDecimal valor2;

    public Calculadora(BigDecimal valor1, BigDecimal valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public Calculadora() {
    }

    public BigDecimal adicionar(BigDecimal valor1, BigDecimal valor2){

        BigDecimal somar = valor1.add(valor2);
        System.out.println("A soma é igual a = " + somar);
        return somar;

    }

    public BigDecimal subtrair(BigDecimal valor1, BigDecimal valor2){

        BigDecimal subtrair = valor1.subtract(valor2);
        System.out.println("A subtração é igual a = " + subtrair);
        return subtrair;

    }

    public BigDecimal multiplicar(BigDecimal valor1, BigDecimal valor2){

        BigDecimal multiplicar = valor1.multiply(valor2);
        System.out.println("A multiplicação é igual a = " + multiplicar);
        return multiplicar;

    }
    public BigDecimal dividir(BigDecimal valor1, BigDecimal valor2) {

        try {
            BigDecimal dividir = valor1.divide(valor2,5, BigDecimal.ROUND_HALF_UP);
            System.out.println("A divisão é igual a = " + dividir);
            return dividir;
        } catch (ArithmeticException e) {
            if (e.getMessage().equals("Division by zero")) {
                System.out.println("Operação inválida! O divisor não pode ser zero. Favor verificar.");
            }
            return null;
        }
    }

    public String identificarOperacaoEsolhida(int operacao) {
        switch (operacao) {
            case 1:
                return "Somar: ";
            case 2:
                return "Subtrair: ";
            case 3:
                return "Multiplicar: ";
            case 4:
                return "Dividir: ";
            default:
                return "Opção  Invalida! Por gentileza, verifique qual operação deseja realizar";
        }
    }



}