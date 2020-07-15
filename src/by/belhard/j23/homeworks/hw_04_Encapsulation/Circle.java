/*Создать 3 класса:
круг
квадрат
прямоугольник
Внутри каждого реализовать метод расчета периметра и площади. Каждый из данных методов не должен менять состояние объекта
*/

package by.belhard.j23.homeworks.hw_04_Encapsulation;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double area() {
        return radius * radius * Math.PI;
    }

    public double perimetr() {
        return radius * Math.PI * 2;
    }
}