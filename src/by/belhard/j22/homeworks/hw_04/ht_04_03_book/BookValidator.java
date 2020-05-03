package by.belhard.j22.homeworks.hw_04.ht_04_03_book;

//При создании экземпляров описанных классов нужно проверять, что введены валидные данные
// (количество страниц и возраст должны быть больше 2,
// название книги и имя автора – не пустые (name != null и name.length() != 0).
// Если данные не проходят валидацию, то присваивать полям какие-то дефолтные значения).

public class BookValidator {

    public static void main(String[] args) {

        Book book_01 = new Book(
                "Lord of the rings. The Fellowship of the Ring",
                670,
                new Author("John Ronald Reuel Tolkien", 81),
                Format.FB2
        );

        Book book_02 = new Book(
                "Lord of the rings. The Two Towers",
                720,
                new Author("John Ronald Reuel Tolkien", 81),
                Format.FB2
        );

        Book book_03 = new Book(
                "Lord of the rings. The Return of the King",
                736,
                new Author("John Ronald Reuel Tolkien", 81),
                Format.EPUB
        );

        Book book_04 = new Book(
                null,
                76,
                new Author("John Ronald Reuel Tolkien", 81),
                Format.DJVU
        );

        Book book_05 = new Book(
                "",
                516,
                new Author("Andrzej Sapkowski", 71),
                Format.DJVU
        );

        Book book_06 = new Book(
                "Wiedźmin. Ostatnie życzenie",
                1,
                new Author("Andrzej Sapkowski", 71),
                Format.AZW
        );

        Book book_07 = new Book(
                "Wiedźmin. Miecz przeznaczenia",
                413,
                new Author("Andrzej Sapkowski", 1),
                Format.AZW
        );

        System.out.println(book_01);
        System.out.println(book_02);
        System.out.println(book_03);
        System.out.println(book_04);
        System.out.println(book_05);
        System.out.println(book_06);
        System.out.println(book_07);
    }
}