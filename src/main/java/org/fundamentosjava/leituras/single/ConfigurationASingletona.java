package org.fundamentosjava.leituras.single;

public class ConfigurationASingletona {

    // por padrão >> cria-se um atributo PRIVADO e STATIC da PROPRIA CLASSE (mesmo nome da classe
    // por isso vira uma Instância única da classe >> nome instance dado a variável é padrão tambem
    // uso desse padrao >> exemplo o Spring Boot  >> todas as beans são singleton por padrão: service, cotrollers, repositorys, etc
    // quando usar? querer uma unica instancia da classe, para evitar duplicidade de dados, ou para evitar quebra de regras de negocio (evita fazer  outro new)
    // usado em memoria compartilhada, a mesma informação para todos os usuários

    private static ConfigurationASingletona instance;

    // faz o Construtor com acesso PRIVADO >> somente visto na própria classe; evitara criação de novas instâncias
    private ConfigurationASingletona() {
       //todo vi comentarios sobre >> Código de inicialização, dentro desse bloco construtor privado
        //seria o mesmo que  o construtor nomarl, com parametros???
    }


    // Método tipo público que será chamado em outra classe para obter a instância única
    public static ConfigurationASingletona getInstance() {
        if (instance == null) {
            //se existir uma instancia ativa, não ira criar outra
            // Sincronização para garantir que apenas uma instância seja criada em ambientes multithread
            synchronized (ConfigurationASingletona.class) {
                if (instance == null) {
                    instance = new ConfigurationASingletona();
                    System.out.println("\nInstância única criada:\n" + instance.hashCode());
                }
            }
        }
        return instance;
    }

    // Método de exemplo para executar algum código
    public String execute() {
        String message = "\n>>> Executando código no Singleton <<<";
        //System.out.println("\n" + message);
        return message;

    }
}