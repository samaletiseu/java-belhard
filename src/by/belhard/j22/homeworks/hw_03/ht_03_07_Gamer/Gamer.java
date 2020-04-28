package by.belhard.j22.homeworks.hw_03.ht_03_07_Gamer;

//Создать класс Игрок.
// Игрок имеет координаты x и y.
// Игрок должен уметь (через методы):
//а) переместиться в новые координаты (то есть изменить свои текущие координаты на новые, переданные ему),
//б) вывести на консоль значение текущего положения,
//
//доп1*) игрок должен хранить значение пройденного расстояния и уметь выводить на консоль это значение.

public class Gamer {

    private int x;
    private int y;

    public Gamer(int x, int y) {
        this.x = x;
        this.y = y;
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
}