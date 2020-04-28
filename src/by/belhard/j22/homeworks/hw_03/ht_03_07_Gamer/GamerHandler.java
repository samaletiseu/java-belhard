package by.belhard.j22.homeworks.hw_03.ht_03_07_Gamer;

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

        System.out.println("Inicial x = " + gamerRick.getX() + "\nInicial y = " + gamerRick.getY());

        gamerRick.setX(28);
        gamerRick.setY(179);

        System.out.println("Current x = " + gamerRick.getX() + "\nCurrent y = " + gamerRick.getY());


        double way = Math.sqrt(gamerRick.getX() * gamerRick.getX() + gamerRick.getY() * gamerRick.getY());

        System.out.print("Way = ");
        System.out.printf("%.2f", way);

    }
}