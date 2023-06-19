package ss12_map_tree.exercise.product_management.repository;

import ss12_map_tree.exercise.product_management.model.SortDowAscendingByPrice;
import ss12_map_tree.exercise.product_management.model.SortUpAscendingByPrice;
import ss12_map_tree.exercise.product_management.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
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
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.remove(productList.get(i));
            }
        }
    }

    @Override
    public void edit(Product product) {
        for (Product p : productList) {
            if (p.getId() == product.getId()) {
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
            if (productList.get(i).getName().equals(name)) {
                System.out.println(productList.get(i));
            }
        }
    }
}
