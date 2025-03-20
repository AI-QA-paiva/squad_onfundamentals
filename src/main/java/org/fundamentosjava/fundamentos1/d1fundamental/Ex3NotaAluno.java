package org.fundamentosjava.fundamentos1.d1fundamental;

import java.util.Scanner;

public class Ex3NotaAluno {

    public static void main(String[] args) {

        float nota01 = 0f;
        float nota02 = 0f;
        float media = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInforme a primeira nota: ");
        nota01 = scanner.nextFloat();

        System.out.println("Informe a segunda nota: ");
        nota02 = scanner.nextFloat();

        media = (nota01 + nota02) / 2;

        if (media >= 7) {
            System.out.println("Aluno está aprovado, com a média de: " + media);
        } else if (media < 7 && media >= 4) {
            System.out.println("Aluno está em recuperação, com a média de: " + media);
        } else {
            System.out.println("Aluno está reprovado, com a média de: " + media);
        }

    }


}
