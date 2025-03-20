package org.fundamentosjava.fundamentos1.d3poo.ex1encapsulaandmetodos;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaBancaria {
//TODO { 01 } >> verificar como corrigir o salvamento da informação quando na primeira tentativa tentou lançar titular vazio >> está no TODO na classe Main
// TODO { 02 } >>verificar como tambem evitar que lance algo que nao seja um nome >> tentar letra, simbolo, etc

    private String numeroConta;
    private BigDecimal saldo = BigDecimal.ZERO;
    private String titular;

    public ContaBancaria() {
    }

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = BigDecimal.ZERO;
        this.titular = titular;
    }

    public BigDecimal depositar(BigDecimal deposito) {
        if (deposito.compareTo(BigDecimal.ZERO) == 0 || deposito.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Não é possível depositar o valor de R$ 0,00");
            return saldo;
        }
        saldo = saldo.add(deposito);
        System.out.println("Valor de R$ " + deposito + " foi adicionado ao saldo da sua conta com sucesso!");
        return saldo;
    }

    public void consultar() {
        System.out.println("Seu saldo atual é de R$ " + saldo);
    }

    public boolean checarSaldoAntesDeSacar() {
        if (saldo.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Não há saldo suficiente em sua conta para transações de saque neste momento! Favor realizar um deposito.");
            return false;
        }
        return true;
    }

    public BigDecimal sacar(BigDecimal valorSaque) {

        if (valorSaque.compareTo(BigDecimal.ZERO) == 0) {
            System.out.println("O valor de saque deve ser maior que zero.");
            return saldo;
        }

        if (saldo.compareTo(valorSaque) >= 0) {
            saldo = saldo.subtract(valorSaque);
            System.out.println("Saque no valor de R$ " + valorSaque + " realizado com sucesso!");
        } else {
            System.out.println("Não há saldo suficiente em sua conta para sacar o valor solicitado.");
        }
        return (saldo);
    }

    public void checarSeHaTitular(String titular, Scanner scanner) {
//TODO { 01 }
// TODO { 02 }

        if (titular.isEmpty() || titular.isBlank() || titular == null) {
            boolean validaTitular = true;
            while (validaTitular) {
                System.out.println("Nome do Titula não pode ser vazio");
                titular = scanner.nextLine();
                if (!titular.isEmpty()) {
                    validaTitular = false;
                }
            }
        }
    }

    public void checarSeHConta(String conta, Scanner scanner) {
//TODO { 01 }
// TODO { 02 }

        if (conta.isEmpty()) {
            boolean validaConta = true;
            while (validaConta) {
                System.out.println("Número da conta não pode ser vazio");
                conta = scanner.nextLine();
                if (!conta.isEmpty()) {
                    validaConta = false;
                }
            }
        }
    }

}
