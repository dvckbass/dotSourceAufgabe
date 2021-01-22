package main.java.de.latifasari.view;

import main.java.de.latifasari.model.Product;

import java.util.Map;

public class ShoppingCartView {
    public void checkout(int totalProduct, Map<Product, Integer> productMap, float discount, double totalPrice)  {

        System.out.println("Bild \t\t\t Name \t\t\t\t Menge \t\t Preis");
        productMap.keySet().forEach(product -> {
            System.out.println(product.getImgFile() + "\t" + product.getName() + "\t\t" + productMap.get(product) + "\t\t" +
                    product.getPrice());
        });
        System.out.println("-----------------------------------------------");
        System.out.println("Summe (" + totalProduct + " Artikel): " + totalPrice + " €");
    }
}
