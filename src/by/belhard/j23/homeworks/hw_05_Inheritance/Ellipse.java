//Создать класс прямоугольника, задать в нем методы расчета площади и периметра
//        Создать класс квадрат (наследник класса прямоугольника)
//        Создать класс эллипс, задать в нем методы расчета площади и периметра
//        Создать класс окружность(наследник класса эллипс)
//
//        Все классы разместить в одном проекте
//        Классы-наследники для расчета периметра и площади должны использовать методы родительских классов

package by.belhard.j23.homeworks.hw_05_Inheritance;

public class Ellipse {
    private int a;
    private int b;


    public Ellipse(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return Math.PI * a * b;
    }

    public double perimetr() {
        return (4 * Math.PI * a * b + Math.sqrt(a - b)) / (a + b);
    }
}