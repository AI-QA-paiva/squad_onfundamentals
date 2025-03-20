package org.fundamentosjava.fundamentos1.d3poo.ex2heranca;

public class ModVeicHerancaMain {

    public static void main (String[] args) {

        Carro criandoNovoCarro = new Carro();

        criandoNovoCarro.setMarca("Ford");
        criandoNovoCarro.setModelo("Ranger");
        criandoNovoCarro.setAno(2025);
        criandoNovoCarro.setVersaoModelo("Raptor XLT");
        criandoNovoCarro.setNumeroDePortas(5);
        criandoNovoCarro.setPotenciaMotor("3.3");
        criandoNovoCarro.setTipoDeChassi("Carroceria aberta para carga");
        criandoNovoCarro.setTipoDeSuspensao("Feixo de molas duplamente reforçadas e cilindros dianteiros eletromecanicos");

        Moto criandoNovaMoto = new Moto();

        criandoNovaMoto.setMarca("Honda");
        criandoNovaMoto.setModelo("CBX");
        criandoNovaMoto.setAno(2020);
        criandoNovaMoto.setVersaoModelo("3000");
        criandoNovaMoto.setCilindradasMotor("500cc");
        criandoNovaMoto.setTipoDeGuidao("12pol ALPES");
        criandoNovaMoto.setTipoDeSuspensao("Cilindro único traseiro tipo hidraulico com molas helicoidais e cilindros pneumaticos dianteiros");
        criandoNovaMoto.setTipoDeChassi("Monobloco");

        //dois cenários:
 /*cenário 01 >> se instancio um objeto a partir da propria classe especifica >> e extenda da Superclasse Veiculo
 consigo pegar tanto os atributos da Superclasse Veiculo como também da classe especifica Carro ou Moto
 */

        criandoNovoCarro.exibirDetalhes();
        criandoNovaMoto.exibirDetalhes();

 /*cenário 02 >> se instancio um objeto a partir da superclasse Veiculo
 os atributos que pego é apenas da classe Veiculo e nao pego da classe Carro ou moto
 Veiculo e Carro e Moto >> estando com metodos Get/Set declarados
 */
        Veiculo criandoCarro = new Carro();
        Veiculo criandoMoto = new Moto();



        System.out.println("\nVeículo que possui dados de um CARRO: ");
        System.out.println(criandoCarro.getMarca());
        System.out.println(criandoCarro.getModelo());
        System.out.println(criandoCarro.getAno());

        System.out.println("\nVeículo que possui dados de uma MOTO: ");
        System.out.println(criandoMoto.getMarca());
        System.out.println(criandoMoto.getModelo());
        System.out.println(criandoMoto.getAno());

    }

}

/*
System.out.println("\nVeículo que possui dados de um CARRO: ");
 System.out.println("Marca: " + criandoNovoCarro.getMarca());
 System.out.println("Modelo: " + criandoNovoCarro.getModelo());
 System.out.println("Ano: " + criandoNovoCarro.getAno());
 System.out.println("Versão: " + criandoNovoCarro.getVersaoModelo());
 System.out.println("Qtde de Portas: " + criandoNovoCarro.getNumeroDePortas());
 System.out.println("Potencia Motor: " + criandoNovoCarro.getPotenciaMotor());
 System.out.println("Tipo de Chassis: " + criandoNovoCarro.getTipoDeChassi());
 System.out.println("Tipo de Suspensão: " + criandoNovoCarro.getTipoDeSuspensao());

System.out.println("\nVeículo que possui dados de uma MOTO: ");
 System.out.println("Marca: " + criandoNovaMoto.getMarca());
 System.out.println("Modelo: " + criandoNovaMoto.getModelo());
 System.out.println("Ano: " + criandoNovaMoto.getAno());
 System.out.println("Versão: " + criandoNovaMoto.getVersaoModelo());
 System.out.println("Potência Motor: " + criandoNovaMoto.getCilindradasMotor());
 System.out.println("Tipo de Guidão: " + criandoNovaMoto.getTipoDeGuidao());
 System.out.println("Tipo de Suspensão: " + criandoNovaMoto.getTipoDeSuspensao());
 System.out.println("Tipo de Chassis: " + criandoNovaMoto.getTipoDeChassi());
*/