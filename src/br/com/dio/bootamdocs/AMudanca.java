package br.com.dio.bootamdocs;

import java.io.IOException;
import java.util.Scanner;

public class AMudanca {

    public static void main(String[] args) throws IOException{

        Scanner leitor = new Scanner(System.in);
        while(leitor.hasNext()) {
            int graus = leitor.nextInt();
            if (90 <= graus && graus < 180) {
                System.out.println("Boa Tarde!!");
            } else if (180 <= graus && graus < 270) {
                System.out.println("Boa Noite!!");
            } else if (270 <= graus && graus < 360) {
                System.out.println("De Madrugada!!");
            } else {
                System.out.println("Bom Dia!!");
              break;
            }
        }
        System.out.println(leitor);
    }
}
