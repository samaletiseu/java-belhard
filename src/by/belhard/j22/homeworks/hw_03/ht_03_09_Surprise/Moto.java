package by.belhard.j22.homeworks.hw_03.ht_03_09_Surprise;

//Опишите любую сущность, какую захотите.
// Вот возьмите какой-то предмет или понятие и попробуйте описать его в виде класса.
// Подумайте, какими полями мы могли бы описать эту сущность.
// Подумайте, какие методы могут быть у этой сущности.
//
//Хотелось бы видеть не менее 4 полей с различными типами, и не менее 3 методов с какой-то логикой.

import java.time.LocalDate;

public class Moto {

    private Type type;
    private int year; //год выпуска
    private double capacity; //объем бака
    private double fuel; //количество топлива в баке
    private double consumption; //расход на 100 км

    public Moto(Type type, int year, double capacity, double fuel, double consumption) {
        this.type = type;
        this.year = year;
        this.capacity = capacity;
        this.fuel = fuel;
        this.consumption = consumption;
    }

    public void printCoolness(Type type) {
        if (type == Type.CRUISER) {
            System.out.println("Gog of the road!");
        } else if (type == Type.ENDURO) {
            System.out.println("Dangerous boy!");
        } else if (type == Type.SPORT) {
            System.out.println("Donor");
        } else {
            System.out.println("Good boy!");
        }
    }

    int age = 0;
    public void calculateAge(int year) {
        int curYear = LocalDate.now().getYear();
        age = curYear - year;
    }

    public void printAge() {
        System.out.print("Moto age = " + age);
        System.out.println();
    }

    double distance = 0;
    public void calculateTravelledDistance(double capacity, double fuel, double consumption) {

        if (fuel > capacity) {
            System.out.println("You can not refuel more than tank capacity!");
        } else {

            distance = 100 * fuel / consumption;
        }
    }

    public void printTravelledDistance() {
        System.out.print("Travelled distance on " + fuel + " fuel liters = ");
        System.out.printf("%.2f", distance);
    }
}