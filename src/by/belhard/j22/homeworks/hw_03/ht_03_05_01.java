package by.belhard.j22.homeworks.hw_03;

//*доп1. Вывести в строку через пробел все числа от 1 до 100, которые делятся без остатка либо на 5, либо на 7, но не одновременно на 5 и на 7.

public class ht_03_05_01 {

    public static void main(String[] args) {

        int[] array0 = new int[100];
        int n = 0;

        for (int i = 0; i < 100 ; i++) {
            n++;

            if (n%5 != 0) {

            } else if (n%7 != 0) {
                System.out.print(n + " ");
            }

            if (n%7 != 0) {
            } else if (n%5 != 0) {
                System.out.print(n + " ");
            }
        }
    }
}
