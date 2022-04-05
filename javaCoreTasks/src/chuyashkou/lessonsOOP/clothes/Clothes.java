package chuyashkou.lessonsOOP.clothes;

public abstract class Clothes implements MensClothes, WomenClothes {

    private Size size;
    private double price;
    private String color;

    public Clothes() {
    }

    public Clothes(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
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

    @Override
    public String dressAMan() {
        return null;
    }

    @Override
    public String dressAWoman() {
        return null;
    }

    @Override
    public String toString() {
        return "{" +
                "size=" + size.toString() +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
