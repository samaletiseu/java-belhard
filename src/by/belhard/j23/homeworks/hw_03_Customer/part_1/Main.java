package by.belhard.j23.homeworks.hw_03_Customer.part_1;

public class Main {
    public static void main(String[] args) {
        Customer customerOne = new Customer (
                "Andrey",
                "Sinichka",
                458965656,
                "Minsk",
                "Goretskogo",
                789
        );

        Customer customerTwo = new Customer (
                "Yuri",
                "Voschilo",
                222037589,
                "Moskva",
                "Tikotskogo",
                26
        );

        Customer customerThree = new Customer (
                "Vera",
                "Vysotskaya",
                658000457,
                "Vitebsk",
                "Lenina",
                11
        );

        customerOne.printFullName();
        customerOne.printPhone();
        customerOne.printFullAddress();
        System.out.println();

        customerTwo.printFullName();
        customerTwo.printPhone();
        customerTwo.printFullAddress();
        System.out.println();

        customerThree.printFullName();
        customerThree.printPhone();
        customerThree.printFullAddress();
        System.out.println();

        Customer[] customerScope = new Customer[8];

        customerScope[0] = new Customer(
                "blabla",
                "blablabla",
                98745678,
                "tada",
                "tadam",
                699
        );
    }
}
