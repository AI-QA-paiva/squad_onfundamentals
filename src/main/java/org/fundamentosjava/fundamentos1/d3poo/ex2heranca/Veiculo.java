package org.fundamentosjava.fundamentos1.d3poo.ex2heranca;

public class Veiculo {

    private String marca; // = "Ford";
    private String modelo; // = "Ranger";
    private int ano; // = 2025;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirDetalhes(){};

}