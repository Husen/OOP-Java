package challenge.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private Scanner input = new Scanner(System.in);
    BookController bookController = new BookController(input);
    public void createFirstRecord() {
        bookController.createDefault();
    }
    public void run() {
        boolean run = true;
        while(run) {
            System.out.println("\n-----------------------------------");
            System.out.println("\t\t=== belajar_oop.Main Menu ===");
            System.out.println("-----------------------------------");
            System.out.println("1. Add Book");
            System.out.println("2. Show Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Exit");
            System.out.print("\nMasukan menu yang dipilih : ");
            int selectMenu;
            try {
                selectMenu = input.nextInt();
                if (selectMenu < 1 || selectMenu > 4) {
                    System.err.println("menu undefined");
                } else {
                    switch (selectMenu) {
                        case 1 -> bookController.add();
                        case 2 -> show();
                        case 3 -> bookController.delete();
                        case 4 -> System.exit(0);
                    }
                }
            } catch (InputMismatchException e) {
                System.err.println(e.getMessage());
            }

        }
    }

    public void show() {
        System.out.println("\n-----------------------------------");
        System.out.println("\t\t=== belajar_oop.Main Menu ===");
        System.out.println("-----------------------------------");
        System.out.println("1. Show All");
        System.out.println("2. Show By Title Book");
        System.out.print("\nMasukan menu yang dipilih : ");
        int selectShow;
        try {
            selectShow = input.nextInt();
            if (selectShow < 1 || selectShow > 2) {
                System.err.println("menu undefined");
            } else {
                switch (selectShow) {
                    case 1 -> bookController.getAll();
                    case 2 -> bookController.showByTitle();
                }
            }
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
    }
}
