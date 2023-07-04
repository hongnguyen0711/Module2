package book_management.service;

import book_management.model.Book;
import book_management.regex.Regex;
import book_management.repository.BookRepository;
import book_management.repository.IBookRepository;

import java.util.List;
import java.util.Scanner;

public class BookService implements IBookService {
    IBookRepository iBookRepository = new BookRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<Book> bookList = iBookRepository.dispaly();
        for (Book b : bookList) {
            System.out.println(b);
        }
    }

    @Override
    public void addNew() {
        int index;
        String id;
        do {
            System.out.println("Nhập mã:");
            id = scanner.nextLine();
            index = iBookRepository.checkId(id);
            if (index == 1){
                System.out.println("id tồn tại!");
            }
        }while (index==1);
        String name = Regex.regexName();
        String autho = Regex.regexAutho();
        int price = Regex.checkPrice();
        Book newBook = new Book(id, name, autho, price);
        iBookRepository.add(newBook);
    }
}
