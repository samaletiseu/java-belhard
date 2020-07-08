//Создать класс прямоугольника, задать в нем методы расчета площади и периметра
//        Создать класс квадрат (наследник класса прямоугольника)
//        Создать класс эллипс, задать в нем методы расчета площади и периметра
//        Создать класс окружность(наследник класса эллипс)
//
//        Все классы разместить в одном проекте
//        Классы-наследники для расчета периметра и площади должны использовать методы родительских классов

package by.belhard.j23.homeworks.hw_05_Inheritance;

public class Circle extends Ellipse {
    public Circle(int a, int b) {
        super(a, b);
    }

    @Override
    public double area() {
        return super.area();
    }

    @Override
    public double perimetr() {
        return super.perimetr();
    }
}