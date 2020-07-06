package by.belhard.j22.homeworks.hw_06.ht_06_02_persons_list;

//Создать класс Person с полем String name.
// В другом классе создать поле List<Person> persons.
// Записать в список 5 экземпляров класса Person.
// Создать метод, который будет принимать параметр String name
// и возвращать из списка объект Person с таким именем
// (либо null, если человека с таким именем нет в списке).
// После этого вызвать у получившегося объекта метод toString().

import java.util.ArrayList;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Masha"));
        persons.add(new Person("Susia"));
        persons.add(new Person("Sema"));
        persons.add(new Person("Vasia"));
        persons.add(new Person("Chucha"));
    }
}
