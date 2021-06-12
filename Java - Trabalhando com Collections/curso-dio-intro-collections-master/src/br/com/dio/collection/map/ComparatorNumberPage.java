package br.com.dio.collection.map;

import java.util.Comparator;
import java.util.Map;

public class ComparatorNumberPage implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> page1, Map.Entry<String, Livro> page2) {
        return page1.getValue().getPaginas().compareTo(page2.getValue().getPaginas());
    }
}
