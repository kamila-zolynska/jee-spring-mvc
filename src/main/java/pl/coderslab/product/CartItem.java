package pl.coderslab.product;

import lombok.Data;

@Data
public class CartItem {
    private Integer quantity;
    private Product product;

    public CartItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }
}
