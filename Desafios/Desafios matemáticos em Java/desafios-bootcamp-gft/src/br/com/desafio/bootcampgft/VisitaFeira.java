package br.com.desafio.bootcampgft;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class VisitaFeira {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int total = a + b; // Altere o valor da variável com o cálculo esperado
        System.out.println("X = " + total);
    }
}