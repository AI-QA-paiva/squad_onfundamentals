package org.fundamentosjava.leituras.single;

public class ExecuteSingletonMaina {

    public static void main(String[] args) {
        // Obtendo a instância do Singleton e executando o método
        ConfigurationASingletona singleton1 = ConfigurationASingletona.getInstance();
        ConfigurationASingletona singleton2 = ConfigurationASingletona.getInstance();
        ConfigurationASingletona singleton3 = ConfigurationASingletona.getInstance();

        System.out.println();
        System.out.println(singleton1.execute() + "HasCode gerado para identificar conexão ' singleton1': " + singleton1.hashCode());
        System.out.println(singleton2.execute() + "HasCode gerado para identificar conexão ' singleton2': " + singleton2.hashCode());
        System.out.println(singleton3.execute() + "HasCode gerado para identificar conexão ' singleton3': " + singleton3.hashCode());
        //System.out.println(singleton4);

        /*
        a função HASHCODE >> retorna um valor inteiro, que é a identidade do objeto
        aqui todos devem ser o mesmo porque somente há uma unica instância singleton

         */

    }

}
