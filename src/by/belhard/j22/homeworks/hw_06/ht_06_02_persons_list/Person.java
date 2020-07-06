package by.belhard.j22.homeworks.hw_06.ht_06_02_persons_list;

//Создать класс Person с полем String name.
// В другом классе создать поле List<Person> persons.
// Записать в список 5 экземпляров класса Person.
// Создать метод, который будет принимать параметр String name
// и возвращать из списка объект Person с таким именем
// (либо null, если человека с таким именем нет в списке).
// После этого вызвать у получившегося объекта метод toString().

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    private String getPersonName(String name) {
        return this.name;
    }
}
