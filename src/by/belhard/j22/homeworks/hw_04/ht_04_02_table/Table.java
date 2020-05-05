package by.belhard.j22.homeworks.hw_04.ht_04_02_table;

// Описать класс Table. Поля: количество ножек, высота, материал, тип (круглый, прямоугольный, другой формы), цена.
// Переопределить для него метод toString(), чтобы данные о каждом объекте выводились «красиво».
// В другом классе создать несколько экземпляров класса Table, записать их в массив, вывести на консоль все элементы массива.

public class Table {
    private int leg;
    private double heigh;
    private Material material;
    private Type type;
    private double price;

    public Table(int leg, double heigh, Material material, Type type, double price) {
        this.leg = leg;
        this.heigh = heigh;
        this.material = material;
        this.type = type;
        this.price = price;
    }

//    public int getLeg() {
//        return leg;
//    }
//
//    public void setLeg(int leg) {
//        this.leg = leg;
//    }
//
//    public double getHeigh() {
//        return heigh;
//    }
//
//    public void setHeigh(double heigh) {
//        this.heigh = heigh;
//    }
//
//    public Material getMaterial() {
//        return material;
//    }
//
//    public void setMaterial(Material material) {
//        this.material = material;
//    }
//
//    public Type getType() {
//        return type;
//    }
//
//    public void setType(Type type) {
//        this.type = type;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }

        @Override
    public String toString() {
        return "\nleg = " + leg +
                "\nheigh = " + heigh +
                "\nmaterial = " + material +
                "\ntype = " + type +
                "\nprice = " + price + "\n";
    }

//    public void printLegNumber() {
//        System.out.println("Legs number = " + leg);
//    }
//
//    public void printHeigh() {
//        System.out.println("Heigh = " + heigh);
//    }
//
//    public void printMaterial () {
//        System.out.println("Material = " + material);
//    }
//
//    public void printType() {
//        System.out.println("Type = " + type);
//    }
//
//    public void printPrice() {
//        System.out.println("Price = " + price);
//    }
}