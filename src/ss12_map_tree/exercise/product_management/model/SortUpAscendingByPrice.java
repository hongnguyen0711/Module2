package ss12_map_tree.exercise.product_management.model;

import ss12_map_tree.exercise.product_management.model.Product;

import java.util.Comparator;

public class SortUpAscendingByPrice implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return (int) (product1.getPrice() - product2.getPrice());
    }

}
