//Реализовать объект Customer (заказчик) со всей необходимой информацией о нем
// (минимум: имя, фамилия, телефон, город, улица, дом - каждое из перечисленного реализовать отдельным полем класса).
// Реализовать методы getFullName() (имя + фамилия)
// и getFullAddress() (город + улица + дом) - чтобы выводить наиболее часто употребимую информацию одним методом,
// а не кучей, каждый раз склеивая данные заново.
// Создать 3 экземпляра класса Customer.
// Вывести в консоль всю информацию по каждому заказчику.
// * Реализовать адрес отдельным классом (Address).
// В классе Customer вместо полей отвечающих за адрес ввести поле типа Address
// * Создать массив объектов типа Customer


package by.belhard.j23.homeworks.hw_03_Customer.part_2;

public class MainAddress {
    public static void main(String[] args) {
        CustomerWithClassAddress customerOne = new CustomerWithClassAddress(
                "Andrey",
                "Sinichka",
                458965656,
                new Address("Turin", "Flate", 2856)
        );

        CustomerWithClassAddress customerTwo = new CustomerWithClassAddress(
                "Yuri",
                "Voschilo",
                222037589,
                 new Address("Moskva", "Tikotskogo", 26)
        );

        CustomerWithClassAddress customerThree = new CustomerWithClassAddress(
                "Vera",
                "Vysotskaya",
                658000457,
                new Address("Tokio", "Fetu", 13)
        );

        customerOne.getFullName();
        customerOne.getPhone();
        customerOne.getClassAddress();
        System.out.println();

        customerTwo.getFullName();
        customerTwo.getPhone();
        customerTwo.getClassAddress();
        System.out.println();

        customerThree.getFullName();
        customerThree.getPhone();
        customerThree.getClassAddress();
        System.out.println();
    }
}