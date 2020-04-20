package by.belhard.j22.lessons.lesson_2_0;

public class task01 {

    public static void main(String[] args) {

        byte b = 126;
        int r = 150;

        double d = (double)b / r;

//        b -= 10; //b = b -10
//        b++;
//        b++;
//        r  = r + b;
        System.out.println(d);

        int i = 150;
        System.out.println((byte)i);

        char c = ' ';
        String str1 = "Hello";
        System.out.println(11 + 5 + str1 + 16 + 1); // приведение к строке

        char c1 = 'a';
        char c2 = 99;
//        System.out.println(c1 + " " + c2);
        System.out.println(++c1 + " " + --c2);
        System.out.println(--c1);
        System.out.println(--c2);



    }
}
