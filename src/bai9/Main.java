package bai9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1200),
                new Product("Mouse", 25),
                new Product("Keyboard", 45),
                new Product("Monitor", 150),
                new Product("USB Drive", 20)
        );

        ProductProcessor processor = new ProductProcessorImpl();

        Predicate<Product> isExpensive = product -> product.getPrice() > 100;

        if (processor.hasExpensiveProduct(products, isExpensive)) {
            System.out.println("Sản phẩm có giá trị lớn hơn 100:");
            for (Product product : products) {
                if (isExpensive.test(product)) {
                    System.out.println(product);
                }
            }
        } else {
            System.out.println("Không có sản phẩm lớn hơn 100");
        }

        double totalValue = processor.calculateTotalValue(products);
        System.out.println("Tổng giá trị của tất cả sản phẩm: " + totalValue);

        System.out.println("Danh sách sản phẩm:");
        ProductProcessor.printProductList(products);
    }
}
