package pl.home.javastartHome.human;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import pl.home.javastartHome.exeptions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@EqualsAndHashCode
@Getter
@Setter


public class PersonSepcial {

    private String name;
    private String surName;
    private SexEnum sex;
    private Long pesel;
    private int age;
    private double salary;
    private Long phoneNumber;
    private static int IDPERSON = 10000;

    public PersonSepcial(String name, String surName, SexEnum sex) {
        this.name = name;
        this.surName = surName;
        this.sex = sex;
        this.IDPERSON = IDPERSON++;
    }


    public void setPhoneNumber (Long phoneNumber) throws WrongNumberExeptions {

        Pattern compiledPattern = Pattern.compile("^[0-9]{9}");
        Matcher matcher = compiledPattern.matcher(pesel.toString());


        if (!matcher.find()) {

            throw new WrongNumberExeptions("Niewłaściwy format numeru telefonu");
        }

        this.phoneNumber = phoneNumber;
    }

    public void setPesel (Long pesel) throws WrongPeselExeptions {

        Pattern compiledPattern = Pattern.compile("^[0-9]{11}$");
        Matcher matcher = compiledPattern.matcher(pesel.toString());


        if (!matcher.find()) {

            throw new WrongPeselExeptions("Niewłaściwy format peselu");
        }

        this.pesel = pesel;
    }

    public void setSalary(double salary) throws NegativeSalaryExeptions {

        if (salary < 0) {

            throw new NegativeSalaryExeptions("Pensja nie może być ujemna");
        }

        this.salary = salary;
    }


    public void setAge(int age) throws ImpossibleAgeExpetons, NegativeAgeExpetions {
        if (age > 150) {

            throw new ImpossibleAgeExpetons("Wiek niemożliwy");
        }
        if (age < 0) {

            throw new NegativeAgeExpetions("Wiek nie może być ujemny");
        }

        this.age = age;
    }
}
