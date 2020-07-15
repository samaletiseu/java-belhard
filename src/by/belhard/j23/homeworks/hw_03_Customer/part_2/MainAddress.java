package by.belhard.j23.homeworks.hw_03_Customer.part_2;

public class MainAddress {
    public static void main(String[] args) {
        CustomerWithAddress customerOne = new CustomerWithAddress(
                "Andrey",
                "Sinichka",
                458965656,
                new Address("Turin", "Flate", 2856)
        );

        CustomerWithAddress customerTwo = new CustomerWithAddress(
                "Yuri",
                "Voschilo",
                222037589,
                 new Address("Moskva", "Tikotskogo", 26)
        );

        CustomerWithAddress customerThree = new CustomerWithAddress(
                "Vera",
                "Vysotskaya",
                658000457,
                new Address("Tokio", "Fetu", 13)
        );

        customerOne.printFullName();
        customerOne.printPhone();
        customerOne.printClassAddress();
        System.out.println();

        customerTwo.printFullName();
        customerTwo.printPhone();
        customerTwo.printClassAddress();
        System.out.println();

        customerThree.printFullName();
        customerThree.printPhone();
        customerThree.printClassAddress();
        System.out.println();
    }
}