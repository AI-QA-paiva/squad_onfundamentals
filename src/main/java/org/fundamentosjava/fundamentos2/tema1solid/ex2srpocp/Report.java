package org.fundamentosjava.fundamentos2.tema1solid.ex2srpocp;

public class Report {

    private String report;

    public Report(String report) {
        this.report = report;
    }

    public String getReport() {
        return report;
    }

    public String generateReport() {
        //lógica para gerar relatório
        return "Relatório" + report;
    }

}
