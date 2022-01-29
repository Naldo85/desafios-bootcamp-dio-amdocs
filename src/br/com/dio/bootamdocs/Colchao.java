package br.com.dio.bootamdocs;

import java.util.Scanner;
import java.io.IOException;


public class Colchao {
    public static void main(String[] args) throws IOException{

        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        int H = leitor.nextInt();
        int L = leitor.nextInt();

        if(H > B || L > B){
            System.out.println("S");
        }else{
            System.out.println("N");
        }
        System.out.println(leitor);
    }


}
