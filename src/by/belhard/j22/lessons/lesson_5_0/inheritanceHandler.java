package by.belhard.j22.lessons.lesson_5_0;

import by.belhard.j22.homeworks.hw_04.ht_04_05_wardrobe.Wardrobe;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class inheritanceHandler {
    public static void main(String[] args) {
        Person person = new Person("Vasiliy", 20);
        System.out.println(person.getName() + person.getAge());
        System.out.println(person);

        Worker worker = new Worker("Sam", 30, "MAZ");
        System.out.println(worker.getName() + worker.getAge());
        System.out.println(worker);

        Manager manager = new Manager("Tonik", 46, "98798798");




        Person person2 = new Worker("Toni", 46, "IDF");

        person2.getAge();
        person2.getName();
//        person2.getFactoryName(); // но нельзя вызвать get.Factory, person2 он конечно Worker, но тип переменно то Person
        ((Worker)person2).getFactoryName();

        System.out.println(worker.hashCode());


    }
}

