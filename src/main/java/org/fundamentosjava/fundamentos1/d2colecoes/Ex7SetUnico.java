package org.fundamentosjava.fundamentos1.d2colecoes;

import java.util.HashSet;
import java.util.Set;

public class Ex7SetUnico {

    public static void main(String[] args) {

        Set<Integer> hashSetOrdemNaoImporta = new HashSet<>();

        hashSetOrdemNaoImporta.add(1);
        hashSetOrdemNaoImporta.add(3);
        hashSetOrdemNaoImporta.add(5);
        hashSetOrdemNaoImporta.add(1);

        System.out.println("\nOs números sem duplicação: " + hashSetOrdemNaoImporta);
    }

}
