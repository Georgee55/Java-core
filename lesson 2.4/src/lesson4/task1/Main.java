package lesson4.task1;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Banana", "Apple", "Orange", "Carrot", "Carrot",
                "Apple", "Cucumber", "Orange", "Lemon", "Watermelon",
                "Orange", "Lemon", "Pineapple", "Carrot", "Apple",
                "Carrot", "Banana", "Watermelon", "Orange", "Banana"
        );

        Set<String> unique = new HashSet<>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words);
        System.out.println("Уникальные слова");
        System.out.println(unique);
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}