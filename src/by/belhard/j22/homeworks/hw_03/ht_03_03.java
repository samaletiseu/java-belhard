package by.belhard.j22.homeworks.hw_03;

//Даны зарплаты трех людей salary1, salary2 и salary3.
//Найти разницу между максимальной и минимальной зарплатой.

public class ht_03_03 {

    public static void main(String[] args) {

        int salary1 = 10;
        int salary2 = 0;
        int salary3 = 0;
        int max, min;

        if (salary1 >= 0 & salary2 >= 0 & salary3 >= 0) {

            if (salary1 > salary2) {
                max = salary1;
            } else
                max = salary2;

            if (salary3 > max) {
                max = salary3;
            }

            System.out.println("Max salary = " + max);

            if (salary1 < salary2) {
                min = salary1;
            } else min = salary2;

            if (salary3 < min) {
                min = salary3;
            }

            System.out.println("Min salary = " + min);

            int raz = max - min;

            System.out.println("Difference between MAX and MIN = " + raz);
        } else {

            System.out.println("Invalid input!\nSalary cannot be negative.");
        }
    }
}