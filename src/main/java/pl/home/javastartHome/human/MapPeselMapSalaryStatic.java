package pl.home.javastartHome.human;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPeselMapSalaryStatic {

    public static void main(String[] args) {

        System.out.println(peopleMap());
    }

    public static Map<Integer, Map<Double, Integer>> peopleMap() {

        List<PersonSepcial> people = Main.peopleList();

        Map<Integer, Map<Double, Integer>> resoultMap = new HashMap<>();

        for (PersonSepcial person : people) {

            if (resoultMap.containsKey(person.getAge())) {  // jesli nasza mapa nie ma nikogo o tym peselu to idziemy do elsa

                Map<Double, Integer> secondMap = resoultMap.get(person.getAge()); // jesli jest juz ktoś o podanym peselu, przpisujemy warości z naszej resoult map

                if (secondMap.containsKey(person.getSalary())) { // sprawdzamy czy ktoś juz przypadkiem nie zarbia tyles samo,

                    Integer integer = secondMap.get(person.getSalary()); // jak tak, to patrzymy ile osob tye samo zarabia
                    secondMap.put(person.getSalary(), integer + 1); // wkladamy to

                } else {

                    secondMap.put(person.getSalary(), 1);
                }

            } else {

                Map<Double, Integer> newMap = new HashMap<>(); // tworzymy wartosć map w mapie czyli mape xd

                newMap.put(person.getSalary(), 1); // do tej mapy dodajemu pensej i numerek

                resoultMap.put(person.getAge(), newMap); // i składamy razem

            }


        }

        return resoultMap;
    }
}
