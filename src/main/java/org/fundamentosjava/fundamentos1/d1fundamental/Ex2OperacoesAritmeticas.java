package org.fundamentosjava.fundamentos1.d1fundamental;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Ex2OperacoesAritmeticas {

    public static void main(String[] args){

        int number1, number2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInforme dois números inteiros:");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();

        int soma = number1 + number2;
        int subtracao = number1 - number2;
        int multiplicao = number1 * number2;
        double divisao = (double) number1 / number2;
        BigDecimal divisaoPrecisa = BigDecimal.valueOf(number1).divide(BigDecimal.valueOf(number2),10, RoundingMode.HALF_UP);
        int modulo = number1 % number2;

        System.out.println("As operações aritméticas são: " +
                "\nsoma = " + soma +
                "\nsubtração = " + subtracao +
                "\nmultiplicação = " + multiplicao +
                "\ndivisão = " + divisao +
                "\ndivisão (BigDecimal) = " + divisaoPrecisa +
                "\nmódulo (resto) = " + modulo);
    }

}

/*
Usei Bigdecimal na divisão:
1. obter precisao no resultado divisão

para converter divisão de inteiro para resultado em BigDecimal usei:
2. metodo conversot valueof da classe BigDecimal,
3. função divide da classe BigDecimal,

** função não ativa desde java9 >> BigDecimal.ROUND_HALF_UP >> que arredonda pra cima

*/

