package by.belhard.j22.lessons.lesson_3_0;

public class task01 {
    public static void main(String[] args) {

        int a = 2;
        int n = 3;
        int r = a;

        for (int i = 0; i < n-1; i++) {
            r = r * a;
        }
        System.out.println(r);
    }
}
