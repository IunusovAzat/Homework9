public class Book {
    private String titel;
    private int yearPublish;
    private Author author;

    public Book(String titel, int yearPublish, Author author) {
        this.titel = titel;
        this.yearPublish = yearPublish;
        this.author = author;
    }

    public String getTitel() {
        return titel;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }

    @Override
    public String toString() {
        return "Книга: " + titel + " " + "Год издания: " + yearPublish +" " + "Автор: " + author;
    }
}
