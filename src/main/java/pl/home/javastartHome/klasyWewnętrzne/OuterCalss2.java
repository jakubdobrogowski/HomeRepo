package pl.home.javastartHome.klasyWewnętrzne;

public class OuterCalss2 {

    public static class InnerStaticCalss {
    }

    public OuterCalss2.InnerStaticCalss instantiate() {
        return new OuterCalss2.InnerStaticCalss();

    }

    public static void instanceStaticCalss() {

        OuterCalss2 outerCalss = new OuterCalss2();

        OuterCalss2.InnerStaticCalss instance1 = outerCalss.instantiate();

        OuterCalss2.InnerStaticCalss instance2 = new OuterCalss2.InnerStaticCalss(); // nie potrzebujemy instancji klasy zewnetrznej

    }


}