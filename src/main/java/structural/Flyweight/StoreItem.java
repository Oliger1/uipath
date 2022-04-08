package structural.Flyweight;

public class StoreItem {
    private int id;
    private String name;
    private String description;
    private double price;
    private String photoPath;

    public StoreItem(int id, String name, String description, double price, String photoPath) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.photoPath = photoPath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }
}
