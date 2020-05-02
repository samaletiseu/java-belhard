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

        int r = 10; // circle radius
        double pi = 3.14159265; //pi можно задать, а можно использовать класс Math.PI

        if (r > 0) {
            // circle area
            double s = pi * r * r;
            double s1 = Math.PI * r * r; // class Math - standard library
            System.out.printf("Circle area = %.4f\n", s);

            // circumference
            double l = 2 * pi * r;
            System.out.printf("Circumference = %.4f", l);

        } else {
            System.out.println("Invalid input!\nCircle radius cannot be negative.");
        }
    }
}