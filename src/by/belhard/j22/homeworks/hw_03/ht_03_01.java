package by.belhard.j22.homeworks.hw_03;

//Создать переменную r целого типа.
//Присвоить ей какое-то значение.
//r – радиус окружности.
//Вывести на экран площадь круга и длину окружности.
//
//Усложним: перед тем, как вычислять радиус и площадь, проверьте, что r – положительно.
//Если так – то вычисляем, если нет – выведем на консоль сообщение о невалидности входных данных.

public class ht_03_01 {

    public static void main(String[] args) {

        int r = -5; // circle radius
        double pi = 3.14159265;

        if (r > 0) {

            // circle area
            double s = (double) pi * r * r;

            // circumference
            double l = (double) 2 * pi * r;

            System.out.println("circle area = " + s);
            System.out.println("circumference = " + l);

        } else {

            System.out.println("Invalid input!\nCircle radius cannot be negative.");
        }
    }
}