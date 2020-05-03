package by.belhard.j22.homeworks.hw_04.ht_04_04_catalog;

//4. [Выполняется на основе решения 3й задачи] Опишите класс Картотека.
// Он должен содержать метод, который принимает 2 параметра: массив книг, имя автора.
// Возвращать этот метод должен массив книг этого автора (либо пустой массив, если книг этого автора нет).

public class CatalogHandler {

    public static void main(String[] args) {

        CatalogBook[] booksList = new CatalogBook[100];

        booksList[0] = new CatalogBook(
                "Lord of the rings. The Fellowship of the Ring",
                670,
                new CatalogAuthor("John Ronald Reuel Tolkien", 81),
                CatalogFormat.FB2
        );

        booksList[1] = new CatalogBook(
                "Lord of the rings. The Two Towers",
                720,
                new CatalogAuthor("John Ronald Reuel Tolkien", 81),
                CatalogFormat.FB2
        );

        booksList[2] = new CatalogBook(
                "Lord of the rings. The Return of the King",
                736,
                new CatalogAuthor("John Ronald Reuel Tolkien", 81),
                CatalogFormat.EPUB
        );

        booksList[3] = new CatalogBook(
                null,
                76,
                new CatalogAuthor("John Ronald Reuel Tolkien", 81),
                CatalogFormat.DJVU
        );

        booksList[4] = new CatalogBook(
                "",
                516,
                new CatalogAuthor("Andrzej Sapkowski", 71),
                CatalogFormat.DJVU
        );

        booksList[5] = new CatalogBook(
                "Wiedźmin. Ostatnie życzenie",
                1,
                new CatalogAuthor("Andrzej Sapkowski", 71),
                CatalogFormat.AZW
        );

        booksList[6] = new CatalogBook(
                "Wiedźmin. Miecz przeznaczenia",
                413,
                new CatalogAuthor("Andrzej Sapkowski", 1),
                CatalogFormat.AZW
        );

        Catalog catalog = new Catalog(booksList);

        CatalogBook[] foundedBooks = catalog.getBooksByAuthor("Andrzej Sapkowski");

        boolean ifFoundBook = false;

        for (int i = 0; i < foundedBooks.length; i++) {
            if (foundedBooks[i] != null) {
                ifFoundBook = true;
                System.out.println(foundedBooks[i]);
            }
        }
        if (ifFoundBook == false) {
            System.out.println("Nothing found");
        }
    }
}