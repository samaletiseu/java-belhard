package by.belhard.j22.homeworks.hw_03.ht_03_08_Gamer;

//Создать класс Игрок.
// Игрок имеет координаты x и y.
// Игрок должен уметь (через методы):
//а) переместиться в новые координаты (то есть изменить свои текущие координаты на новые, переданные ему),
//б) вывести на консоль значение текущего положения,
//
//доп1*) игрок должен хранить значение пройденного расстояния и уметь выводить на консоль это значение.

public class Gamer {
    String name;
    private int x;
    private int y;

    public Gamer(int x, int y, String name, double distance) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.distance = distance;
    }

    public Gamer(int i, int i1) {
    }

    public Gamer(int i, int i1, String vasiliy) {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printPosition() {
        System.out.println("Current x = " + this.x + "\nCurrent y = " + this.y);
    }

    double distance = 0;
    public void setXY(int newX, int newY) {
//        double currentTravelledDistance = Math.sqrt((newX - x) * (newX - x) + (newY - y) * (newY - y));
//        distance = distance + currentTravelledDistance;

        distance = distance + calculateDistance(newX, newY);
        this.x = newX;
        this.y = newY;

    }

    private double calculateDistance(int newX, int newY) {
        return Math.sqrt(Math.pow(newX - x, 2) + Math.pow(newY - y, 2));
    }

    public void printTravelledDistance() {
        System.out.printf("Travelled distance = %.2f", distance);
        System.out.println();
    }
}