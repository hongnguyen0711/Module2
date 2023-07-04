package book_management.repository;

import book_management.model.Book;

import java.util.List;

public interface IBookRepository{
    List<Book>dispaly();
    void add(Book book);
    void sort(int num);
    int checkId(String id);
}
