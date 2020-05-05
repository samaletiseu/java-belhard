package by.belhard.j22.lessons.lesson_3_0;

// массивы
public class task02 {
    public static void main(String[] args) {
        int[] array0 = null; // default для массива

        int[] array1 = new int[3]; //1 способ задания массива

        // или
        // int array[];

        int[] array2 = new int[] {10, 5, 0, 1}; //2

        int[] array3 = {11, 2, -5};  //3

        System.out.println(array1[0]);
        System.out.println(array2[1]);
        System.out.println(array3[2]);
      //  System.out.println(array1[3]);

        System.out.println(array1.length);

        //
        char[] chars = new char[26]; // лат алфавит
        char z = 'z';

        for (int i = 0; i <= 25 ; i++) {
            chars[i] = (char)(z - i);
//            chars[i] = z;
//            z--;
           }
        System.out.println(chars);

        for (int i = 0; i < chars.length; i+=2) {
            System.out.print(chars[i] + ",");
        }

        for (char c : chars) {
            System.out.print(c + ",");
        }
    }
}
