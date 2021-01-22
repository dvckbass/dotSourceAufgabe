package main.java.de.latifasari.view;



import main.java.de.latifasari.model.Product;
import main.java.de.latifasari.model.ShoppingCart;


import java.util.Map;

public class ShoppingCartView {
    public void checkout(int totalProduct, Map<Product, Integer> productMap, float discount, double totalPrice,
                         ShoppingCart.Discount discountType)  {

        System.out.println("Bild \t\t\t Name \t\t\t\t Menge \t\t Preis");
        productMap.keySet().forEach(product -> {
            System.out.println(product.getImgFile() + "\t" + product.getName() + "\t\t" + productMap.get(product) + "\t\t" +
                    product.getPrice());
        });
        System.out.println("-----------------------------------------------");
        if(discountType == ShoppingCart.Discount.ABSOLUT) {
            System.out.println("Rabatt: " + discount + " €");
        } else if(discountType == ShoppingCart.Discount.PERCENT) {
            System.out.println("Rabatt: " + discount + " %");
        }
        System.out.println("Summe (" + totalProduct + " Artikel): " + totalPrice + " €");
    }
}
