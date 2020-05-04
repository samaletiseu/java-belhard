package by.belhard.j22.homeworks.hw_03;

//Создать массив целых чисел, записать в него 10 значений.
//Посчитать и вывести сумму всех значений и среднее значение.
//
//*доп. Посчитать и вывести медиану Медиана (вики).

public class ht_03_06 {

    public static void main(String[] args) {
        int[] array01 = new int[]{5, 16, 502, 6, -14, 27, -5600, 97, 33};
        int sum = 0;
        int avg = 0;
        double median = 0;

// My way
        for (int i = 0; i < array01.length; i++) {
            sum = sum + array01[i];
            avg = sum / array01.length;
        }

// Through for each
//        for (int element : array01) {
//            sum = sum + element;
//            avg = sum / array01.length;
//        }

        System.out.println("Array sum = " + sum);
        System.out.println("Array average = " + avg);

// Median
        java.util.Arrays.sort(array01); // sort array asc
//        for (int i = 0; i < array01.length; i++) {
//            System.out.print(array01[i] + " ");
//        }
//        System.out.println();

        if (array01.length % 2 == 0) {
            median = ((double)array01[array01.length / 2] + (double)array01[array01.length / 2 - 1]) / 2;
        } else
            median = array01[array01.length / 2];
        System.out.println("Mediana = " + median);
    }
}