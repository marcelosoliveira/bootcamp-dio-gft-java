package br.com.desafio.java;

import java.util.Scanner;

public class Diferenca {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();
        //complete o codigo
        int dif = (a * b - c * d);
        System.out.println("DIFERENCA = " + dif);
    }
}
