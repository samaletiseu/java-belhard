/*Создать 3 класса:
круг
квадрат
прямоугольник
Внутри каждого реализовать метод расчета периметра и площади. Каждый из данных методов не должен менять состояние объекта
*/

package by.belhard.j23.homeworks.hw_04_Encapsulation;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);

        Square square1 = new Square(8);
        System.out.println(square1.area());

        Square square2 = new Square(18);
        System.out.println(square2.area());
        System.out.println(square1.area());


        Rectangle rectangle1 = new Rectangle(7, 12);
    }
}

/* Как и заказывал, методы в классах не меняют конкретные объекты.
 Меня смутила лекция к этой домашке, где много говорилось про static методы.
 Проверила: если делать переменные и методы классов static, то как раз методы меняют состояние объектов.
 То есть если первому square задать при инициализации 8, а второму 18,
 то с использованием static после задания 2-го первому выводит area как у второго. Мы затираем данные первого объекта данными второго.
 Если убрать static - неважно что кому задавать, их поля остаются за ними, у первого area посчитано с a = 8, у второго - с a = 18.
 И если снова вывести первый после инициализации второго - его area расчитано для а = 8, а не 18.
 Я все правильно сделала, или где-то провтыкала скрытый смысл?
*/