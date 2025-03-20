package org.fundamentosjava.fundamentos1.d2colecoes;

import java.util.*;

public class Ex5Lista {

    public static void main(String[] args) {

        List<String> nomePessoas = new ArrayList<>();
        nomePessoas.add("Maria");
        nomePessoas.add("Tamires");
        nomePessoas.add("Carla");
        nomePessoas.add("Maria");
        nomePessoas.add("Maria");
        nomePessoas.add("João Maria");
        nomePessoas.add("João Felipe");

        Set<String> nomePessoasEmOrdem = new TreeSet<>(nomePessoas);

        System.out.println("\nImprimindo com repetição de nomes: " + nomePessoas);
        Collections.sort(nomePessoas);
        System.out.println("\nTestando ordenar via Colletion: " + nomePessoas);
        System.out.println("\nTestando ordenar via TreeSet, já criando uma nova lista e não permitindo duplicidades: " + nomePessoasEmOrdem);

    }


}
