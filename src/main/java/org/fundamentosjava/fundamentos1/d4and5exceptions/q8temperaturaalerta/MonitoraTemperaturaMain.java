package org.fundamentosjava.fundamentos1.d4and5exceptions.q8temperaturaalerta;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MonitoraTemperaturaMain {

    private static final Logger logger = Logger.getLogger(MonitoraTemperaturaMain.class.getName());

    public static void main(String[] args) {

        int temperatura = 41;
        checarNivelTemperatura(temperatura);

    }
    public static void checarNivelTemperatura(int temperatura) {

        try {
            if (temperatura > 40) {
                logger.log(Level.SEVERE, "ENTROU NESSE IF 40: ({0}º) >>> Temperatura está muito alta! Cuidados com a hidratação e proteção solar devem ser tomados imediatamente.", temperatura); //critico
            } else if (temperatura >= 30) {
                logger.log(Level.WARNING, "ENTROU NESSE IF 30/40: Cuidado com a Temperatura quente! Recomenda-se beber água e hidratação da pele." + temperatura); //aviso
            } else if (temperatura >= 12) {
                logger.log(Level.INFO, "ENTROU NESSE IF 20/30: Temperatura subindo para quente! Recomenda-se beber água e hidratação da pele." + temperatura); //aviso
            } else  {
                logger.log(Level.WARNING, "ENTROU NESSE IF 12: Temperatura está abaixo do normal! Recomenda-se abrigo aquecido." + temperatura); //aviso
            }

        } catch (Exception e) {
            logger.log(Level.SEVERE, "Ocorreu um erro ao verificar o nível de temperatura: " + e.getMessage());
        }
    }

}
