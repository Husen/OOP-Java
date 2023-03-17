package challenge.service;

import challenge.model.Book;
import challenge.repo.BookRepo;

import java.util.List;

public class BookService implements IService<Book>{
    private BookRepo bookRepo = new BookRepo();

    @Override
    public void insert(Book book) {
        try {
            bookRepo.add(book);
            System.out.println("\nSuccess create data");
            getAll();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public List<Book> getAll() {
        List<Book> books = bookRepo.getAll();
        var size = bookRepo.getAll().size();
        if (size < 1) {
            System.err.println("List book empty\n");
        } else {
            int i = 1;
            for (var book : bookRepo.getAll()) {
                System.out.println("No : " + i++);
                System.out.println(book);
                System.out.println();
            }
        }
        return books;
    }

    @Override
    public Book getByTitle(String title) {
        Book book = new Book();
        try {
            book = bookRepo.getByTitle(title);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return book;
    }

    @Override
    public Book getByCode(String code) {
        Book book = bookRepo.getByCode(code);
        if (book == null) {
            System.err.println("code undefined");
        }
        return book;
    }

    @Override
    public void delete(String codeBook) {
        try {
            Book book = getByCode(codeBook);
            if (book == null) {
                System.err.println("failed to delete\n");
            }
            bookRepo.delete(book);
            System.out.println("success delete record code " + codeBook + "\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
