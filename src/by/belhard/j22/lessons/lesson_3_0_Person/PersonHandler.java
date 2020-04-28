package by.belhard.j22.lessons.lesson_3_0_Person;


import by.belhard.j22.lessons.lesson_3_0_Person.person.Country;
import by.belhard.j22.lessons.lesson_3_0_Person.person.Person;
import by.belhard.j22.lessons.lesson_3_0_Person.person.Sex;

public class PersonHandler {

    public static void main(String[] args) {

//      Import import1 = new Import();
        Person person1 = new Person(
                "Vasiliy",
                30,
                new Country("Belarus", 220000),
                Sex.MALE
        );

//            person1.setName("Vasiliy"); //setName
//            person1.getAge(30); //getAge
//            person1.setCountry(new Country);
//            person1.setSex(Sex.MALE);
//            person1.country.title = "Belarus";
//            person1.country.zipCode = 225503;

            System.out.println(person1.getName() + " : " + person1.getAge());
            System.out.println(
                    person1.getCountry().getTitle() + " "
                    + person1.getCountry().getZipCode());

            //
            System.out.println();
            Person person2 = new Person(
                    "Olga",
                    20,
                    person1.getCountry(),
                    Sex.FEMALE
            );

//            person2.name = "Olga";
//            person2.age = 29;
//            person2.country = person1.country;
//            person2.sex = Sex.MALE;
//            person2.country.title = "Belarus";
//            person2.sex = Sex.FEMALE;

            System.out.println(person2.getCountry().getTitle() + " "
                    + person1.getCountry().getZipCode());

        person1.setCountry(new Country("Belarus", 205689));
        person2.getCountry().setTitle("BLR");

//            System.out.println(person1.getCountry().getTitle() + person1.getCountry().getZipCode());

        System.out.println(
                person1.getCountry().getTitle() + " "
                + person1.getCountry().getZipCode()
                );

            person1.walk();
            person1.eat("bread");
            System.out.println(person1.growOld());
            int newAge = person1.growOld();
            System.out.println(newAge);

        }
}
