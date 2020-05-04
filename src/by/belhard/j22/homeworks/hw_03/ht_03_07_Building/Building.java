package by.belhard.j22.homeworks.hw_03.ht_03_07_Building;

//Опишите (то есть создайте класс, описывающий…) сущность Здание.
// Здание можно охарактеризовать назначением (например, жилой дом, офисное здание, промышленный объект, хоз. постройка и т.д.),
// адресом, количеством этажей, наличием(или отсутствием) лифта, материалом, из которого оно построено, годом постройки.
// Адрес состоит из улицы и номера дома.

public class Building {

    private Type type;
    private Address address;
    private int floorsNumber;
    private boolean elevator;
    private Material material;
    private int year;

    public Building(Type type, Address address, int floor, boolean elevator, Material material, int year) {

        this.type = type;
        this.address = address;
        this.floorsNumber = floor;
        this.elevator = elevator;
        this.material = material;
        this.year = year;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getFloor() {
        return floorsNumber;
    }

    public void setFloor(int floor) {
        this.floorsNumber = floor;
    }

    public boolean isElevator() {
        return elevator;
    }

//    public void setElevator(boolean elevator) {
//        this.elevator = elevator;
//    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
