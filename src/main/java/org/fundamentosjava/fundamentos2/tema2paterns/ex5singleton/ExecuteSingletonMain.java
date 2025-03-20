package org.fundamentosjava.fundamentos2.tema2paterns.ex5singleton;

import org.fundamentosjava.leituras.single.ConfigurationASingletona;

public class ExecuteSingletonMain {

    public static void main(String[] args) {
        // Obtendo a instância do Singleton e executando o método
        ConfigurationASingleton singleton1 = ConfigurationASingleton.getInstance();
        ConfigurationASingleton singleton2 = ConfigurationASingleton.getInstance();
        ConfigurationASingleton singleton3 = ConfigurationASingleton.getInstance();

        System.out.println();
        System.out.println("HasCode gerado para identificar conexão ' singleton1': " + singleton1.hashCode());
        System.out.println("HasCode gerado para identificar conexão ' singleton2': " + singleton2.hashCode());
        System.out.println("HasCode gerado para identificar conexão ' singleton3': " + singleton3.hashCode());

        /*
        a função HASHCODE >> retorna um valor inteiro, que é a identidade do objeto
        aqui todos devem ser o mesmo porque somente há uma unica instância singleton

         */

    }

}
