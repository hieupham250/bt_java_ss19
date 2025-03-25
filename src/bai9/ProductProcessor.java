package bai9;

import java.util.List;
import java.util.function.Predicate;

public interface ProductProcessor {
    double calculateTotalValue(List<Product> products);

    static void printProductList(List<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    default boolean hasExpensiveProduct(List<Product> products, Predicate<Product> predicate) {
        for (Product product : products) {
            if (predicate.test(product)) {
                return true;
            }
        }
        return false;
    }
}
