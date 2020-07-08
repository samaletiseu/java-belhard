package by.belhard.j23.lessons.lesson_07;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ilga",35);
        Person person2 = new Person("Ane",20);
        Person person3 = new Person("Maks  ",15);
        Person person4 = new Person("Ira",99);
        Person person5 = new Person("Noy",16);

        PersonCollection personCollection1 = new PersonCollection();

        personCollection1.addElement(person1);
        personCollection1.addElement(person2);
        personCollection1.addElement(person3);
        personCollection1.addElement(person4);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
    }
}