package org.fundamentosjava.fundamentos1.d3poo.ex2heranca;

public class Carro extends Veiculo {

    private int numeroDePortas = 4;
    private String versaoModelo = "RTX-Discovery";
    private String tipoDeChassi = "Carroceria aberta para Carga";
    private String potenciaMotor = "3.3";
    private String tipoDeSuspensao = "Feixo de molas duplamente reforçadas e cilindros dianteiros eletromecanicos";

    public Carro(int numeroDePortas, String versaoModelo, String tipoDeChassi, String potenciaMotor, String tipoDeSuspensao) {
        //todo para ajustar
        this.numeroDePortas = numeroDePortas;
        this.versaoModelo = versaoModelo;
        this.tipoDeChassi = tipoDeChassi;
        this.potenciaMotor = potenciaMotor;
        this.tipoDeSuspensao = tipoDeSuspensao;
    }

    public Carro() {
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public String getVersaoModelo() {
        return versaoModelo;
    }

    public void setVersaoModelo(String versaoModelo) {
        this.versaoModelo = versaoModelo;
    }

    public String getTipoDeChassi() {
        return tipoDeChassi;
    }

    public void setTipoDeChassi(String tipoDeChassi) {
        this.tipoDeChassi = tipoDeChassi;
    }

    public String getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(String potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public String getTipoDeSuspensao() {
        return tipoDeSuspensao;
    }

    public void setTipoDeSuspensao(String tipoDeSuspensao) {
        this.tipoDeSuspensao = tipoDeSuspensao;
    }


    //metodo para exibirDetalhes trazendo as características do carro
    @Override
    public void exibirDetalhes() {
        System.out.println("\n(INTERFACE) Veículo que possui dados de um Carro: ");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Marca: " + getAno());
        System.out.println("Versão: " + getVersaoModelo());
        System.out.println("Qtde de Portas: " + getNumeroDePortas());
        System.out.println("Potencia Motor: " + getPotenciaMotor());
        System.out.println("Tipo de Chassis: " + getTipoDeChassi());
        System.out.println("Tipo de Suspensão: " + getTipoDeSuspensao());
    }

}
