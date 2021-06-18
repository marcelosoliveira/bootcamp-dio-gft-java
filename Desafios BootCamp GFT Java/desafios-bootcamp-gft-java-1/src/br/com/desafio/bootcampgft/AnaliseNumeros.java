package br.com.desafio.bootcampgft;

import java.io.IOException;
import java.util.Scanner;

public class AnaliseNumeros {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        //declare suas variaveis corretamente
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;
        int length = 5;
        int number = 0;

        //continue a solução
        for (int index = 0; index < length; index++) {
            number = leitor.nextInt();
            if (number < 0 && number % 2 != 0) {
                negativos++;
                impares++;
            } else if (number > 0 && number % 2 != 0) {
                positivos++;
                impares++;
            } else if (number < 0 && number % 2 == 0) {
                negativos++;
                pares++;
            } else if (number > 0 && number % 2 == 0) {
                positivos++;
                pares++;
            } else {
                pares++;
            }
        }

        //insira suas variaveis corretamente
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
    }
}
