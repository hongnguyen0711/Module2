package book_management.controller;

import book_management.service.BookService;
import book_management.service.IBookService;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BookController {
    IBookService iBookService = new BookService();
    Scanner scanner = new Scanner(System.in);
    public void showMenu(){
        boolean flag =true;
        do {
            System.out.println("-----Book Management-----\n" +
                    "1.Hiển thị\n" +
                    "2.Thêm mới\n" +
                    "3.Sắp xếp\n" +
                    "4.Thoát\n" +
                    "Chọn chức năng để tiếp tục:");
            String choise = scanner.nextLine();
            switch (choise){
                case "1":
                    iBookService.display();
                    break;
                case "2":
                    iBookService.addNew();
                    break;
                case "3":
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Không đúng chức năng!");
            }
        }while (flag);
    }
}
