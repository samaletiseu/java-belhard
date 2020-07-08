package by.belhard.j23.homeworks.hw_03_Customer.part_2;

public class Address {
    private String city;
    private String street;
    private int houseNumber;

    public Address(String city, String street, int houseNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return city + ' ' + street + ' ' + houseNumber;
    }
}
