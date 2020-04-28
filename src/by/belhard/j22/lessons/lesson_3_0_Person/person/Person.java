package by.belhard.j22.lessons.lesson_3_0_Person.person;

public class Person {
    private String name;
    private int age;
    private Country country;
    private Sex sex;


    public Person(String name, int age, Country country, Sex sex) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.sex = sex;
    };

//    Import ;

    public void walk() {
        System.out.println("I'm walking");
    }

    public void eat(String dish) {
        System.out.println("I'm eating + " + dish);
    }

    public int growOld() {
        return ++age;
    }

    // геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; // объект у которого вызывается метод setName
    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Sex getSex() {
        return sex;
    }

//    public void setSex(Sex sex) {
//        this.sex = sex;
//    }


    // приватные методы
}