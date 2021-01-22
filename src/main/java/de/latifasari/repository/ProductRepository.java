package main.java.de.latifasari.repository;

import main.java.de.latifasari.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    // Daten werden statisch initialisiert
    private Product tastatur = new Product(1, "Tastatur Logitech", "tastatur.png",
            "Durch einen USB Empfänger ist die Tastatur mit Ihrem PC verbunden", 34.99f, 7);
    private Product ladegeraet = new Product(2, "Ladegerät Samsung", "ladegeraet.png",
            "Das USB Ladegerät kann Ihr Handys in 35 Min. bis zu 80% aufladen", 10.79f, 3);
    private Product dvd = new Product(3, "DVD Harry Potter", "dvd_harry_potter.png",
            "Die komplette 8-Filme-Sammlung von Harry Potter", 26.49, 9);
    private Product lautsprecher = new Product(4, "Echo Dot Lautsprecher", "echo_dot.png",
            "Hören Sie Musik, Hörbücher und Podcasts überall in Ihrem Zuhause", 59.99f, 6);
    private Product kabel = new Product(5, "HDMI Kabel", "hdmi_kabel.png",
            "Das iVANKY HDMI Kabel (1,2 METER) unterstützt UltraHD 4K 2160p, HD 2K 1080p, QHD 1440p",
            9.99f, 5);

    private List<Product> products = new ArrayList<>();

    public ProductRepository() {
        this.products.add(tastatur);
        this.products.add(ladegeraet);
        this.products.add(dvd);
        this.products.add(lautsprecher);
        this.products.add(kabel);
    }

    // gibt alle Produkte zurück
    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(long id) {
        return products.stream().filter(product -> product.getId() == id).findFirst().orElse(null);
    }
}
