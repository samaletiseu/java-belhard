/*Создать 3 класса:
круг
квадрат
прямоугольник
Внутри каждого реализовать метод расчета периметра и площади. Каждый из данных методов не должен менять состояние объекта
*/

package by.belhard.j23.homeworks.hw_04_Encapsulation;

public class Square {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int area() {
        return a * a;
    }

    public int perimetr() {
        return 4 * a;
    }
}