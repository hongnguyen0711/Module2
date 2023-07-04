package book_management.view;

import book_management.controller.BookController;

import java.awt.print.Book;

public class View {
    public static void main(String[] args) {
        BookController bookController = new BookController();
        bookController.showMenu();
    }
}
