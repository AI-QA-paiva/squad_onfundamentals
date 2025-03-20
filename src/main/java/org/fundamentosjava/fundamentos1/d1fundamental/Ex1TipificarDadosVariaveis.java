package org.fundamentosjava.fundamentos1.d1fundamental;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex1TipificarDadosVariaveis {

    public static void main(String[] args){

        char combatenteGuerra;
        String isencaoIPTU;
        boolean iptuQuitado;
        int numeroCasa;
        double valorImovel;

        combatenteGuerra = 'N';
        isencaoIPTU = "Não";
        iptuQuitado = false;
        numeroCasa = 1323;
        valorImovel = 230000.0;

        if(combatenteGuerra == 'S'){
            isencaoIPTU = "Sim";
            iptuQuitado = true;
        }

        String replaceIptuAtivo;
        if(iptuQuitado == true){
            replaceIptuAtivo = "Sim";
        } else {
            replaceIptuAtivo = "Não";
        }

        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("\nDados informados: " +
                "\nEx-Combatente de guerra? " + combatenteGuerra +
                "\nNúmero do imóvel: " + numeroCasa +
                "\nValor do Imóvel: R$ " + formatoMoeda.format(valorImovel) +
                "\nImóvel é isento? " + isencaoIPTU +
                "\nIPTU está quitado? " + replaceIptuAtivo);

    }




}
