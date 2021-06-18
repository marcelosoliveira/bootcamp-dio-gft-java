package br.com.desafio.java;

import java.util.*;

public class ContagemNumeroRepitido {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        ArrayList<Integer> listNumber  = new ArrayList<Integer>();
        SortedMap<Integer, Integer> countQuantity = new TreeMap<>();

        int  number = sc.nextInt();
        while(number --> 0) {
            listNumber.add(sc.nextInt());
        }

        listNumber.forEach((key) -> {
            countQuantity.put(key, (countQuantity.get(key) == null ? 1 : countQuantity.get(key) + 1));
        });

        countQuantity.entrySet().forEach(entry-> {
            System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());
        });

        sc.close();

    }

}
