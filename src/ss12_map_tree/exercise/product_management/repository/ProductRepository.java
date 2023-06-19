package ss12_map_tree.exercise.product_management.repository;

import ss12_map_tree.exercise.product_management.model.SortDowAscendingByPrice;
import ss12_map_tree.exercise.product_management.model.SortUpAscendingByPrice;
import ss12_map_tree.exercise.product_management.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    Scanner scanner = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "HP", "China", 15));
        productList.add(new Product(2, "Dell", "China", 10));
        productList.add(new Product(3, "Apple", "USA", 20));
    }

    @Override
    public List<Product> display() {
        return productList;
    }

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public void delete(int id) {
        boolean flag = false;
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                System.out.println("Bạn có muốn xóa sản phẩm: " + productList.get(i).toString() +
                        "\nNhập 1 để xác nhận, nhập bất kì nếu muốn hủy bỏ!");
                int confirm = Integer.parseInt(scanner.nextLine());
                if (confirm == 1) {
                    productList.remove(productList.get(i));
                }
                flag = true;
            } else {
                flag = false;
            }
        }
        if (flag) {

        } else {
            System.out.println("Không có sp này!");
        }
    }

    @Override
    public void edit(Product product) {
        for (Product p: productList) {
            if (p.getId()==product.getId()){
                p = product;
            }
        }
    }

    @Override
    public void sortUp() {
        Collections.sort(productList, new SortUpAscendingByPrice());
    }

    @Override
    public void sortDow() {
        Collections.sort(productList, new SortDowAscendingByPrice());
    }

    @Override
    public void search(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name)){
                System.out.println(productList.get(i));
            }
        }
    }
}
