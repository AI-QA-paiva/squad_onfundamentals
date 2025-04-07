package org.fundamentosjava.leituras.excecoes.calculadoraexception;

import org.fundamentosjava.fundamentos1.d4and5exceptions.exceptionscase.InvalidNumberException;

import java.math.BigDecimal;
import java.util.Scanner;

public class CalculadoraExMainRefatorada {

    public static void main(String[] args) throws InvalidNumberException {

        Scanner scanner = new Scanner(System.in);
        CalculadoraRefatorada calculadora = new CalculadoraRefatorada();

        System.out.println("\nCalculadora inicializada!");

        try {
            int operacao;
            do {
                System.out.println("\n<>Informe qual operação deseja realizar: \nSomar: [1] >>> Subtrair:[2] >>> Multiplicar: [3] >>> Dividir: [4] >>> Encerrar: [5]");

                while (!scanner.hasNextInt()) {
                    System.out.println("Entrada inválida! Por favor, insira um número inteiro correspondente à operação desejada.");
                    scanner.next(); // Consome a entrada inválida
                }

                operacao = scanner.nextInt();

                if (operacao == 5) {
                    System.out.println("Até os próximos cálculos");
                    break;
                }

                if(operacao < 1 || operacao > 4) {
                    System.out.println("Opção Inválida! Por gentileza, verifique qual operação deseja realizar.");
                    continue; // Pula para a próxima iteração do loop
                }

                System.out.println("\n<>Informe os valores para executar a operação selecionada de " + calculadora.identificarOperacaoEscolhida(operacao));
                BigDecimal valor1 = checarValorOperacaoNaoNumerico(scanner, "valor1");
                BigDecimal valor2 = checarValorOperacaoNaoNumerico(scanner, "valor2");

                if (operacao == 4) {
                    try {
                        checarValorZeroNaDivisao(valor2);
                    } catch (InvalidNumberException e) {
                        System.out.println("Erro InvalidNumber: " + e.getMessage());
                        continue;
                    }
                }

                calculadora.executarOperacao(operacao, valor1, valor2);

            } while (operacao != 5);

        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static BigDecimal checarValorOperacaoNaoNumerico(Scanner scanner, String valor) {
        while (true) {
            System.out.printf("Digite o valor para %s: ", valor);
            if (scanner.hasNextBigDecimal()) {
                return scanner.nextBigDecimal();
            } else {
                System.out.println("Entrada inválida! Por favor, insira um número válido.");
                scanner.next(); // Consome a entrada inválida
            }
        }
    }

    public static void checarValorZeroNaDivisao(BigDecimal valor2) throws InvalidNumberException {
        if (valor2.compareTo(BigDecimal.ZERO) == 0) {
            throw new InvalidNumberException("Mensagem do método: A operação de divisão não pode ter o divisor igual a zero.");
        }
    }
}
