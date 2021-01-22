package main.java.de.latifasari;

import main.java.de.latifasari.controller.ShoppingCartController;
import main.java.de.latifasari.model.Product;
import main.java.de.latifasari.model.ShoppingCart;
import main.java.de.latifasari.view.ShoppingCartView;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Daten werden statisch initialisiert
        Product tastatur = new Product(1, "Tastatur Logitech", "tastatur.png",
                "Durch einen USB Empfänger ist die Tastatur mit Ihrem PC verbunden", 34.99, 7);
        Product ladegeraet = new Product(2, "Ladegerät Samsung", "ladegeraet.png",
                "Das USB Ladegerät kann Ihr Handys in 35 Min. bis zu 80% aufladen", 10.79, 3);
        Product dvd = new Product(3, "DVD Harry Potter", "dvd_harry_potter.png",
                "Die komplette 8-Filme-Sammlung von Harry Potter", 26.49, 9);
        Product lautsprecher = new Product(4, "Echo Dot Lautsprecher", "echo_dot.png",
                "Hören Sie Musik, Hörbücher und Podcasts überall in Ihrem Zuhause", 59.99, 6);
        Product kabel = new Product(5, "HDMI Kabel", "hdmi_kabel.png",
                "Das iVANKY HDMI Kabel (1,2 METER) unterstützt UltraHD 4K 2160p, HD 2K 1080p, QHD 1440p",
                9.99, 5);

        ShoppingCart shoppingCart = new ShoppingCart(1, 0, 10);
        ShoppingCartView shoppingCartView = new ShoppingCartView();
        ShoppingCartController shoppingCartController = new ShoppingCartController(shoppingCart, shoppingCartView);
        shoppingCartController.addProduct(tastatur);
        shoppingCartController.addProduct(tastatur);
        shoppingCartController.removeProduct(tastatur);
        shoppingCartController.addProduct(ladegeraet);
        shoppingCartController.addProduct(ladegeraet);
        shoppingCartController.updateQuantity(tastatur, 5);
        shoppingCartController.updateView();
    }
}
