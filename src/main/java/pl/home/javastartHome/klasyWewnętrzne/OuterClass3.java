package pl.home.javastartHome.klasyWewnętrzne;

public class OuterClass3 {

    public static void localClassInstantiation(String[] args) {

        class LocalClass {

            @Override
            public String toString() {
                return "LocalClass{}";
            }
        }
    }
}
