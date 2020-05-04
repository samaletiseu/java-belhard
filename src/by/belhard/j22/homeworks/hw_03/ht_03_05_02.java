package by.belhard.j22.homeworks.hw_03;

//*доп2. Вывести числа из диапазонов [10; 19], [30; 39], [50; 59], [70; 79], [90; 99], которые делятся либо на 5, либо на 7, но не одновременно на 5 и на 7.

public class ht_03_05_02 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

// My way - long
            if ((i >= 10 & i <= 19) | (i >= 30 & i <= 39) | (i >= 50 & i <= 59) | (i >= 70 & i <= 79) | (i >= 90 & i <= 99)) {

// The best way - through decimal ranges
//            if (i / 10 % 2 == 1) {

                if (i%5 == 0 ^ i%7 == 0) {
                System.out.print(i + " ");
                }
            }
        }
    }
}
