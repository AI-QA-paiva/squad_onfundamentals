package org.fundamentosjava.fundamentos1.d3poo.ex3herancaandpolimorf;

public class Cachorro extends Animal{

    @Override
    public void fazerSom() {
        System.out.println("O Cachorro emite um som tipo: 'Au-Au'");
    }

    // para que nao seja impresso o endereço de memoria e seja impresso o nome do objeto
    @Override
    public String toString() {
        return "Cachorro";
    }

}
