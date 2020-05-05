package by.belhard.j22.homeworks.hw_04.ht_04_05_wardrobe;

// Описать класс Clothes, имеющий единственное поле - название.

public class Clothes {

    private final String name;

    public Clothes(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " ";
    }
}