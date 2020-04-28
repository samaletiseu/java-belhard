package by.belhard.j22.lessons.lesson_3_0_Person.person;

public class Country {
    private String title;
    private int zipCode;

    public Country(String title, int zipCode) {
        this.title = title;
        this.zipCode = zipCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
