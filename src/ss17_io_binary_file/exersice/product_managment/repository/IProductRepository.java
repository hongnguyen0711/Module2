package ss17_io_binary_file.exersice.product_managment.repository;

import ss17_io_binary_file.exersice.product_managment.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> displayProduct();

    void addProduct(Product product);

    public Product getProduct(int index);

    int searchId(int id);
}
