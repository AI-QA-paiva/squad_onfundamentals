package org.fundamentosjava.leituras.excecoes;

import org.fundamentosjava.fundamentos1.d4and5exceptions.exceptionscase.InvalidNumberException;
import org.fundamentosjava.fundamentos1.d4and5exceptions.q5calculadora.Calculadora;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex5exce {

    public static void main(String[] args) {
        Calculadora fazerOperacaoMatematica = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        int operacao = 0;
        BigDecimal valor1;
        BigDecimal valor2;

        System.out.println("\nCalculadora inicializada!");

        try {
            do {
                try {
                    // Exibe o menu de operações
                    System.out.println("\n<>Informe qual operação deseja realizar: \nSomar: [1] >>> Subtrair:[2] >>> Multiplicar: [3] >>> Dividir: [4] >>> Encerrar: [5]");
                    operacao = scanner.nextInt();

                    // Verifica se o usuário deseja encerrar
                    if (operacao == 5) {
                        System.out.println("Até os próximos cálculos!");
                        break;
                    }

                    // Valida se a operação é válida
                    if (operacao < 1 || operacao > 5) {
                        System.out.println("Opção inválida! Por gentileza, escolha uma operação válida.");
                        continue;
                    }

                    // Solicita os valores para a operação
                    System.out.println("\n<>Informe os valores para executar a operação selecionada de " + fazerOperacaoMatematica.identificarOperacaoEsolhida(operacao));
                    try {
                        valor1 = scanner.nextBigDecimal();
                        valor2 = scanner.nextBigDecimal();
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida! Por favor, insira apenas números.");
                        scanner.nextLine(); // Limpa o buffer do scanner
                        continue;
                    }

                    // Executa a operação selecionada
                    switch (operacao) {
                        case 1:
                            System.out.println(String.format("Operação de Soma!\nValores informados: %s, %s", valor1, valor2));
                            fazerOperacaoMatematica.adicionar(valor1, valor2);
                            break;

                        case 2:
                            System.out.println(String.format("Operação de Subtração!\nValores informados: %s, %s", valor1, valor2));
                            fazerOperacaoMatematica.subtrair(valor1, valor2);
                            break;

                        case 3:
                            System.out.println(String.format("Operação de Multiplicação!\nValores informados: %s, %s", valor1, valor2));
                            fazerOperacaoMatematica.multiplicar(valor1, valor2);
                            break;

                        case 4:
                            System.out.println(String.format("Operação de Divisão!\nValores informados: %s, %s", valor1, valor2));
                            try {
                                checarValoresInputados(valor1, valor2);
                                fazerOperacaoMatematica.dividir(valor1, valor2);
                            } catch (InvalidNumberException e) {
                                System.out.println(e.getMessage());
                            }
                            break;

                        default:
                            System.out.println("Opção inválida! Por gentileza, escolha uma operação válida.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Por favor, insira apenas números inteiros para a operação.");
                    scanner.nextLine(); // Limpa o buffer do scanner
                }
            } while (operacao != 5);

        } finally {
            scanner.close();
        }
    }

    public static void checarValoresInputados(BigDecimal valor1, BigDecimal valor2) throws InvalidNumberException {
        if (valor2.compareTo(BigDecimal.ZERO) == 0) {
            throw new InvalidNumberException("A operação de divisão não pode ter o divisor igual a zero.");
        }
    }

}
