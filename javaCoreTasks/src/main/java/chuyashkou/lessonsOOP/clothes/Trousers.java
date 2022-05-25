package chuyashkou.lessonsOOP.clothes;

public class Trousers extends Clothes implements MensClothes, WomenClothes {

    public Trousers() {
    }

    public Trousers(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String dressAMan() {
        return toString();
    }

    @Override
    public String dressAWoman() {
        return toString();
    }

    @Override
    public String toString() {
        return "Trousers - " + super.toString();
    }
}
