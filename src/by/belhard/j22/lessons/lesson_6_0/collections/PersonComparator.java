package by.belhard.j22.lessons.lesson_6_0.collections;

import by.belhard.j22.lessons.lesson_5_0.inheritanceExample.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person person, Person t1) {

        int ageDif = person.getAge() - t1.getAge();

        if (ageDif == 0) {
            return t1.getName().compareTo(person.getName());
        }

        return ageDif;
    }
}