package pl.home.javastartHome.streamAndLambdas;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambdas {

    private List<String> animals = Arrays.asList("cat", "dog", "mouse", "rat", "pig", "rabbit", "hamster", "parrot"
            , "cat", "dog", "cat");

    @Test
    public void labdasOne() {
        int i = 1;
        for (String animal : animals) {
            System.out.print(animal + (i == animals.size() ? " " : ", "));
            i++;
        }
        System.out.println();

        animals.forEach(el -> System.out.print(el + ", "));
        System.out.println();

        animals.stream().map(e -> e.toUpperCase()).forEach(e -> System.out.print(e + ", "));
        System.out.println();

        System.out.println(animals.stream().collect(Collectors.joining(", ")));

        animals.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println();

        animals.sort((a, b) -> a.compareTo(b));
        animals.sort(String::compareTo);
        animals.sort(Comparator.naturalOrder());
    }

    public interface OurChecker {
        boolean check(Integer value);
    }

    private OurChecker isDivisibleBy3withAnonymousClass = new OurChecker() {
        @Override
        public boolean check(Integer value) {
            return value % 3 == 0;
        }
    };

    private OurChecker isDivisibleBy3withLambda = val -> val % 3 == 0;



    @Test
    public void checking() {
        System.out.println(isDivisibleBy3withAnonymousClass.check(122));
        System.out.println(isDivisibleBy3withAnonymousClass.check(3));
        System.out.println(isDivisibleBy3withLambda.check(122));
        System.out.println(isDivisibleBy3withLambda.check(3));
    }

}
