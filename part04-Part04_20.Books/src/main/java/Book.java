public class Book {
    String name;
    private int pages, publicationYear;

    public Book(String name, int pages, int publicationYear) {
        this.name = name;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String getName () {
        return this.name;
    }

    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.publicationYear;
    }
}
