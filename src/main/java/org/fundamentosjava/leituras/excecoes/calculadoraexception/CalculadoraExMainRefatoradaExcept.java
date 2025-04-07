package org.fundamentosjava.leituras.excecoes.calculadoraexception;

import org.fundamentosjava.fundamentos1.d4and5exceptions.exceptionscase.InvalidNumberException;

import java.math.BigDecimal;
import java.util.Scanner;

public class CalculadoraExMainRefatoradaExcept {

    public static void main(String[] args) {
        CalculadoraRefatorada fazerOperacaoMatematica = new CalculadoraRefatorada();
        Scanner scanner = new Scanner(System.in);
        int operacao = 0;
        BigDecimal valor1;
        BigDecimal valor2;

        System.out.println("\nCalculadora inicializada!");

        try {
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

                try {
                    validarOperacao(operacao); // Lança exceção se a operação for inválida
                } catch (InvalidOperationException e) {
                    System.out.println("Erro: " + e.getMessage());
                    continue; // Pula para a próxima iteração do loop
                }

                System.out.println("\n<>Informe os valores para executar a operação selecionada de " + fazerOperacaoMatematica.identificarOperacaoEscolhida(operacao));
                valor1 = checarValorOperacaoNaoNumerico(scanner, "valor1");
                valor2 = checarValorOperacaoNaoNumerico(scanner, "valor2");

                if (operacao == 4) {
                    try {
                        checarValorZeroNaDivisao(valor2);
                    } catch (InvalidNumberException e) {
                        System.out.println("Erro InvalidNumber: " + e.getMessage());
                        continue;
                    }
                }

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
                        fazerOperacaoMatematica.dividir(valor1, valor2);
                        break;
                }
            } while (operacao != 5);
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    //encapsulou o método validarOperacao tirando do corpo da main, e criando uma classe personalizada de excepiton
    //torno o codigo robusto e esconde o como o metodo validarOperaão trabalha

    public static void validarOperacao(int operacao) throws InvalidOperationException {
        if (operacao < 1 || operacao > 4) {
            throw new InvalidOperationException("EXCEPTION VIA PERSONALIZACAO: Opção Inválida! Por gentileza, verifique qual operação deseja realizar.");
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
