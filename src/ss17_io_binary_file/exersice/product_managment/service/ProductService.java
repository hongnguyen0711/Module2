package ss17_io_binary_file.exersice.product_managment.service;

import ss17_io_binary_file.exersice.product_managment.model.Product;
import ss17_io_binary_file.exersice.product_managment.repository.IProductRepository;
import ss17_io_binary_file.exersice.product_managment.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    IProductRepository iProductRepository = new ProductRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addProduct() {
        boolean flag = true;
        do {
            try {
                System.out.print("Nhập id:");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập tên:");
                String name = scanner.nextLine();
                System.out.print("Nhập giá:");
                Double price = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập loại sp:");
                String productType = scanner.nextLine();
                System.out.print("Nhập mô tả:");
                String description = scanner.nextLine();
                flag = false;

                Product newProduct = new Product(id, name, price, productType, description);
                iProductRepository.addProduct(newProduct);
            } catch (NumberFormatException e) {
                System.out.println("Không đúng định dạng!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (flag);


    }

    @Override
    public void displayProduct() {
        List<Product> productList = iProductRepository.displayProduct();
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    @Override
    public void searchProduct() {
        System.out.print("Nhập id muốn tìm kiếm: ");
        boolean flag = false;
        int id;
        do {
            try {
                id = Integer.parseInt(scanner.nextLine());
                int index = iProductRepository.searchId(id);
                if (index == -1) {
                    System.out.println("không tồn tại!");
                } else {
                    System.out.println(iProductRepository.getProduct(index));
                    flag = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Không đúng định dạng!");
                flag = true;
            }
        } while (flag);

    }
}