package org.fundamentosjava.fundamentos1.d3poo.ex1encapsulaandmetodos;

import java.math.BigDecimal;
import java.util.Scanner;

public class OperacaoMain {

    //TODO { 01 } >> verificar quando no cadastro do Titula+Conta, se lançar vazio, sistema não cadastra (vale tanto para conta e para Titula
    // *onde está sendo lançado (armazenado) o dado (seja conta ou nome do titular) quando é informado depois que foi rejeitado o lançamento vazio da primeira vez?

    public static void main(String[] args) {

        ContaBancaria operacoesDaConta = new ContaBancaria();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme Nome do Titular: ");
        String titular = scanner.nextLine();
        operacoesDaConta.checarSeHaTitular(titular, scanner);

        System.out.println("Informe número da Conta do Titular: ");
        String conta = scanner.nextLine();
        operacoesDaConta.checarSeHConta(conta, scanner);

        int servico;

        //TODO { 02 } >> verificar uma forma de encapsular DoWhile essa logica fora da main
        do {
            System.out.println("\nInforme o serviço precisa: " +
                    "\n1: Depositar \n2: Consultar Saldo \n3: Sacar \n4: Sair");

            servico = scanner.nextInt();

            switch (servico) {
                case 1:
                    System.out.println("\nInforme o valor a depositar: ");
                    BigDecimal valorDeposito = scanner.nextBigDecimal();
                    System.out.println("Titular: " + titular); //TODO { 01 }
                    System.out.println("Conta: " + conta);
                    operacoesDaConta.depositar(valorDeposito);
                    break;
                case 2:
                    operacoesDaConta.consultar();
                    break;
                case 3:
                    if (operacoesDaConta.checarSaldoAntesDeSacar()) {
                        System.out.println("\nInforme o valor a sacar: ");
                        BigDecimal valorSaque = scanner.nextBigDecimal();
                        operacoesDaConta.sacar(valorSaque);
                        break;
                    } else {
                        System.out.println("Não foi possível realizar o saque.");
                    }
                    break;
                case 4:
                    System.out.println("Ficamos felizes em atender você. Até mais Sr(a) " + titular + "!");
                    break;
                default:
                    System.out.println("Por gentileza, digite uma das opções válidas.");
            }
        } while (servico != 4);
        scanner.close();
    }

}
