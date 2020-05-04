package by.belhard.j22.homeworks.hw_03;

//Вывести в строку через пробел все числа от 1 до 100 (включая обе границы), которые делятся без остатка на 3 и на 7 одновременно.

public class ht_03_05 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) {

            } else if (i % 7 != 0) {

            } else {
                System.out.print(i + " ");
            }

// The best way
//        for (int i = 1; i <= 100 ; i++) {
//            if (i%3 == 0 && i%7 == 0) {
//                System.out.print(i + " ");
//            }
//        }
        }
    }
}