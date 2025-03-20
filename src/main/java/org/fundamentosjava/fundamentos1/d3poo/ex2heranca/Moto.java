package org.fundamentosjava.fundamentos1.d3poo.ex2heranca;

public class Moto extends Veiculo{

    private String tipoDeGuidao = "12pol Alpes";
    private String versaoModelo = "Custom";
    private String tipoDeChassi = "Monobloco";
    private String cilindradasMotor = "250cc";
    private String tipoDeSuspensao = "Cilindro único traseiro tipo hidraulico com molas helicoidais e cilindros pneumaticos dianteiros";

    public String getTipoDeGuidao() {
        return tipoDeGuidao;
    }

    public void setTipoDeGuidao(String tipoDeGuidao) {
        this.tipoDeGuidao = tipoDeGuidao;
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

    public String getCilindradasMotor() {
        return cilindradasMotor;
    }

    public void setCilindradasMotor(String cilindradasMotor) {
        this.cilindradasMotor = cilindradasMotor;
    }

    public String getTipoDeSuspensao() {
        return tipoDeSuspensao;
    }

    public void setTipoDeSuspensao(String tipoDeSuspensao) {
        this.tipoDeSuspensao = tipoDeSuspensao;
    }

    //metodo para exibirDetalhes trazendo as características da moto
    @Override
    public void exibirDetalhes() {
        System.out.println("\n(INTERFACE) Veículo que possui dados de uma Moto: ");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Versão: " + getVersaoModelo());
        System.out.println("Potência Motor: " + getCilindradasMotor());
        System.out.println("Tipo de Guidão: " + getTipoDeGuidao());
        System.out.println("Tipo de Suspensão: " + getTipoDeSuspensao());
        System.out.println("Tipo de Chassis: " + getTipoDeChassi());
    }

}

/*
Guidão Flat.
Guidão Rise.
Guidão Borboleta.
Guidão Comfort.
Guidão Drop.
Guidão Bullhorn.
Guidão Cruiser.
 */
