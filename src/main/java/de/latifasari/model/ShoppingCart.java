package main.java.de.latifasari.model;

import java.util.List;

// Das Modell für ShoppingCart
public class ShoppingCart {
    private long id;
    private float discount_absolut;
    private float discount_percent;
    private List<Product> products;
    private int totalProduct;

    public ShoppingCart(long id, float discount_absolut, float discount_percent, List<Product> products, int totalProduct) {
        this.id = id;
        this.discount_absolut = discount_absolut;
        this.discount_percent = discount_percent;
        this.products = products;
        this.totalProduct = totalProduct;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getDiscount_absolut() {
        return discount_absolut;
    }

    public void setDiscount_absolut(float discount_absolut) {
        this.discount_absolut = discount_absolut;
    }

    public float getDiscount_percent() {
        return discount_percent;
    }

    public void setDiscount_percent(float discount_percent) {
        this.discount_percent = discount_percent;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getTotalProduct() {
        return totalProduct;
    }

    public void setTotalProduct(int totalProduct) {
        this.totalProduct = totalProduct;
    }
}
