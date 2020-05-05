package by.belhard.j22.homeworks.hw_04.ht_04_05_wardrobe;

////Описать класс Шкаф, в котором будет поле private final Clothes[] shelves.
// Этот массив объектов класса одежда представляет собой абстракцию полок шкафа,
// на которые можно "положить" одежду.
// Шкаф должен содержать следующий функционал:
//а) положить вещь на конкретную полку. Если полка занята – должно выводиться сообщение об этом.
//б) «закинуть» вещь в шкаф, она должна попадать на любую свободную полку, если таковая имеется.
// Если свободных полок нет – сообщение.
//в) взять вещь с конкретной полки. Если полка пустая – сообщение об этом.
//г) провести ревизию того, что есть в шкафу, то есть просто вывести на консоль содержимое всех полок.
//Уделите внимание формату вывода.
//Напоминаю, что переменная ссылочного типа может хранить значение null, которое обозначает "пустоту",
// соответственно, если на полке ничего не лежит, то эта ячейка массива должна быть пустая.
// Это можно проверить выражением типа shelves[0] == null, например.

import java.util.Arrays;
import java.util.Random;

public class Wardrobe {

    private final Clothes[] shelves;

    public Wardrobe(Clothes[] shelves) {
        this.shelves = shelves;
    }

//    Another way
    public Wardrobe(int numberOfShelves){
      if (numberOfShelves <= 0) {
          numberOfShelves = 3;
      }
        this.shelves = new Clothes[numberOfShelves];
    }
//

    @Override
    public String toString() {
        return "Wardrobe{" +
                "shelves=" + Arrays.toString(shelves) +
                '}';
    }

    public void putClothesThingToGivenShelve(Clothes newClothesThing, int shelveNumber) {
        if (shelves[shelveNumber] == null) {
            shelves[shelveNumber] = newClothesThing;
            System.out.println(newClothesThing + "on shelve");
        } else {
            System.out.println("Shelve " + shelveNumber + " is full, please try another shelve!");
        }
    }

    public void dropClothesThingToAnyEmptyShelve(Clothes newClothesThing) {

        boolean emptyShelveExists = false;
        for (int i = 0; i < shelves.length; i++) {
            if (shelves[i] == null) {
                emptyShelveExists = true;
                break;
            }
        }

        if (emptyShelveExists == true) {
            Random randomShelve = new Random();
            while (true) {
                int indexRandom = randomShelve.nextInt(shelves.length - 1);
                if (shelves[indexRandom] == null) {
                    shelves[indexRandom] = newClothesThing;
                    System.out.println(newClothesThing + "drop on shelve " + indexRandom);
                    break;
                }
            }
        } else {
            System.out.println("No empty shelve found!");
        }
    }

    public Clothes getClothesThingFromGivenShelve(int shelveNumber) {
        if (shelves[shelveNumber] != null) {
            Clothes clothesThingFromShelve = shelves[shelveNumber];
            System.out.println(clothesThingFromShelve);
            shelves[shelveNumber] = null;
            return clothesThingFromShelve;
        } else {
            System.out.println("Shelve is empty!");
        }
        return null;
    }

    public void reviseClothes () {
        for (int i = 0; i < shelves.length; i++) {
            if (shelves[i] != null) {
                System.out.println(shelves[i]);
            } else {
                System.out.println("Empty shelve");
            }
// Можно так
            System.out.printf("%d) %s\n",
                    (i+1),
                    shelves[i] != null ? shelves[i] : "empty");
        }
    }
// Валидация (засунуть ее везде где есть номер полки)
    private boolean validateShelveNumber (int shelveNumber) {
        return shelveNumber >= 0 && shelveNumber < shelves.length;
    }
}