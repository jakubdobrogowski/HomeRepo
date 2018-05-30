package pl.home.javastartHome.streamAndLambdas;

public class CustomReport {

    private Person person;
    private String reason;

    public CustomReport(Person person, String reason) {
        this.person = person;
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public Person getPerson() {
        return person;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "CustomReport{" +
                "person=" + person +
                ", reason='" + reason + '\'' +
                '}';
    }

}
