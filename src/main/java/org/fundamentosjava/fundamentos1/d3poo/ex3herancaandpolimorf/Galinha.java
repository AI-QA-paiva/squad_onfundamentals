package org.fundamentosjava.fundamentos1.d3poo.ex3herancaandpolimorf;

public class Galinha extends Animal {

    public void fazerSom() {
        System.out.println("A Galinha emite um som tipo: 'Có-có-có'");
    }

    // para que nao seja impresso o endereço de memoria e seja impresso o nome do objeto
    @Override
    public String toString() {
        return "Galinha";
    }

}
