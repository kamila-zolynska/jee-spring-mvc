package pl.coderslab.product;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
