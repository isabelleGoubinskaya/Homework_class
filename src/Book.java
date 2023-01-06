public class Book {
    private String name;
    private Author author;
    private int yearPublication;

    Book(String nameBook, Author author, int yearPublication) {
        this.name = nameBook;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    String getNameBook() {
        return name;
    }

    int getYearPublication() {
        return yearPublication;
    }

    int setYearPublication(int a) {

        return yearPublication = a;
    }
}
