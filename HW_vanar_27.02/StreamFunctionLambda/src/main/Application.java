package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

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

        IsHealthPredicate isHealthPredicate = product -> product.getCategory().equals("health");
        IsSHPredicate isSHPredicate = product -> product.getCategory().equals("second hand");
        ConsolePrintConsumer consolePrintConsumer = product -> System.out.println(product);

        List<Product> modifiedProductList = productList.stream().filter(isHealthPredicate::test)
                .filter(isSHPredicate::test)
//              .function
                .collect(Collectors.toList());


        productList.stream().forEach(consolePrintConsumer::consume);
        modifiedProductList.stream().forEach(consolePrintConsumer::consume);
    }
}
