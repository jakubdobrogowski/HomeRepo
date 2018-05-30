package pl.home.javastartHome.homeWorkOne;

import pl.home.javastartHome.Book;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamsAndRecursion {

    public static List<Long> giveMyNewListWithMultiplyValue(List<Long> longsList) {

        return longsList.stream()
                .map(e -> 2 * e)
                .collect(toList());
    }

    public static Double exponentiation(Double x, int a) {

        return a != 0 ? x * exponentiation(x, a - 1) : 1;
    }

    public static String giveMyNiceString(List<Book> books) {

        return books.stream()
                .map(e -> e.getTitle() + " by "
                        + e.getAuthor()
                        + "(" + e.getNumEditions() + " editions)")
                .collect(Collectors.joining("\n "));
    }

    public static int fibonnaci(int n) {

        return n != 0 ? fibonnaci(n - 1) + fibonnaci(n - 2) : 0;
    }
}
