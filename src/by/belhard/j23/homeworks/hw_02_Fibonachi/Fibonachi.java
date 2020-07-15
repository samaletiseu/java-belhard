/*
Вывести последовательность Фибоначчи до 1000
Чи́сла Фибона́ччи (иногда пишут Фибона́чи[2]) — элементы числовой последовательности
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, … ,
в которой первые два числа равны либо 1 и 1, либо 0 и 1, а каждое последующее число равно сумме двух предыдущих чисел[3].
*/


package by.belhard.j23.homeworks.hw_02_Fibonachi;

public class Fibonachi {
    public static void main(String[] args) {
        int n0 = 0;
        int n1 = 1;
        int n2;
        System.out.println(n0 + " " + n1 + " ");


        n2 = n0 + n1;
        while (n0 + n1 <= 1000) {
            n2 = n0 + n1;
            System.out.println(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
    }
}