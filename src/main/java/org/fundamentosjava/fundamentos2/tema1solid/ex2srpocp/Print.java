package org.fundamentosjava.fundamentos2.tema1solid.ex2srpocp;

public class Print {

    public void printReport(Report report){

        //lógica para imprimir relatório

        String informationReport = report.generateReport();
        System.out.println(informationReport);
    }

}
