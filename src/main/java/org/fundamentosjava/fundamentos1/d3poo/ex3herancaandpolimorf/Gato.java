package org.fundamentosjava.fundamentos1.d3poo.ex3herancaandpolimorf;

public class Gato extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("O Gato emite um som tipo: 'Miau groonido'");
    }

    // para que nao seja impresso o endereço de memoria e seja impresso o nome do objeto
    @Override
    public String toString() {
        return "Gato";
    }

}