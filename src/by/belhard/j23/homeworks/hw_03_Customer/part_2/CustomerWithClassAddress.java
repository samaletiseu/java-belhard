//Реализовать объект Customer (заказчик) со всей необходимой информацией о нем
// (минимум: имя, фамилия, телефон, город, улица, дом - каждое из перечисленного реализовать отдельным полем класса).
// Реализовать методы getFullName() (имя + фамилия)
// и getFullAddress() (город + улица + дом) - чтобы выводить наиболее часто употребимую информацию одним методом,
// а не кучей, каждый раз склеивая данные заново. Создать 3 экземпляра класса Customer.
// Вывести в консоль всю информацию по каждому заказчику.
// * Реализовать адрес отдельным классом (Address).
// В классе Customer вместо полей отвечающих за адрес ввести поле типа Address
// * Создать массив объектов типа Customer


package by.belhard.j23.homeworks.hw_03_Customer.part_2;

public class CustomerWithClassAddress {
    private String name;
    private String surname;
    private int phone;
    private Address address;

    public CustomerWithClassAddress(String name, String surname, int phone, Address address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void getFullName() {
        System.out.println(name + " " + surname);
    }

    public void getPhone() {
        System.out.println(phone);
    }

    public void getClassAddress() {
        System.out.println(address);
    }
}