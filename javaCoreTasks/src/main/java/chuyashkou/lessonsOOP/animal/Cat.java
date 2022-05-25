package chuyashkou.lessonsOOP.animal;

public class Cat extends Animal {

    int dexterityLevel;

    public Cat() {
    }

    public Cat(String food, String location, int dexterityLevel) {
        super(food, location);
        this.dexterityLevel = dexterityLevel;
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу");
    }

    @Override
    public void eat() {
        System.out.println("Кот ест " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Кот спит");
    }
}
