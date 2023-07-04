package book_management.repository;

import book_management.model.Book;
import book_management.utils.ReadAndWriteBook;

import java.util.ArrayList;
import java.util.List;

public class BookRepository implements IBookRepository{
    final String PATH_FILE = "src/book_management/data/book.csv";
    @Override
    public List<Book> dispaly() {
        List<Book> bookList= new ArrayList<>();
        List<String> list = ReadAndWriteBook.readFile(PATH_FILE);
        String[] info = null;
        for (String s : list) {
            info = s.split(",");
            Book book = new Book(info[0],info[1],info[2],Integer.parseInt(info[3]));
            bookList.add(book);
        }
        return bookList;
    }

    @Override
    public void add(Book book) {
        ReadAndWriteBook.writeFile(PATH_FILE,book.getInfo(),true);

    }

    @Override
    public void sort(int num) {

    }

    @Override
    public int checkId(String id) {
        List<Book> list = dispaly();
        for (Book b : list) {
            if (b.getId().equals(id)){
                return 1;
            }
        }
        return -1;
    }
}
