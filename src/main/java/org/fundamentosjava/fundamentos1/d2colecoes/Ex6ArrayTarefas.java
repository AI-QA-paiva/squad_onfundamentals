package org.fundamentosjava.fundamentos1.d2colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex6ArrayTarefas {

    public static void main(String[] args) {

        List<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int digitadoPeloUsuario;

        do {
            System.out.println("\nO que você deseja fazer? ");
            System.out.println("Digite: \n1: Para inserir Tarefa(s) \n2: Para listar Tarefas \n3: Para remover Tarefa \n4: Para sair do sistema");
            digitadoPeloUsuario = scanner.nextInt();
            scanner.nextLine();

            switch (digitadoPeloUsuario) {
                case 1:
                    System.out.println("Informe a tarefa: ");
                    String tarefaLancada = scanner.nextLine();
                    tarefas.add(tarefaLancada);
                    System.out.println("foi adicionado com sucesso");
                    break;
                case 2:
                    System.out.println("As tarefas listadas são: ");
                    System.out.println(tarefas);
                    break;
                case 3:
                    System.out.println("Indique o número da tarefa a ser cancelada: ");
                    int cancelarNumero = scanner.nextInt();
                    tarefas.remove(cancelarNumero);
                    break;
                default:
                    System.out.println("Até já!");
            }
        } while (digitadoPeloUsuario != 4);
        scanner.close();
    }

}

/*
 System.out.println("Deseja lançar uma nova tarefa?\nDigite Sim ou Digite Não");
 String intencaoDoUsuario = scanner.nextLine();
 if(intencaoDoUsuario.equalsIgnoreCase("Sim")){
 String tarefaLancada = scanner.nextLine();
 tarefas.add(tarefaLancada);
 }


 System.out.println("Deseja lançar uma nova tarefa?\nDigite Sim ou Digite Não");
 String intencaoDoUsuario = scanner.nextLine();
validando se populou a lista
 System.out.println("a lista contem: " + tarefas);
 System.out.println("tamanho da lista: " + tarefas.size());
*/