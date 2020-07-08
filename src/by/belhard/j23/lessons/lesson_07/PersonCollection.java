package by.belhard.j23.lessons.lesson_07;


public class PersonCollection  {

   private Person[] persons;
   private final static int INITIAL_CAPACITY = 10;
   private int size;

    public PersonCollection() {
        persons = new Person[INITIAL_CAPACITY];
        size = 0;
    }

    public void addElement(Person person ) {
        persons[size] = person;
        size++;
    };

    public Person getElement(int index) {
        return persons[index];
    };

    public int getSize() {
        return size;
    };
}
