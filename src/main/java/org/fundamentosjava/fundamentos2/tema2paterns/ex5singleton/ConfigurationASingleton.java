package org.fundamentosjava.fundamentos2.tema2paterns.ex5singleton;

public class ConfigurationASingleton {

    private static ConfigurationASingleton instance;

    // o Construtor é PRIVADO >> visto nesta classe; evitar criar novas instâncias em outros pontos
    private ConfigurationASingleton() {
        //Duvida dei comentarios sobre >> Código de inicialização, dentro desse bloco construtor privado
        //seria o mesmo que  o construtor nomarl, com parametros???
    }


    // Método tipo público que será chamado em outra classe para obter a instância única
    public static ConfigurationASingleton getInstance() {
        if (instance == null) {
            //se existir uma instancia ativa, não ira criar outra
            // se não existir, faz uma Sincronização para garantir que apenas uma instância seja criada em ambientes multithread
            synchronized (ConfigurationASingleton.class) {
                if (instance == null) {
                    instance = new ConfigurationASingleton();
                    System.out.println("\nInstância única criada:\n" + instance.hashCode());
                }
            }
        }
        return instance;
    }


}
