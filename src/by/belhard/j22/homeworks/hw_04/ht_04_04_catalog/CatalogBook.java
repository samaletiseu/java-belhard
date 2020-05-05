package by.belhard.j22.homeworks.hw_04.ht_04_04_catalog;

public class CatalogBook {

    private String name;
    private int pagesAmount;
    private CatalogAuthor author;
    private CatalogFormat format;

    public CatalogBook(String name, int pagesAmount, CatalogAuthor author, CatalogFormat format) {
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

    public CatalogAuthor getAuthor() {
        return author;
    }

    public void setAuthor(CatalogAuthor author) {
        this.author = author;
    }

    public CatalogFormat getFormat() {
        return format;
    }

    private void setFormat(CatalogFormat format) {
        this.format = format;
    }
}