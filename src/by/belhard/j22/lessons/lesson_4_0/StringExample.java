package by.belhard.j22.lessons.lesson_4_0;

import by.belhard.j22.homeworks.hw_03.ht_03_08_Gamer.Gamer;

public class StringExample {

    public static void main(String[] args) {

        int i = 100;

        System.out.println(i); // "100"

        Gamer gamer = new Gamer(25, 10, "Vasiliy");
        gamer.setXY(11,2);
        System.out.println(gamer);

        System.out.println(gamer.getName() + " " + gamer.getDistance()
                + " (" + gamer.getX() + ":" + gamer.getY() + ")");

        System.out.printf("%-10s - %.2f - (%d:%d)", gamer.getName(), gamer.getDistance(),
                gamer.getX(), gamer.getY());
    }
}