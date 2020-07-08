package by.belhard.j23.lessons.lesson_06;

import java.util.Objects;

public class Triangle extends Figure {
    private int a;
    private int b;
    private int c; // лучше считать по теореме Пифагора, а не задавать

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int calcSquare() {
        return a+b+c;
    }

    @Override
    public int calcPerimetr() {
        return a*b/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return a == triangle.a &&
                b == triangle.b &&
                c == triangle.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}
