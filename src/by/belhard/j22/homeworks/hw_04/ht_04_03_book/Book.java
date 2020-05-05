package by.belhard.j22.homeworks.hw_04.ht_04_03_book;

//Описать класс Книга. Поля: название, количество страниц, автор, формат. Автор – тоже класс, содержит имя, возраст.
//При создании экземпляров описанных классов нужно проверять, что введены валидные данные
// (количество страниц и возраст должны быть больше 2,
// название книги и имя автора – не пустые (name != null и name.length() != 0).
// Если данные не проходят валидацию, то присваивать полям какие-то дефолтные значения).
// Уделите внимание правильному описанию всех частей класса:
// приватные поля, методы доступа к полям (геттеры и сеттеры),
// подумайте, какой доступ вы хотите предоставить, а какой – ограничить.
// Не забудьте про метод toString().

public class Book {

    private String name;
    private int pagesAmount;
    private Author author;
    private Format format;

    public Book(String name, int pagesAmount, Author author, Format format) {
        if (name != null && name.length() != 0) {
            this.name = name;
        } else this.name = "Undefined";

        if (pagesAmount > 2) {
            this.pagesAmount = pagesAmount;
        } else this.pagesAmount = 0;

        this.author = author;
        this.format = format;
    }

    @Override
    public String toString() {
        return "name = " + name +
                "\npagesAmount = " + pagesAmount +
                "\nauthor " + author +
                "\nformat = " + format +
                "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPagesAmount() {
        return pagesAmount;
    }

    public void setPagesAmount(int pagesAmount) {
        this.pagesAmount = pagesAmount;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Format getFormat() {
        return format;
    }

    private void setFormat(Format format) {
        this.format = format;
    }
}