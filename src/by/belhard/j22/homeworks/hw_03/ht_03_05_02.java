package by.belhard.j22.homeworks.hw_03;

//*доп2. Вывести числа из диапазонов [10; 19], [30; 39], [50; 59], [70; 79], [90; 99], которые делятся либо на 5, либо на 7, но не одновременно на 5 и на 7.

public class ht_03_05_02 {

    public static void main(String[] args) {

        int[] array0 = new int[100];
        int n = 0;

        for (int i = 0; i < array0.length; i++) {
            n++;

            if ((i >= 9 & i < 19) | (i >= 29 & i < 39) | (i >= 49 & i < 59) | (i >= 69 & i < 79) | (i >= 89 & i < 99)) {

                if (n % 5 != 0) {

                } else if (n % 7 != 0) {
                    System.out.print(n + " ");
                }

                if (n % 7 != 0) {
                } else if (n % 5 != 0) {
                    System.out.print(n + " ");
                }
            }
        }
    }
}
