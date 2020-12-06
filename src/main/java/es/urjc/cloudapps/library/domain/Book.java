package es.urjc.cloudapps.library.domain;

public class Book {

    private final BookId id;
    private final String title;
    private final String summary;
    private final String author;
    private final String editorial;

    public Book(BookId id, String title, String summary, String author, String editorial) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.author = author;
        this.editorial = editorial;
    }

    public BookId getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getSummary() {
        return this.summary;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getEditorial() {
        return this.editorial;
    }
}
