package ss12_map_tree.exercise.product_management.model;

import java.util.Comparator;

public class SortDowAscendingByPrice implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return (int) (product2.getPrice() - product1.getPrice());
    }
}
