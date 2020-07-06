package by.belhard.j22.lessons.lesson_5_0.inheritanceExample;

import java.util.Objects;

public class Person implements Comparable<Person>{

    private String name;

    private int age;

    @Override
    public int compareTo(Person person) {

        int ageDif = this.getAge() - person.getAge();

        if (ageDif == 0) {
            return person.getName().compareTo(this.getName());
        }

        return ageDif;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void work() {
        System.out.println(name + " do nothing");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}