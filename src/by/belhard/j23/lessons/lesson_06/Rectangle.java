package by.belhard.j23.lessons.lesson_06;

import java.util.Objects;

public class Rectangle extends Figure {

    private int a;
    private int b;

    public Rectangle() {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calcSquare() {
        return (a + b) * 2;
    }

    @Override
    public int calcPerimetr() {
        return a*b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return a == rectangle.a &&
                b == rectangle.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
