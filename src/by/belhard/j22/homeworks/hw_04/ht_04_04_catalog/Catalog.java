package by.belhard.j22.homeworks.hw_04.ht_04_04_catalog;

public class Catalog {
    private CatalogBook[] catalogBooks;

    public Catalog(CatalogBook[] catalogBooks) {
        this.catalogBooks = catalogBooks;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "catalogBook=" + catalogBooks;
    }

    public CatalogBook[] getBooksByAuthor(String authorName) {

        CatalogBook[] booksFound = new CatalogBook[100];
        int bookCounter = 0;

        for (int i = 0; i < catalogBooks.length; i++) {
            if (catalogBooks[i] != null && catalogBooks[i].getAuthor().getName() == authorName) {
                booksFound[bookCounter] = catalogBooks[i];
                bookCounter++;
            }
        }
        return booksFound;
    }
}