package challenge.controller;

import challenge.model.Book;
import challenge.service.BookService;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BookController implements IController<Book>{
    public Scanner input;

    public BookController(Scanner input) {
        this.input = input;
    }

    private BookService bookService = new BookService();

    @Override
    public void add() {
        try {
            System.out.println("\n-----------------------------------");
            System.out.println("\t=== Insert Data Book :) ===");
            System.out.println("-----------------------------------");
            System.out.println("Entry Code Book");
            var codeBook = input.next();
            System.out.println("Entry Title Book" + input.nextLine());
            var titleBook = input.nextLine();
            System.out.println("Entry Publisher");
            var publisher = input.nextLine();
            System.out.println("Entry year publication");
            var yearPublication = input.nextInt();
            System.out.println("Entry Author Book" + input.nextLine());
            var author = input.nextLine();

            Book book = new Book(
                    codeBook,
                    titleBook,
                    publisher,
                    yearPublication,
                    author
            );
            bookService.insert(book);
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public List<Book> getAll() {
        List<Book> books = bookService.getAll();
        return books;
    }

    @Override
    public Book showByTitle() {
        Book book = new Book();
        try {
            System.out.println("Entry Title Book" + input.nextLine());
            var tittleBook = input.nextLine();
            book = bookService.getByTitle(tittleBook);
            if (book == null) {
                throw new Exception("data null");
            }
            System.out.println(book);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return book;
    }

    @Override
    public void delete() {
        try {
            System.out.println("Entry code book");
            var codeBook = input.next();
            bookService.delete(codeBook);
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void createDefault() {
        Book book1 = new Book("BJ01","Java Dasar 01","Andi",2020,"Eko");
        Book book2 = new Book("BJ02","Java Dasar 02","Andi",2020,"Eko");
        Book book3 = new Book("BJ03","Java Dasar 03","Andi",2020,"Eko");
        Book book4 = new Book("BJ04","Java Dasar 04","Andi",2020,"Eko");
        Book book5 = new Book("BJ05","Java Dasar 05","Andi",2020,"Eko");
        bookService.insert(book1);
        bookService.insert(book2);
        bookService.insert(book3);
        bookService.insert(book4);
        bookService.insert(book5);
    }
}
