package by.belhard.j22.homeworks.hw_04.ht_04_02_table;

import java.util.Arrays;

public class TableHandler {

    public static void main(String[] args) {
        Table table_01 = new Table(
                3,
                50,
                Material.WOOD,
                Type.ROUND,
                1500
        );

//        table_01.printLegNumber();
//        table_01.printHeigh();
//        table_01.printMaterial();
//        table_01.printType();
//        table_01.printPrice();

        System.out.println(table_01);

// Tables array
        Table[] tablesDiscount = new Table[4];

        tablesDiscount[0] = new Table(
                3,
                50,
                Material.WOOD,
                Type.ROUND,
                1500
        );

        tablesDiscount[1] = new Table(
                4,
                60,
                Material.PLASTIC,
                Type.SQUARE,
                5000
        );

        tablesDiscount[2] = new Table(
                4,
                55,
                Material.METAL,
                Type.RECTANGULAR,
                4500
        );

        tablesDiscount[3] = new Table(
                6,
                52,
                Material.COMBINATION,
                Type.OTHER,
                15000
        );

        System.out.print(Arrays.asList(tablesDiscount));
    }
}