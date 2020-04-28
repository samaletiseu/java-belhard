package by.belhard.j22.homeworks.hw_03;

//Дана температура в градусах.
//Вывести на экран, что лучше надеть: куртку, свитер, майку или ничего.
//
//Например,при температуре менее 10 – куртку, от 10 до 15 – ветровку, от 16 до 20 свитер, от 21 до 30 майку, выше 30 – ничего.


public class ht_03_02 {

    public static void main(String[] args) {

        int t; // temperature in degrees

        t = 27;

        if (t < 10) {
            System.out.println("Put on a jacket!");
        } else if (t >= 10 & t <= 15) {
            System.out.println("Put on a windbreaker!");
        } else if (t >= 16 & t <= 20) {
            System.out.println("Put on a sweater!");
        } else if (t >= 21 & t <= 30) {
            System.out.println("Put on a shirt!");
        } else {
            System.out.println("Do not wear anything!");
        }
    }
}
