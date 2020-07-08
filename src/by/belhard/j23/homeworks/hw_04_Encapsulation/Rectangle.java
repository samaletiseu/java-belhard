//Создать 3 класса:
//        круг
//        квадрат
//        прямоугольник
//
//        Внутри каждого реализовать метод расчета периметра и площади. Каждый из данных методов не должен менять состояние объекта

package by.belhard.j23.homeworks.hw_04_Encapsulation;

public class Rectangle {
    private int a ;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int area() {
        return a * b;
    }

    public int perimetr() {
        return 2 * (a + b);
    }
}