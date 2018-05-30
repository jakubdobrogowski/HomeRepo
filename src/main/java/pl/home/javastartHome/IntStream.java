package pl.home.javastartHome;

import com.google.common.collect.Lists;

public class IntStream {

    public static void main(String[] args) {

        Lists.newArrayList(1,2,3,4,5,6,7,8,9).stream().forEach(System.out::println);
    }
}
