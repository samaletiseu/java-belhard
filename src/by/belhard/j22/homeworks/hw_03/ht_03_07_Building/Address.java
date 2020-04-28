package by.belhard.j22.homeworks.hw_03.ht_03_07_Building;

public class Address {

    private String street;
    private int number;

    public Address(String street, int number) {

        this.street = street;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int Number) {
        this.number = number;
    }
}