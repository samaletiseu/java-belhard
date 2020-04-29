package by.belhard.j22.homeworks.hw_03.ht_03_08_Gamer;

//Создать класс Игрок.
// Игрок имеет координаты x и y.
// Игрок должен уметь (через методы):
//а) переместиться в новые координаты (то есть изменить свои текущие координаты на новые, переданные ему),
//б) вывести на консоль значение текущего положения,
//
//доп1*) игрок должен хранить значение пройденного расстояния и уметь выводить на консоль это значение.

public class Gamer {

    private int x;
    private int y;

    public Gamer(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    public int getX() {
//        return x;
//    }
//
//    public void setX(int newX) {
//        this.recalculateTravelledDistance(newX, y);
//        this.x = newX;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int newY) {
//        this.recalculateTravelledDistance(x, newY);
//        this.y = newY;
//    }

    public void printPosition() {
        System.out.println("Current x = " + this.x + "\nCurrent y = " + this.y);
    }

    double distance = 0;

    public void setXY(int newX, int newY) {
//        тут есть вопрос: чтобы помнить пройденное расстояние,
//        сначала нужно его посчитать заранее при задании новых координат,
//        а потом их засетать, иначе не работает вывод пройденного,
//        это наверное можно вынести в отдельный метод внутри класса, но пока моск все :(

        double currentTravelledDistance = Math.sqrt((newX - x) * (newX - x) + (newY - y) * (newY - y));
        distance = distance + currentTravelledDistance;

        this.x = newX;
        this.y = newY;
    }

    public void printTravelledDistance() {
        System.out.print("Travelled distance = ");
        System.out.printf("%.2f", distance);
        // и тут вопрос: можно в одну строку уместить вывод стринги
        // и значения с ограничением на количество знаков после запятой?
        System.out.println();
    }
}