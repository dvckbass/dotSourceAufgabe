package main.java.de.latifasari.model;

/**
 * Das Modell für Product
 */
public class Product {
    private long id;
    private String name;
    private String imgFile;
    private String description;
    private double price;
    private int rating;

    public Product(long id, String name, String imgFile, String description, double price, int rating) {
        this.id = id;
        this.name = name;
        this.imgFile = imgFile;
        this.description = description;
        this.price = price;
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        public String getImgFile() {
        return imgFile;
    }

    public void setImgFile(String imgFile) {
        this.imgFile = imgFile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
