package main.java.de.latifasari.controller;

import main.java.de.latifasari.model.Product;
import main.java.de.latifasari.model.ShoppingCart;
import main.java.de.latifasari.view.ShoppingCartView;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class ShoppingCartController {
    private ShoppingCart shoppingCart;
    private ShoppingCartView shoppingCartView;
    private Map<Product, Integer> productMap;

    public ShoppingCartController(ShoppingCart shoppingCart, ShoppingCartView shoppingCartView) {
        this.shoppingCart = shoppingCart;
        this.shoppingCartView = shoppingCartView;
        this.productMap = this.shoppingCart.getProductMap();
    }


    // fügt Produkt in den Einkaufswagen
    public void addProduct(Product product) {
        // wenn das gleiche Produkt schon im Einkaufswagen ist, wird die Anzahl erhöht
        // sonst ist die Anzahl = 1
        if(this.productMap.containsKey(product)) {
            this.productMap.put(product, this.productMap.get(product) + 1);
        } else {
            this.productMap.put(product, 1);
        }
        this.shoppingCart.setProductMap(this.productMap);
        this.shoppingCart.setTotalProduct(this.shoppingCart.getTotalProduct() + 1);
    }

    // entferne Produkt von dem Einkaufswagen
    public void removeProduct(Product product) throws NoSuchElementException{
        if(this.productMap.containsKey(product)) {
            if(this.productMap.get(product) == 1) {
                this.productMap.remove(product);
            } else {
                this.productMap.put(product, this.productMap.get(product) - 1);
            }
        } else {
            throw new NoSuchElementException();
        }
        this.shoppingCart.setProductMap(this.productMap);
        this.shoppingCart.setTotalProduct(this.shoppingCart.getTotalProduct() - 1);
    }

    // Aktualisiere die Anzahl von Produkte
    public void updateQuantity(Product product, int quantity) throws NoSuchElementException {
        this.shoppingCart.setTotalProduct(this.shoppingCart.getTotalProduct()
                - this.productMap.get(product)+ quantity);
        if(this.productMap.containsKey(product)) {
            this.productMap.put(product, quantity);
        } else {
            throw new NoSuchElementException();
        }
        this.shoppingCart.setProductMap(this.productMap);
    }

    // Berechne die Summe
    public  double getTotalPrice() throws  IllegalArgumentException{
        double sum = productMap.keySet().stream().mapToDouble(product -> product.getPrice() * productMap.get(product)).sum();
        if(this.shoppingCart.getDiscount_absolut() != 0 && this.shoppingCart.getDiscount_percent() != 0) {
            throw new IllegalArgumentException();
        } else if(this.shoppingCart.getDiscount_absolut() != 0) {
            sum -= this.shoppingCart.getDiscount_absolut();
        } else if(this.shoppingCart.getDiscount_percent() != 0) {
            sum -= sum * this.shoppingCart.getDiscount_percent() / 100;
        }
        return sum;
    }
}
