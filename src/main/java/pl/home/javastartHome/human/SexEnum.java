package pl.home.javastartHome.human;

public enum SexEnum {

    MAN("Mężczyzna"), WOMAN("Kobieta");

    private final String plName;

    SexEnum(String plName) {

        this.plName = plName;
    }

    public String getPlName(){

        return plName;
    }
}
