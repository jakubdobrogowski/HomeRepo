package pl.home.javastartHome.klasyWewnętrzne;

public class OuterClass {


    public class InnerClass {

    }

    public InnerClass instantiate() {
        return new InnerClass(); // odpowiednik this.new InnerClass()
    }

    private static void innerClassInstantiation() {
        OuterClass outerClass = new OuterClass(); //tak klasycznie

        OuterClass.InnerClass instance1 = outerClass.instantiate(); // metoda instantiate()

        OuterClass.InnerClass instance2 = outerClass.new InnerClass(); //potrzebujemy instancje klasy zewnetrznej
    }

}
