package org.fundamentosjava.fundamentos1.d4and5exceptions.q7filatexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDeArquivo {

    String caminhoArquivo = "caminho/para/seu/arquivo.txt";
    BufferedReader reader = null;

    public LeitorDeArquivo() {
    }

    public LeitorDeArquivo(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public void lerArquivoTexto(String caminhoArquivo) {
        try {
            reader = new BufferedReader(new FileReader(caminhoArquivo));
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                System.err.println("Ocorreu um erro ao fechar o arquivo: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

}
