package org.fundamentosjava.fundamentos1.d4and5exceptions.q6bancoconta;

import org.fundamentosjava.fundamentos1.d4and5exceptions.exceptionscase.InsufficientFundsException;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class ContaBancariaModelo {

//TODO { 01 } >> verificar como corrigir o salvamento da informação quando na primeira tentativa tentou lançar titular vazio >> está no TODO na classe Main
// TODO { 02 } >>verificar como tambem evitar que lance algo que nao seja um nome >> tentar letra, simbolo, etc

    private String titular;
    private String numeroConta;
    private BigDecimal saldo = BigDecimal.ZERO;

    public ContaBancariaModelo() {
    }

    public ContaBancariaModelo(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = BigDecimal.ZERO;
    }

    //metodos de Operações especificas

    public BigDecimal fazerDeposito(BigDecimal deposito) {
        if (deposito.compareTo(BigDecimal.ZERO) == 0 || deposito.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Não é possível depositar o valor igual a R$ 0,00 ou valor negativo.");
            return saldo;
        }
        saldo = saldo.add(deposito);
        System.out.println("Valor de R$ " + deposito + " foi adicionado ao saldo da sua conta com sucesso!");
        return saldo;
    }

    public void fazerConsulta() {
        System.out.println("Seu saldo atual é de R$ " + saldo);
    }

    public boolean checarSaldoAntesDeSacar() {
        if (saldo.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Não há saldo suficiente em sua conta para transações de saque neste momento! Favor realizar um deposito.");
            return false;
        }
        return true;
    }

    public BigDecimal fazerSaque(BigDecimal valorSaque) throws InsufficientFundsException {

        if (valorSaque.compareTo(BigDecimal.ZERO) == 0 || valorSaque.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("O valor do saque deve ser maior que zero. Verificar.");
            return saldo;
        }

        if (saldo.compareTo(valorSaque) >= 0) {
            saldo = saldo.subtract(valorSaque);
            System.out.println("Saque no valor de R$ " + valorSaque + " realizado com sucesso!");
        } else {
            //System.out.println("Não há saldo suficiente em sua conta para sacar o valor solicitado."); SUGESTAO STACK
            throw new InsufficientFundsException("Não há saldo suficiente em sua conta para sacar o valor solicitado.");
        }
        return (saldo);
    }

    //metodos para verificação de dados de entrada:
    public void checarSeTitularValido(String titular, Scanner scanner) {
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

    public void checarSeContaValida(String conta, Scanner scanner) {
//TODO { 01 }
//TODO { 02 }
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

    @Override
    public String toString() {
        return "ContaBancariaModelo{" +
                "titular='" + titular + '\'' +
                ", conta='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public void cadastrarNovasContas(String titular, String conta, BigDecimal saldo, Scanner scanner, List<ContaBancariaModelo> contasRegistradas) {

        checarSeTitularValido(titular, scanner);
        checarSeContaValida(conta, scanner);

        // Verificar se o número da conta já existe
        boolean contaExiste = false;
        for (ContaBancariaModelo contaExistente : contasRegistradas) {
            if (contaExistente.getNumeroConta().equals(conta)) {
                contaExiste = true;
                break;
            }
        }

        if (contaExiste) {
            System.out.println("Erro: O número da conta já está cadastrado. Por favor, use um número diferente.");
        } else {
            ContaBancariaModelo contaCriada = new ContaBancariaModelo(titular, conta); //, BigDecimal.ZERO
            contasRegistradas.add(contaCriada);
            System.out.println("\nConta cadastrada com sucesso! \n" + contasRegistradas);
        }

    }

    //metodos de acesso aos atributos gets/sets

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

}
