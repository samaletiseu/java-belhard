package by.belhard.j22.homeworks.hw_03;

//Вывести в строку через пробел все числа от 1 до 100 (включая обе границы), которые делятся без остатка на 3 и на 7 одновременно.

public class ht_03_05 {

    public static void main(String[] args) {

        int[] array0 = new int[100];
        int n = 0;

        for (int i = 0; i < 100 ; i++) {
            n++;

            if (n%3 != 0) {

            } else if (n%7 != 0) {

            } else {
                System.out.print(n + " ");
            }
        }
    }
}