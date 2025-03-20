package org.fundamentosjava.fundamentos1.d2colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex8MapsTraduz {

    public static void main (String[] args) {

        Map<String, String> traduz = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int digitadoPeloUsuario = 1;

        do {
            System.out.println("\nO que você deseja fazer? ");
            System.out.println("Digite: \n1: Para inserir um Vocábulo e Sua tradução \n2: Consultar uma Vocabulo no Dicionário \n3: Para sair do dicionario");
            digitadoPeloUsuario = scanner.nextInt();
            scanner.nextLine();

            switch (digitadoPeloUsuario) {
                case 1:
                    traduz.put(scanner.nextLine(), scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Digite o vocábulo: ");
                    String vocabuloAConsultar = scanner.nextLine();
                    System.out.println("A tradução é: " + traduz.get(vocabuloAConsultar));
                    break;
                case 3:
                    System.out.println("Aprender juntos, é o que nos motiva! Até mais.");
                    break;
                default:
                    System.out.println("\"Opção inválida: Digite 1 ou Digite 2 ou Digite 3\"");
            }
        } while (digitadoPeloUsuario != 3);

        scanner.close();
        System.out.println(traduz);
    }

}

/*
if (digitadoPeloUsuario != 1 || digitadoPeloUsuario != 2 || digitadoPeloUsuario != 3) {
 System.out.println("Opção inválida: Digite 1 ou Digite 2 ou Digite 3");
 } else {}
 */