package org.fundamentosjava.fundamentos1.d3poo.ex3herancaandpolimorf;

import java.util.HashSet;
import java.util.Set;

public class AnimalSomMain {

    public static void main(String[] args) {

        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal galinha = new Galinha();

        Set<Animal> animais = new HashSet<>();
        animais.add(cachorro);
        animais.add(gato);
        animais.add(galinha);

        System.out.println("\nA lista criada apresenta os seguintes animais: \n" + animais);
        System.out.println();

        identifcarSomDoAnimal(animais);

    }

    public static void identifcarSomDoAnimal(Set<Animal> animais) {

        for (Animal animal : animais) {
            animal.fazerSom();
        }
    }

}

/*
public static void identifcarSomDoAnimal(Set<Animal> animais) {

        for (Animal animal : animais) {

            animal.fazerSom();
            if (animal instanceof Gato) {
                animal.fazerSom();
            }

            if (animal instanceof Cachorro) {
                animal.fazerSom();
            }

            if (animal instanceof Galinha) {
                animal.fazerSom();
            }
        }


    }

/*
porque não consegui usar o Set passando uma lista tipo String ?

dificuldade foi que no momento de implementar o metodo que 'fazerSom()' e tentar interar via for tradicional,
a Classe Set A classe Set não possui um método get(int index) >> isso impede interar por index num For tradiconal com 'int i'

recomendado é iterar com um loop for-each
 */

/*
 Set<String> animais = new HashSet<>();
 animais.add("Cachorro");
 animais.add("Gato");

tentei assim
public static void identifcarSomDoAnimal(Set<String> animais) {
 for (int i = 0; i < sons.size(); i++) {
 String animal = sons.get(i);
 if (animal.equals("Gato")) {
 animal1.fazerSom();
 }
 }
}
 */