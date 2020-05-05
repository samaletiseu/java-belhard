package by.belhard.j22.lessons.lesson_5_0.String;

public class task_02 {
    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println(s1.hashCode());
        s1 += "def";
        System.out.println(s1.hashCode());

        System.out.println(s1);

        StringBuilder sb = new StringBuilder("adc");
        System.out.println(sb.hashCode());
        sb.append("def");
        System.out.println(sb.hashCode());
        System.out.println(sb.toString());

//        StringBuffer

        String a = "abc";
        String b = "abc";
        System.out.println(a.equals(b));
        System.out.println(a == b); // плохой способ

    }
}
