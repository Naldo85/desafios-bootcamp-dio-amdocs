package br.com.dio.bootamdocs;

import java.io.IOException;
import java.util.Scanner;

public class AMudancaContinua {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            double graus = Math.abs(leitor.nextDouble());

            if (graus <= 360) {
                String greeting;
                if (graus >= 90 && graus < 180) greeting = "Boa Tarde!!" ;
                else if (graus >= 180 && graus < 270) greeting = "Boa Noite!!" ;
                else if (graus >= 270 && graus < 360) greeting = "De Madrugada!!" ;
                else greeting = "Bom Dia!!";


                Double horas = (graus/15)+6d;
                if (horas>23) horas -= 24d;
                Double minutos = (horas-horas.intValue())*60;
                Double segundos = (minutos-minutos.intValue())*60;

                if (segundos > 59) {
                    segundos = 0.0;
                    minutos += 1.0;
                }

                System.out.printf("%s%n%02d:%02d:%02d%n",
                greeting, horas.intValue(), minutos.intValue(), segundos.intValue());

            }
        }

        leitor.close();
    }
}
