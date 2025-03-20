package org.fundamentosjava.fundamentos1.d4and5exceptions.q6bancoconta;

import org.fundamentosjava.fundamentos1.d4and5exceptions.exceptionscase.InsufficientFundsException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastrarContaMain {

//TODO { 01 } >> verificar quando no cadastro do Titula+Conta, se lançar vazio, sistema não cadastra (vale tanto para conta e para Titula
// *onde está sendo lançado (armazenado) o dado (seja conta ou nome do titular) quando é informado depois que foi rejeitado o lançamento vazio da primeira vez?
//TODO { 02 } >> verificar uma forma de encapsular While essa logica fora da main
//TODO { 03 } >> verificar uma forma de encapsular While e DoWhile essa logica fora da main


    public static void main(String[] args) {

        ContaBancariaModelo operacoesDaConta = new ContaBancariaModelo();
        List<ContaBancariaModelo> contasRegistradas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


//TODO { 02 }
        while (true) {

            System.out.println("Seja Bem vindo! \nInforme qual operação deseja realizar: \n[1]: Cadastrar Nova Conta \n[2]: Operações Bancárias \n[3]: Encerrar Terminal");
            int inicializarConta = scanner.nextInt();

            if (inicializarConta == 1) {

                scanner.nextLine(); //so para limpar o cache/buffer
                System.out.println("\nInforme Nome do Titular: ");
                String titular = scanner.nextLine();

                System.out.println("Informe número da Conta do Titular: ");
                String conta = scanner.nextLine();

                BigDecimal saldo = BigDecimal.ZERO;

                operacoesDaConta.cadastrarNovasContas(titular, conta, saldo, scanner, contasRegistradas);

            } else if (inicializarConta == 2) {

                //USEI STACK checa se há contas cadastradas
                if (contasRegistradas.isEmpty()) {
                    System.out.println("Nenhuma conta cadastrada. Por Favor, cadastre uma conta primeiro");
                    continue;
                }

                // para validar operacao se tem conta e esta batendo a conta com o banco
                System.out.println("Informe o número da conta para realizar operações: ");
                scanner.nextLine(); // Limpar o buffer
                String numeroConta = scanner.nextLine();

                ContaBancariaModelo contaSelecionada = null;
                for (ContaBancariaModelo conta : contasRegistradas) {
                    if (conta.getNumeroConta().equals(numeroConta)) { //aqui precisei de get/sets
                        contaSelecionada = conta;
                        break;
                    }
                }
                if (contaSelecionada == null) {
                    System.out.println("Conta não encontrada.");
                    continue;
                }

//TODO { 03 }
                int servico;

                do {
                    System.out.println("\nInforme o serviço precisa: " +
                            "\n1: Depositar \n2: Consultar Saldo \n3: Sacar \n4: Sair");

                    servico = scanner.nextInt();

                    switch (servico) {
                        case 1:
                            System.out.println("\nInforme o valor a depositar: ");
                            BigDecimal valorDeposito = scanner.nextBigDecimal();
                            System.out.println("Titular: " + contaSelecionada.getTitular()); //TODO { 01 }
                            System.out.println("Conta: " + contaSelecionada.getNumeroConta());
                            contaSelecionada.fazerDeposito(valorDeposito);
                            break;

                        case 2:
                            contaSelecionada.fazerConsulta();
                            break;

                        case 3:

                            if (contaSelecionada.checarSaldoAntesDeSacar()) { //if (operacoesDaConta.checarSaldoAntesDeSacar()) {
                                System.out.println("\nInforme o valor a sacar: ");
                                BigDecimal valorSaque = scanner.nextBigDecimal();
                                try {
                                    contaSelecionada.fazerSaque(valorSaque);
                                    break;
                                } catch (InsufficientFundsException e) {
                                    System.out.println(e.getMessage());
                                }
                                //break;
                            } else {
                                System.out.println("Não foi possível realizar o saque.");
                            }
                            break;

                        case 4:
                            System.out.println("Ficamos felizes em atender você. Até mais "); //Sr(a) " + titular + "!");
                            break;
                        default:
                            System.out.println("Por gentileza, digite uma das opções válidas.");
                    }
                } while (servico != 4);

            } else if (inicializarConta == 3) { //SUGESTAO STACKSPOT
                System.out.println("Volte sempre!");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
        System.out.println("\nApenas para checar memória de Contas Cadastradas: \n" + contasRegistradas);
    }

}