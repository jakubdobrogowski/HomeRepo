package pl.home.javastartHome.homeWorkOne;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;
import pl.home.javastartHome.Book;


import java.util.ArrayList;
import java.util.List;

public class StreamsAndRecursionTest {

    private Book effectiveJava = new Book("Effective Java", "Joshua Bloch", 3);
    private Book finnishGrammar = new Book("Finnish: An Essential Grammar", "Fred Karlsson", 3);
    private Book cleanCode = new Book("Clean Code", "Robert C. Martin", 1);
    private Book cleanCoder = new Book("The Clean Coder", "Robert C. Martin", 1);
    private Book javaConcurrency = new Book("Java Concurrency in Practice", "Brian Goetz", 1);

    @Test
    void test_giveMyNewListWithMultiplyValue() {
        List<Long> longs = Lists.newArrayList(2L, 3L, 5L, 7L, 9L);

        assert 4 == StreamsAndRecursion.giveMyNewListWithMultiplyValue(longs).get(0);
        assert 18 == StreamsAndRecursion.giveMyNewListWithMultiplyValue(longs).get(4);
    }

    @Test
    void test_exponentiation() {

        assert 1024.0 == StreamsAndRecursion.exponentiation(2.0, 10);
    }

    @Test
    void test_giveMyNiceBooks_() {

        ArrayList<Book> books = Lists.newArrayList(effectiveJava, finnishGrammar, cleanCode, cleanCoder, javaConcurrency);
        System.out.println(StreamsAndRecursion.giveMyNiceString(books));
    }

    @Test
    void test_fibonnaci() {

        //assert 4181 == StreamsAndRecursion.fibonnaci(19);

        System.out.println();
    }
}
