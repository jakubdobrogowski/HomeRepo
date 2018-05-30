package pl.home.javastartHome;

import com.google.common.collect.Iterables;

import java.util.*;
import java.util.function.Predicate;

public class Predykaty {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        com.google.common.base.Predicate<Integer> isBiggerThanTen = new com.google.common.base.Predicate<>() {

            @Override
            public boolean apply(Integer integer) {
                return integer > 5;
            }

        };

        Iterable<Integer> filter = Iterables.filter(list, isBiggerThanTen);

        Iterator<Integer> iterator = filter.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }


        Predicate<Integer> myPredicate = new Predicate<>() {

            @Override
            public boolean test(Integer integer) {
                return integer > 5;
            }
        };

        Iterable<Integer> filterMyPredicate = Iterables.filter(list, myPredicate::test); //referencja do metody obiektu

        for (Integer integer : filterMyPredicate) {

            System.out.println(integer);
        }

        Predicate<String> predicate = word -> word.length() <= 1;

        boolean a = predicate.test("A");

        System.out.println(a);
    }
}
