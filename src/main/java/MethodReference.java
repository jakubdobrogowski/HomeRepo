import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReference {

    @FunctionalInterface
    interface Converter<F, T> {

        T convert(F from);
    }

    public static void main(String[] args) {

        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, (o1, o2) -> o1.compareTo(o2));

        names.sort((o1, o2) -> o1.compareTo(o2));


        //Converter<String, Integer> converter = from -> Integer.valueOf(from);
        Converter<String, Integer> converter = (Integer::valueOf);
        Integer converted = converter.convert("123");

        class Something {

            public String startsWithNew(String world) {

                if (StringUtils.isNotBlank(world)) {

                    return String.valueOf(world.charAt(0));
                }
                throw new IllegalArgumentException("Pusty String");
            }
        }

        Something something = new Something();
//        Converter<String, String> converterStartsWith = from -> something.startsWithNew(from);
        Converter<String, String> converterStartsWith = something::startsWithNew;
        String convertedonverterStartsWith = converterStartsWith.convert("Java");
    }
}

