package br.com.dio.bootamdocs;

import java.io.IOException;
import java.util.Scanner;

public class FatorialSimples {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int F = leitor.nextInt();
        int fat = 1;

        for (int i = 1; i <= F; i++){
            fat *= i;
        }
        System.out.println(fat);
    }
}