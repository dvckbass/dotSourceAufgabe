package main.java.de.latifasari.view;

import main.java.de.latifasari.model.Product;

import java.util.Map;

public class ShoppingCartView {
    public void checkout(int totalProduct, Map<Product, Integer> productMap, float discount, double totalPrice) {
        System.out.println("Bild \t Name \t Menge \t Preis");
        productMap.keySet().forEach(product -> {
            System.out.println(product.getImgFile() + "\t" + product.getName() + "\t" + productMap.get(product) + "\t" +
                    product.getPrice());
        });
        System.out.println("-----------------------------------------------");
        System.out.println("Summe (" + totalProduct + " Artikel): " + totalPrice + " €");
    }
}
