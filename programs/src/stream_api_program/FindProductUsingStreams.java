package stream_api_program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Product {
    String name;
    String model;
    int price;
    int rating;
    int manufacturingYear;

    // Constructor
    public Product(String name, String model, int price, int rating, int manufacturingYear) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.rating = rating;
        this.manufacturingYear = manufacturingYear;
    }

    // Getters
    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    @Override
    public String toString() {
        return "Product{name = '" + name + "', model = '" + model + "', " +
                "price = '" + price + "', rating = '" + rating + "', " +
                "manufacturingYear = " + manufacturingYear + "}";
    }
}

public class FindProductUsingStreams {
    public static void main(String[] args) {
        // Sample data
        List<Product> products = Arrays.asList(
                new Product("Phone A", "A2021", 230, 4, 2021),
                new Product("Phone B", "B2022", 330, 3, 2022),
                new Product("Phone C", "C2023", 450, 6, 2023),
                new Product("Phone D", "C2024", 450, 5, 2024)
        );

        // first sort using price and then rating
        List<Product> sortedProducts = products.stream().sorted(Comparator.comparing(Product::getPrice).thenComparing(Product::getRating)).collect(Collectors.toList());

        sortedProducts.forEach(System.out::println);
        // output :
        // Product{name = 'Phone A', model = 'A2021', price = '230', rating = '4', manufacturingYear = 2021}
        // Product{name = 'Phone B', model = 'B2022', price = '330', rating = '3', manufacturingYear = 2022}
        // Product{name = 'Phone D', model = 'C2024', price = '450', rating = '5', manufacturingYear = 2024}
        // Product{name = 'Phone C', model = 'C2023', price = '450', rating = '6', manufacturingYear = 2023}

        // without stream
        // Sort by price (ascending) and rating (descending)
        products.sort(
                Comparator.comparing((Product product) -> product.price) // First by price
                        .thenComparing((Product product) -> -product.rating) // Then by rating (descending)
        );

        // Print sorted products
        System.out.println("Sorted Products:");
        // for (Product product : products) {
           // System.out.println(product);
        // }
        products.forEach(System.out::println);
        // output :
        // Sorted Products:
        // Product{name = 'Phone A', model = 'A2021', price = '230', rating = '4', manufacturingYear = 2021}
        // Product{name = 'Phone B', model = 'B2022', price = '330', rating = '3', manufacturingYear = 2022}
        // Product{name = 'Phone C', model = 'C2023', price = '450', rating = '6', manufacturingYear = 2023}
        // Product{name = 'Phone D', model = 'C2024', price = '450', rating = '5', manufacturingYear = 2024}

        // to find latest manufacturing year
        Optional<Product> latestProduct = products.stream().max(Comparator.comparing(Product::getManufacturingYear));

        latestProduct.ifPresent(product -> System.out.println("Latest product : "+ product));
        // output : Latest product : Product{name = 'Phone D', model = 'C2024', price = '450', rating = '5', manufacturingYear = 2024}
    }
}
