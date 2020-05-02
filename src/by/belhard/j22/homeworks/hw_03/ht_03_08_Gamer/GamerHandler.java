package by.belhard.j22.homeworks.hw_03.ht_03_08_Gamer;

//Создать класс Игрок.
// Игрок имеет координаты x и y.
// Игрок должен уметь (через методы):
//а) переместиться в новые координаты (то есть изменить свои текущие координаты на новые, переданные ему),
//б) вывести на консоль значение текущего положения,
//
//доп1*) игрок должен хранить значение пройденного расстояния и уметь выводить на консоль это значение.

public class GamerHandler {

    public static void main(String[] args) {

        Gamer gamerRick = new Gamer(
                0,
                0
        );

        gamerRick.printPosition();
        gamerRick.printTravelledDistance();

//        gamerRick.setX(5);
//        gamerRick.printPosition();
//        gamerRick.printTravelledDistance();
//
//        gamerRick.setY(10);
//        gamerRick.printPosition();
//        gamerRick.printTravelledDistance();

        gamerRick.setXY(3, 4);
        gamerRick.printPosition();
        gamerRick.printTravelledDistance();

        gamerRick.setXY(6, 8);
        gamerRick.printPosition();
        gamerRick.printTravelledDistance();

        gamerRick.setXY(12, 16);
        gamerRick.printPosition();
        gamerRick.printTravelledDistance();
    }
}