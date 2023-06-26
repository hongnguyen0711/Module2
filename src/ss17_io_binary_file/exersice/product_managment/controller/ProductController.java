package ss17_io_binary_file.exersice.product_managment.controller;

import ss17_io_binary_file.exersice.product_managment.service.IProductService;
import ss17_io_binary_file.exersice.product_managment.service.ProductService;

import java.util.Scanner;

public class ProductController {
    IProductService iProductService = new ProductService();

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("PRODUCT MANAGEMENT SYSTEM\n" +
                    "Chọn chức năng để tiếp tục:\n" +
                    "1.Hiển thị danh sách sản phẩm\n" +
                    "2.Thêm mới sản phẩm\n" +
                    "3.Tìm kiếm sản phẩm\n" +
                    "4.Thoát");
            String choise = scanner.nextLine();
            switch (choise) {
                case "1":
                    iProductService.displayProduct();
                    break;
                case "2":
                    iProductService.addProduct();
                    break;
                case "3":
                    iProductService.searchProduct();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Không đúng chức năng!");
            }
        } while (flag);

    }
}
