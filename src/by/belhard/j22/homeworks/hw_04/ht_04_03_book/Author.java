package by.belhard.j22.homeworks.hw_04.ht_04_03_book;

public class Author {

    private String name;
    private int age;

    public Author(String name, int age) {
        this.name = name;

        if (age > 2) {
            this.age = age;
        } else this.age = 0;
    }

    @Override
    public String toString() {
        return "name = " + name +
                "\nauthor age = " + age;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
}