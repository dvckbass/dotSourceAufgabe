package main.java.de.latifasari.model;

import java.util.HashMap;
import java.util.Map;

// Das Modell für ShoppingCart
public class ShoppingCart {
    public enum Discount {
        ABSOLUT,
        PERCENT
    }

    private long id;
    private float discount_absolut;
    private float discount_percent;
    private Discount discountType;
    private Map<Product, Integer> productMap;
    private int totalProduct;

    public ShoppingCart(long id, float discount_absolut, float discount_percent) throws IllegalArgumentException{
        this.id = id;
        if(discount_absolut != 0 && discount_percent != 0) {
            throw new IllegalArgumentException();
        } else if(discount_absolut != 0) {
            this.discount_absolut = discount_absolut;
            this.discount_percent = 0;
            discountType = Discount.ABSOLUT;
        } else {
            this.discount_percent = discount_percent;
            this.discount_absolut = 0;
            discountType = Discount.PERCENT;
        }
        this.discount_absolut = discount_absolut;
        this.discount_percent = discount_percent;
        this.totalProduct = 0;
        this.productMap = new HashMap<>();
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

    public Map<Product, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<Product, Integer> productMap) {
        this.productMap = productMap;
    }

    public int getTotalProduct() {
        return totalProduct;
    }

    public void setTotalProduct(int totalProduct) {
        this.totalProduct = totalProduct;
    }

    public Discount getDiscountType() {
        return discountType;
    }

    public void setDiscountType(Discount discountType) {
        this.discountType = discountType;
    }
}
