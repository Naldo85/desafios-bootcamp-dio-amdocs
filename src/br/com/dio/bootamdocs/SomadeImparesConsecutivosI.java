package br.com.dio.bootamdocs;


import java.util.Scanner;

public class SomadeImparesConsecutivosI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        int soma = 0;

        if (x > y) {
            for (int i = x-1; i > y; i--) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
        } else {
            for (int i = x+1; i < y; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
        }

        System.out.println(soma);

    }

}
