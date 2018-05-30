package pl.home.javastartHome.klasyWewnętrzne;

import java.util.function.*;

public class LambdaExperiment {

    public static void main(String[] args) {

        someMethods();
        lambsAndAnonymusClass();


        UnaryOperator<Integer> resoult = x -> x*x;
        System.out.println(resoult.apply(3));

        Supplier<String> someString = () -> "some return value";
        System.out.println(someString.get());

        BiConsumer<Double, Double> multiply = (x, y)-> System.out.println(x * y);
        multiply.accept(5.0,4.0);

        Consumer<Integer> showInt = System.out::println;
        showInt.accept(8);

        Function<Integer, Long> convert =  x-> (long)x;
        System.out.println(convert.apply(17));

    }

    public static void lambsAndAnonymusClass() {
        InterExp I = new InterExp() {              //ewidentnie jest to klasa anonimowa

            @Override
            public int idnow() {

                return 3;
            }

        };

        System.out.println(I.idnow()); //wywołanie


        InterExp z = () -> 4;   //lambda

        System.out.println(z.idnow()); //wywołanie lambdy
    }

    private static void someMethods() {

        System.out.println("metoda");
    }
}
