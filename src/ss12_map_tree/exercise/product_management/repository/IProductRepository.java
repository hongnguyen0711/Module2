package ss12_map_tree.exercise.product_management.repository;

import ss12_map_tree.exercise.product_management.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> display();
    void add(Product product);
    void delete(int id);
    void edit(Product product);
    void sortUp();
    void sortDow();
    void search(String name);

}
