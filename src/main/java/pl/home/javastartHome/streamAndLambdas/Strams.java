package pl.home.javastartHome.streamAndLambdas;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class Strams {

    private List<Person> people = Arrays.asList(
            new Person(1, "Anna", "Nowak", 33),
            new Person(2, "Beata", "Kowalska", 22),
            new Person(3, "Marek", "Nowak", 25),
            new Person(4, "Adam", "Twardowski", 33),
            new Person(5, "Monika", "Kos", 25),
            new Person(6, "Adam", "Rudy", 45),
            new Person(7, "Marek", "Rudy", 15)
    );
    private Optional<String> reduce;

    @Test
    public void filtering() {
        String commas = people.stream()
                .filter(x -> x.getName().length() == 4)
                .map(e -> e.getName())
                .collect(Collectors.joining(", "));
        System.out.println(commas);

        String commasDistinct = people.stream()
                .filter(x -> x.getName().length() == 4)
                .map(e -> e.getName())
                .distinct()
                .collect(Collectors.joining(", "));
        System.out.println(commasDistinct);
    }

    @Test
    public void sorting() {
        List<Person> list = people.stream()
                .sorted((a, b) -> a.getAge().compareTo(b.getAge()))
                .collect(Collectors.toList());
        System.out.println(list);
    }

    @Test
    public void collectors() {    //  Anna 2   Adam 2
        Map<Integer, Person> personMap = people.stream()
                .collect(
                        Collectors.toMap(
                                e -> e.getId(),
                                e -> e)
                );
        System.out.println(personMap);

        Map<String, Long> map = people.stream()
                .collect(
                        Collectors.groupingBy(
                                e -> e.getName(),
                                Collectors.counting()
                        )
                );
        System.out.println(map);

        Map<String, List<Person>> collect = people.stream()
                .collect(Collectors.groupingBy(e -> e.getName()));
        System.out.println();

    }

    @Test
    public void reducers() {
        reduce = people.stream().sorted((a, b) -> a.getName().compareTo(b.getName()))
                .map(e -> e.getName())
                .reduce((s1, s2) -> {
                    System.out.println("s1: " + s1);
                    System.out.println("s2: " + s2);
                    return s1 + " :: " + s2;
                });
        System.out.println(reduce.get());
    }

    @Test
    public void statistics() {
        IntSummaryStatistics intSummaryStatistics = people.stream().mapToInt(e -> e.getAge()).summaryStatistics();
        System.out.println(intSummaryStatistics);
    }

    @Test
    public void primes() {
//        long count = Stream.iterate(1, e -> e + 1)
//                .parallel()
//                .limit(5000000)
//                .filter(e -> isPrime(e))
//                .count();
//        System.out.println(count);

        Stream.iterate(1, e -> e + 1)
                .skip(4)
                .limit(15)
                .forEach(e -> System.out.println(e + ", "));

        Stream.iterate(1, e -> e + 1)
                .limit(15)
                .skip(4)
                .forEach(e -> System.out.println(e + ", "));


    }

    public boolean isPrime(final int number) {
        return number > 1
                && IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(
                divisor -> number % divisor == 0);
    }

    @Test
    public void getAnonymousUserCheckedLogs() { //kozak
        Map<String, List<Person>> userIdsWithReason = new HashMap<>();

        userIdsWithReason.put("Too expensive", people.stream().limit(5).collect(toList()));
        userIdsWithReason.put("I dont like it", people.stream().skip(3).limit(2).collect(toList()));
        userIdsWithReason.put("I dont need it", people.stream().skip(4).collect(toList()));

        List<CustomReport> reports = userIdsWithReason.entrySet().stream()
                .flatMap(e -> e.getValue().stream()
                        .map(person -> new CustomReport(person, e.getKey()))
                )
                .collect(groupingBy(
                        CustomReport::getPerson,
                        Collectors.reducing((report1, report2) -> {
                            report1.setReason(report1.getReason() + "," + report2.getReason());
                            return report1;
                        })
                ))
                .values().stream().filter(Optional::isPresent).map(Optional::get).collect(toList());
        for (CustomReport report : reports) {
            System.out.println(report);
        }
    }

}
