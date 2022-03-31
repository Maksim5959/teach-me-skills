package chuyashkou.lessonsOOP.animal;

public class Dog extends Animal {

    int healthLevel;

    public Dog() {
    }

    public Dog(String food, String location, int healthLevel) {
        super(food, location);
        this.healthLevel = healthLevel;
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Собака спит");
    }
}
