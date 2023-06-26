package ss17_io_binary_file.exersice.product_managment.view;

import ss17_io_binary_file.exersice.product_managment.controller.ProductController;

public class View {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.showMenu();

    }
}
