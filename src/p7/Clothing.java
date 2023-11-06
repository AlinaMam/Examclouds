package p7;

public abstract class Clothing {
    private ClothingSize size;
    private double price;
    private String color;

    public Clothing(ClothingSize size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public ClothingSize getSize() {
        return size;
    }

    public void setSize(ClothingSize size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
