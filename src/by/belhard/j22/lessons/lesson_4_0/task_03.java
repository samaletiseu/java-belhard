package by.belhard.j22.lessons.lesson_4_0;

import by.belhard.j22.homeworks.hw_03.ht_03_08_Gamer.Gamer;

public class task_03 {

    public static void main(String[] args) {
        int i = 100;
        System.out.println(i);

        Gamer gamer = new Gamer(5, 8); //вывести на консоль ссылку
        System.out.println(gamer.toString()); //выведет hash код (int)

        System.out.println(gamer); //выведет hash код (int)

//        System.out.printf("%s - %f.2 - (%d:%d)", gamer.getX(), gamer.get(), gamer.getX());


    }
}
