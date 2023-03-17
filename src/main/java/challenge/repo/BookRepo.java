package challenge.repo;

import challenge.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepo implements IRepo<Book>{

    private List<Book> books = new ArrayList<>();

    @Override
    public void add(Book book) {
        this.books.add(book);
    }

    @Override
    public List<Book> getAll() {
        return this.books;
    }

    @Override
    public Book getByTitle(String title) {
        Book book = null;
        for (var result : books) {
            if (result.getTitle().equals(title)) {
                book = result;
            }
        }
        return book;
    }

    @Override
    public Book getByCode(String code) {
        Book book = null;
        for (var result : books) {
            if (result.getInfo_code().equals(code)) {
                book = result;
            }
        }
        return book;
    }

    @Override
    public void delete(Book book) {
        this.books.remove(book);
    }
}
