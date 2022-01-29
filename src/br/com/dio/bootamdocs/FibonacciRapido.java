package br.com.dio.bootamdocs;

import java.io.IOException;
import java.util.Scanner;

public class FibonacciRapido {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double N = leitor.nextInt();
        double fib = (Math.pow((1 + Math.sqrt(5)) / 2, N)
                - Math.pow((1 - Math.sqrt(5)) / 2, N)) / Math.sqrt(5);
        System.out.println(String.format("%.1f", fib));
    }

}

