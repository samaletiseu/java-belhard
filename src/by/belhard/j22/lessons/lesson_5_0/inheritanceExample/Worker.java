package by.belhard.j22.lessons.lesson_5_0.inheritanceExample;

public class Worker extends Person {

    private String factoryName;

    public Worker(String name, int age, String factoryName) {
        super(name, age);
        this.factoryName = factoryName;
    }

    // Переопределение метода
    @Override
    public void work() {
        System.out.println(getName() + " works hard");
    }

    public String getFactoryName() {
        return factoryName;
    }

    @Override
    public String toString() {
        return "Worker{" + super.toString() +
                " factoryName='" + factoryName + '\'' +
                '}';
    }
}