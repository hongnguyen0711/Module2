package ss12_map_tree.exercise.product_management.service;

import ss12_map_tree.exercise.product_management.model.Product;
import ss12_map_tree.exercise.product_management.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private final ProductRepository productRepository = new ProductRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<Product> products = productRepository.display();
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    @Override
    public void add() {
        System.out.println("Hãy nhập vào mã sp:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập vào tên sp:");
        String name = scanner.nextLine();
        System.out.println("Hãy nhập vào nơi sản xuất:");
        String made = scanner.nextLine();
        System.out.println("Hãy nhập vào giá:");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, made, price);
        productRepository.add(product);
    }

    @Override
    public void remove() {
        System.out.println("Hãy nhập vào id muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        productRepository.delete(id);
    }

    @Override
    public void edit() {
        display();
        System.out.println("Hãy nhập vào id muốn sửa: ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        Product productEdit = null;
        List<Product> productList = productRepository.display();
        for (Product p : productList) {
            if (p.getId() == idEdit) {
                productEdit = p;
            }
        }
        if (productEdit != null) {
            System.out.println(productEdit);
            System.out.println("Hãy nhập vào tên sp mới:");
            String name = scanner.nextLine();
            System.out.println("Hãy nhập vào nơi sản xuất mới:");
            String made = scanner.nextLine();
            System.out.println("Hãy nhập vào giá mới:");
            double price = Double.parseDouble(scanner.nextLine());
            productEdit.setName(name);
            productEdit.setMade(made);
            productEdit.setPrice(price);
            productRepository.edit(productEdit);
        } else {
            System.out.println("Không có sp này!");
        }
    }

    @Override
    public void sortUp() {
        productRepository.sortUp();
    }

    @Override
    public void sortDow() {
        productRepository.sortDow();
    }

    @Override
    public void search() {
        System.out.println("Hãy nhập tên sp muốn tìm kiếm: ");
        String name = scanner.nextLine();
        productRepository.search(name);
    }
}
