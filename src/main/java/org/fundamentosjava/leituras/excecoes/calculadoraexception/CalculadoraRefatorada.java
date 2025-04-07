package org.fundamentosjava.leituras.excecoes.calculadoraexception;

import java.math.BigDecimal;

public class CalculadoraRefatorada {

    public BigDecimal adicionar(BigDecimal valor1, BigDecimal valor2) {
        BigDecimal resultado = valor1.add(valor2);
        System.out.println("A soma é igual a = " + resultado);
        return resultado;
    }

    public BigDecimal subtrair(BigDecimal valor1, BigDecimal valor2) {
        BigDecimal resultado = valor1.subtract(valor2);
        System.out.println("A subtração é igual a = " + resultado);
        return resultado;
    }

    public BigDecimal multiplicar(BigDecimal valor1, BigDecimal valor2) {
        BigDecimal resultado = valor1.multiply(valor2);
        System.out.println("A multiplicação é igual a = " + resultado);
        return resultado;
    }

    public BigDecimal dividir(BigDecimal valor1, BigDecimal valor2) {
        BigDecimal resultado = valor1.divide(valor2, 5, BigDecimal.ROUND_HALF_UP);//resolveu a divisao 2/3 que da um numero muitos decimais
        System.out.println("A divisão é igual a = " + resultado);
        return resultado;
    }

    public String identificarOperacaoEscolhida(int operacao) {
        switch (operacao) {
            case 1:
                return "Somar";
            case 2:
                return "Subtrair";
            case 3:
                return "Multiplicar";
            case 4:
                return "Dividir";
            default:
                return "Opção inválida! Por gentileza, verifique qual operação deseja realizar";
        }
    }

    public void executarOperacao(int operacao, BigDecimal valor1, BigDecimal valor2) {
        switch (operacao) {
            case 1:
                adicionar(valor1, valor2);
                break;
            case 2:
                subtrair(valor1, valor2);
                break;
            case 3:
                multiplicar(valor1, valor2);
                break;
            case 4:
                dividir(valor1, valor2);
                break;
            default:
                System.out.println("Opção inválida! Por gentileza, verifique qual operação deseja realizar.");
        }
    }

}
