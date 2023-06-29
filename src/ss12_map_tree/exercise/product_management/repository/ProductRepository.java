package ss12_map_tree.exercise.product_management.repository;

import ss12_map_tree.exercise.product_management.model.SortDowAscendingByPrice;
import ss12_map_tree.exercise.product_management.model.SortUpAscendingByPrice;
import ss12_map_tree.exercise.product_management.model.Product;
import ss12_map_tree.exercise.product_management.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private final String PRODUCT_PATH_FILE = "src/ss12_map_tree/exercise/product_management/data/product.csv";
    public final String COMMA = ",";
//    static List<Product> productList = new ArrayList<>();
//
//    static {
//        productList.add(new Product(1, "HP", "China", 15));
//        productList.add(new Product(2, "Dell", "China", 10));
//        productList.add(new Product(3, "Apple", "USA", 20));
//    }

    @Override
    public List<Product> display() {
//        return productList;
    List<Product> productList = new ArrayList<>();
    List<String> list = ReadAndWrite.readFile(PRODUCT_PATH_FILE);
    String[] info = null;
        for (String s : list) {
            info = s.split(COMMA);
            Product product = new Product(Integer.parseInt(info[0]),info[1],info[2],Double.parseDouble(info[3]));
            productList.add(product);
        }
        return productList;
    }

    @Override
    public void add(Product product) {
//        productList.add(product);
        ReadAndWrite.writeFile(PRODUCT_PATH_FILE,product.toStringProduct(),true);
    }

    @Override
    public void delete(int id) {
//        for (int i = 0; i < productList.size(); i++) {
//            if (id == productList.get(i).getId()) {
//                productList.remove(productList.get(i));
//            }
//        }
    }

    @Override
    public void edit(Product product) {
//        for (Product p : productList) {
//            if (p.getId() == product.getId()) {
//                p = product;
//            }
//        }
    }

    @Override
    public void sortUp() {
//        Collections.sort(productList, new SortUpAscendingByPrice());
    }

    @Override
    public void sortDow() {
//        Collections.sort(productList, new SortDowAscendingByPrice());
    }

    @Override
    public void search(String name) {
//        for (int i = 0; i < productList.size(); i++) {
//            if (productList.get(i).getName().equals(name)) {
//                System.out.println(productList.get(i));
//            }
//        }
    }
}
