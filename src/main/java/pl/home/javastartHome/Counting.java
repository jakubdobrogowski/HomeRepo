package pl.home.javastartHome;

import com.google.common.primitives.Chars;


import java.util.stream.Collectors;

public class Counting {

    public static void main(String[] args) {

        String sentence = "Ala ma kota, kot ma ala jaaaazda";
        Counting counting = new Counting();
        counting.countToken(sentence);
    }

    private void countToken(String word) {

        System.out.println(Chars.asList(word.toCharArray()).stream().collect(Collectors.groupingBy(
                e -> e,
                Collectors.counting()
        )));
    }
}
