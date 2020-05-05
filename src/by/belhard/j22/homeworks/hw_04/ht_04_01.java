package by.belhard.j22.homeworks.hw_04;

//Вывести на консоль таблицу умножения

public class ht_04_01 {

    public static void main(String[] args) {

        int i, j;
        System.out.printf("    ");

        for (i = 1; i < 10; i++) {
            System.out.printf("%2d ", i);
        }

        System.out.printf("\n");

        for (i = 1; i < 10; i++) {
            System.out.printf("%2d  ", i);

            for (j = 1; j < 10; j++) {
                System.out.printf("%2d ", i*j);
            }
            System.out.printf("\n");
        }
    }
}