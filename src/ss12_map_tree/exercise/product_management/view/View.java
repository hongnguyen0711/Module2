package ss12_map_tree.exercise.product_management.view;

import ss12_map_tree.exercise.product_management.controller.ProductController;

public class View {
    private static final ProductController productController = new ProductController();

    public static void main(String[] args) {
        productController.showMenu();
    }
}
