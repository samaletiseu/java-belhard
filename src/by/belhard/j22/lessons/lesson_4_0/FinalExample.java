package by.belhard.j22.lessons.lesson_4_0;

import by.belhard.j22.lessons.lesson_3_0_Person.person.Country;
import by.belhard.j22.lessons.lesson_3_0_Person.person.Person;
import by.belhard.j22.lessons.lesson_3_0_Person.person.Sex;

public class FinalExample {

    private static final int a = 5;

    private static final Person person = new Person("Vasily", 22,
            new Country("Belarus", 220000), Sex.MALE);


    public static void main(String[] args) {

        /*person = new Person("Vasily", 22,
                new Country("Belarus", 220000), Sex.MALE);*/

        person.setName("qqq");

        person.getCountry().setTitle("BLR");

    }
}