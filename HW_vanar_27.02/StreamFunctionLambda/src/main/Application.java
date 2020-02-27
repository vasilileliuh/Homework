package main;

import source.Product;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    private static final float VATMultiplier = 1.18f;

    @FunctionalInterface
    interface VATFunction {
        Product calculate(Product product);
    }

    @FunctionalInterface
    interface IsHealthPredicate {
        Boolean test(Product product);
    }

    @FunctionalInterface
    interface IsSHPredicate {
        Boolean test(Product product);
    }

    @FunctionalInterface
    interface ConsolePrintConsumer {
        void consume(Product product);
    }

    public static void main(String[] args) {

        List<Product> productList = Arrays.asList(new Product("health", "AppleJuice", 27.8f, 50),
                new Product("second hand", "Old phone", 125.45f, 1),
                new Product("second hand", "Old Phone2", 100.7f, 3),
                new Product("health", "Training apparatus", 85f, 12),
                new Product("food", "Bread", 4.5f, 250));

        VATFunction vatFunction = product -> {
            float newPriceWithVAT = product.getPrice() * VATMultiplier;
            return new Product(product.getCategory(), product.getName(), newPriceWithVAT, product.getQuantity());
        };
        IsHealthPredicate isNotHealthPredicate = product -> !"health".equals(product.getCategory());
        IsSHPredicate isNotSHPredicate = product -> !"second hand".equals(product.getCategory());
        ConsolePrintConsumer consolePrintConsumer = System.out::println;

        List<Product> modifiedProductList = productList.stream()
                .filter(isNotHealthPredicate::test)
                .filter(isNotSHPredicate::test)
                .map(vatFunction::calculate)
                .collect(Collectors.toList());

        modifiedProductList.forEach(consolePrintConsumer::consume);
    }
}
