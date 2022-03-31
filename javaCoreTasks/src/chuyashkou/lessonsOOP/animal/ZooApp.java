package chuyashkou.lessonsOOP.animal;

public class ZooApp {

    public static void main(String[] args) {

        Animal cat = new Cat("Мышь", "Австрия", 7);
        Animal dog = new Dog("Курицу", "Германия", 7);
        Animal horse = new Horse("Сено", "Голландия", 7);

        Vet vet = new Vet("Иван");

        Animal[] animals = {cat, dog, horse};

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
