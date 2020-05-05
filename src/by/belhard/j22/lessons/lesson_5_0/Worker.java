package by.belhard.j22.lessons.lesson_5_0;

import java.util.Objects;

public class Worker extends Person{

    private String factoryName;


    public Worker(String name, int age, String factoryName) {
        super(name, age);
        this.factoryName = factoryName;
    }

    public String getFactoryName() {
        return factoryName;
    }

    //

// Переопределение метода
    @Override
    public void work() {
        System.out.println(getName() + "hard work");
    }

    @Override
    public String toString() {
        return "Worker{" + super.toString() +
                "factoryName='" + factoryName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return factoryName.equals(worker.factoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(factoryName);
    }
}