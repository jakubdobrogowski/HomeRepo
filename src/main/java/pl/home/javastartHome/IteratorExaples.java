package pl.home.javastartHome;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExaples {

    public static void main(String[] args) {

        ArrayList<Integer> list = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {

            Integer next = iterator.next();

            if (next == 2) {

                System.out.println(next);
                iterator.remove();
            }
        }

        System.out.println("----------");

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }


    }
}
