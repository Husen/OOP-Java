package challenge.model;

import java.util.Date;

public class Book {
    private String info_code;
    private String title;
    private String publisher;
    private int publicationyear;
    private String author;

    public Book() {
    }

    public Book(String info_code, String title, String publisher, int publicationyear, String author) {
        this.info_code = info_code;
        this.title = title;
        this.publisher = publisher;
        this.publicationyear = publicationyear;
        this.author = author;
    }

    public String getInfo_code() {
        return info_code;
    }

    public void setInfo_code(String info_code) {
        this.info_code = info_code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublicationyear() {
        return publicationyear;
    }

    public void setPublicationyear(int publicationyear) {
        this.publicationyear = publicationyear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "info_code='" + info_code + '\'' +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publicationyear=" + publicationyear +
                ", author='" + author + '\'' +
                '}';
    }
}
