package ss12_map_tree.exercise.product_management.controller;

import ss12_map_tree.exercise.product_management.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private final ProductService productService = new ProductService();

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng :" +
                    "\n1. Display" +
                    "\n2. Add" +
                    "\n3. Delete" +
                    "\n4. Edit" +
                    "\n5. Sort" +
                    "\n6. Search" +
                    "\n7. Exit");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("--------Chức năng hiển thị----------");
                    productService.display();
                    break;
                case "2":
                    System.out.println("-----------Thêm mới-----------------");
                    productService.add();
                    break;
                case "3":
                    System.out.println("-------------Xoá-----------------------");
                    productService.remove();
                    break;
                case "4":
                    System.out.println("-------------Sửa-----------------------");
                    productService.edit();
                    break;
                case "5":
                    System.out.println("------------- sắp xếp-----------------------\n" +
                            "1.Sắp xếp tăng dần theo giá sp.\n" +
                            "2.Sắp xếp giảm dần theo giá sp.");
                    int choose1 = Integer.parseInt(scanner.nextLine());
                    switch (choose1) {
                        case 1:
                            System.out.println("------------- Sắp xếp tăng dần-----------------------");
                            productService.sortUp();
                            break;
                        case 2:
                            System.out.println("------------- Sắp xếp giảm dần-----------------------");
                            productService.sortDow();
                            break;
                        default:
                            System.out.println("Không có chức năng này!");
                    }
                    break;
                case "6":
                    System.out.println("-------------Tìm kiếm-----------------------");
                    productService.search();
                    break;
                case "7":
                    flag = false;
                    break;
                default:
                    System.out.println("Nhập sai chức năng!");
            }
        } while (flag);
    }
}
