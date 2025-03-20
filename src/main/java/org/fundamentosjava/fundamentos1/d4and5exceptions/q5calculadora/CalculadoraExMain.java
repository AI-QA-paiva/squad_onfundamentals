package org.fundamentosjava.fundamentos1.d4and5exceptions.q5calculadora;

import org.fundamentosjava.fundamentos1.d4and5exceptions.exceptionscase.InvalidNumberException;

import java.math.BigDecimal;
import java.util.Scanner;

public class CalculadoraExMain {

    public static void main(String[] args) throws InvalidNumberException {

        Calculadora fazerOperacaoMatematica = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        int operacao;

        BigDecimal valor1;
        BigDecimal valor2;

        System.out.println("\nCalculadora inicializada!");

        try {
            do {
                System.out.println("\n<>Informe qual operação deseja realizar: \nSomar: [1] >>> Subtrair:[2] >>> Multiplicar: [3] >>> Dividir: [4] >>> Encerrar: [5]");
                operacao = scanner.nextInt();

//                valor1 = scanner.nextBigDecimal();
//                valor2 = scanner.nextBigDecimal();

                switch (operacao) {
                    case 1:
                        System.out.println("Operação de Soma\nInforme dois valores:");
                        valor1 = scanner.nextBigDecimal();
                        valor2 = scanner.nextBigDecimal();
                        fazerOperacaoMatematica.adicionar(valor1, valor2);
                        break;

                    case 2:
                        System.out.println("\nOperação de Subtrair\nInforme dois valores:");
                        valor1 = scanner.nextBigDecimal();
                        valor2 = scanner.nextBigDecimal();
                        fazerOperacaoMatematica.subtrair(valor1, valor2);
                        break;

                    case 3:
                        System.out.println("\nOperação de Multiplicar\nInforme dois valores:");
                        valor1 = scanner.nextBigDecimal();
                        valor2 = scanner.nextBigDecimal();
                        fazerOperacaoMatematica.subtrair(valor1, valor2);
                        fazerOperacaoMatematica.multiplicar(valor1, valor2);
                        break;

                    case 4:
                        System.out.println("\nOperação de Dividir\nInforme dois valores:");
                        valor1 = scanner.nextBigDecimal();
                        valor2 = scanner.nextBigDecimal();
                        checarValoresInputados(valor1, valor2);
                        fazerOperacaoMatematica.dividir(valor1, valor2);
                        break;

                    case 5:
                        System.out.println("Até os próximos calculos");
                        break;
                    default:
                        System.out.println("Opção  Invalida! Por gentileza, verifique qual operação deseja realizar");
                }
            } while (operacao != 5);

            scanner.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checarValoresInputados(Object valor1, Object valor2) throws InvalidNumberException {

        //BigDecimal vl01 = (BigDecimal) valor1;
        BigDecimal vl02 = (BigDecimal) valor2;

        if (vl02.compareTo(BigDecimal.ZERO) == 0) {
            throw new InvalidNumberException("A operação de divisão, não pode ter o Divisor igual a zero.");
        }

        //TODO receber uma string, validar se é uma letra ou é um número >> se for letra solta um exception
//        if (!(valor1 instanceof BigDecimal) || !(valor2 instanceof BigDecimal)) {
//            throw new InvalidNumberException("Os Valores somente podem ser números");
//        }

    }

}
