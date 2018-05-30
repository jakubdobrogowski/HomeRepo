package pl.home.javastartHome.human;

import pl.home.javastartHome.exeptions.*;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        peopleList();

        Deque<Integer> integers = new ArrayDeque<>();

        integers.push(1);

        boolean b = integers.peek().equals(1);

        System.out.println(b);


    }

    public static List<PersonSepcial> peopleList() {
        PersonSepcial monika = new PersonSepcial("Monika", "Rytych", SexEnum.WOMAN);

        try {
            monika.setAge(19);
        } catch (ImpossibleAgeExpetons | NegativeAgeExpetions impossibleAgeExpetons) {
            impossibleAgeExpetons.printStackTrace();
        }

        try {
            monika.setPesel(98101105254L);
        } catch (WrongPeselExeptions wrongPeselExeptions) {
            wrongPeselExeptions.printStackTrace();
        }

        try {
            monika.setPhoneNumber(513549226L);
        } catch (WrongNumberExeptions wrongNumberExeptions) {
            wrongNumberExeptions.printStackTrace();
        }

        try {
            monika.setSalary(5400);
        } catch (NegativeSalaryExeptions negativeSalaryExeptions) {
            negativeSalaryExeptions.printStackTrace();
        }

        PersonSepcial kacper = new PersonSepcial("Kacper", "Pocheć", SexEnum.MAN);

        try {
            kacper.setAge(20);
        } catch (ImpossibleAgeExpetons | NegativeAgeExpetions impossibleAgeExpetons) {
            impossibleAgeExpetons.printStackTrace();
        }

        try {
            kacper.setPesel(98101463524L);
        } catch (WrongPeselExeptions wrongPeselExeptions) {
            wrongPeselExeptions.printStackTrace();
        }

        try {
            kacper.setPhoneNumber(666986342L);
        } catch (WrongNumberExeptions wrongNumberExeptions) {
            wrongNumberExeptions.printStackTrace();
        }

        try {
            kacper.setSalary(17800);
        } catch (NegativeSalaryExeptions negativeSalaryExeptions) {
            negativeSalaryExeptions.printStackTrace();
        }

        PersonSepcial franek = new PersonSepcial("Franciszek", "Derczyński", SexEnum.MAN);

        try {
            franek.setAge(20);
        } catch (ImpossibleAgeExpetons | NegativeAgeExpetions impossibleAgeExpetons) {
            impossibleAgeExpetons.printStackTrace();
        }

        try {
            franek.setPesel(98091334237L);
        } catch (WrongPeselExeptions wrongPeselExeptions) {
            wrongPeselExeptions.printStackTrace();
        }

        try {
            franek.setPhoneNumber(789541236L);
        } catch (WrongNumberExeptions wrongNumberExeptions) {
            wrongNumberExeptions.printStackTrace();
        }

        try {
            franek.setSalary(3400);
        } catch (NegativeSalaryExeptions negativeSalaryExeptions) {
            negativeSalaryExeptions.printStackTrace();
        }

        PersonSepcial sylwia = new PersonSepcial("Sylwia", "Wróbel", SexEnum.WOMAN);

        try {
            sylwia.setAge(21);
        } catch (ImpossibleAgeExpetons | NegativeAgeExpetions impossibleAgeExpetons) {
            impossibleAgeExpetons.printStackTrace();
        }

        try {
            sylwia.setPesel(98010625138L);
        } catch (WrongPeselExeptions wrongPeselExeptions) {
            wrongPeselExeptions.printStackTrace();
        }

        try {
            sylwia.setPhoneNumber(513549226L);
        } catch (WrongNumberExeptions wrongNumberExeptions) {
            wrongNumberExeptions.printStackTrace();
        }

        try {
            sylwia.setSalary(9300);
        } catch (NegativeSalaryExeptions negativeSalaryExeptions) {
            negativeSalaryExeptions.printStackTrace();
        }

        PersonSepcial jan = new PersonSepcial("Jan", "Łaszkiewicz", SexEnum.MAN);

        try {
            jan.setAge(20);
        } catch (ImpossibleAgeExpetons | NegativeAgeExpetions impossibleAgeExpetons) {
            impossibleAgeExpetons.printStackTrace();
        }

        try {
            jan.setPesel(98091334237L);
        } catch (WrongPeselExeptions wrongPeselExeptions) {
            wrongPeselExeptions.printStackTrace();
        }

        try {
            jan.setPhoneNumber(765432198L);
        } catch (WrongNumberExeptions wrongNumberExeptions) {
            wrongNumberExeptions.printStackTrace();
        }

        try {
            jan.setSalary(3400);
        } catch (NegativeSalaryExeptions negativeSalaryExeptions) {
            negativeSalaryExeptions.printStackTrace();
        }

        PersonSepcial krzysztof = new PersonSepcial("Krzysztof", "Rzącki", SexEnum.MAN);

        try {
            krzysztof.setAge(20);
        } catch (ImpossibleAgeExpetons | NegativeAgeExpetions impossibleAgeExpetons) {
            impossibleAgeExpetons.printStackTrace();
        }

        try {
            krzysztof.setPesel(98071908152L);
        } catch (WrongPeselExeptions wrongPeselExeptions) {
            wrongPeselExeptions.printStackTrace();
        }

        try {
            krzysztof.setPhoneNumber(613149296L);
        } catch (WrongNumberExeptions wrongNumberExeptions) {
            wrongNumberExeptions.printStackTrace();
        }

        try {
            krzysztof.setSalary(6900);
        } catch (NegativeSalaryExeptions negativeSalaryExeptions) {
            negativeSalaryExeptions.printStackTrace();
        }

        PersonSepcial paulina = new PersonSepcial("Paulina", "Kolasa", SexEnum.WOMAN);

        try {
            paulina.setAge(21);
        } catch (ImpossibleAgeExpetons | NegativeAgeExpetions impossibleAgeExpetons) {
            impossibleAgeExpetons.printStackTrace();
        }

        try {
            paulina.setPesel(97120907234L);
        } catch (WrongPeselExeptions wrongPeselExeptions) {
            wrongPeselExeptions.printStackTrace();
        }

        try {
            paulina.setPhoneNumber(509442120L);
        } catch (WrongNumberExeptions wrongNumberExeptions) {
            wrongNumberExeptions.printStackTrace();
        }

        try {
            paulina.setSalary(1200);
        } catch (NegativeSalaryExeptions negativeSalaryExeptions) {
            negativeSalaryExeptions.printStackTrace();
        }

        PersonSepcial[] people = new PersonSepcial[]{

                monika, kacper, franek, sylwia, jan, krzysztof, paulina
        };

        return Arrays.asList(people);
    }

}
