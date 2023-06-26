package ss17_io_binary_file.exersice.product_managment.repository;

import ss17_io_binary_file.exersice.product_managment.model.Product;
import ss17_io_binary_file.exersice.product_managment.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private final String PATH_PRODUCT = "src/ss17_io_binary_file/exersice/product_managment/data/product.dat";

    @Override
    public List<Product> displayProduct() {
        List<Product> productList;
        productList = ReadAndWrite.readBinaryFile(PATH_PRODUCT);
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        List<Product> productList = new ArrayList<>();
        productList = ReadAndWrite.readBinaryFile(PATH_PRODUCT);
        productList.add(product);
        ReadAndWrite.writeBinaryFile(PATH_PRODUCT, productList);
    }

    @Override
    public Product getProduct(int index) {
        List<Product> productList = displayProduct();
        return productList.get(index);
    }

    @Override
    public int searchId(int id) {
        List<Product> productList = displayProduct();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
