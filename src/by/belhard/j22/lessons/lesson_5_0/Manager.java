package by.belhard.j22.lessons.lesson_5_0;

public class Manager extends Person{

    private String phone;

    public Manager(String name, int age, String phone) {
        super(name, age);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "Manager{" +
                "phone='" + phone + '\'' +
                '}';
    }
}
