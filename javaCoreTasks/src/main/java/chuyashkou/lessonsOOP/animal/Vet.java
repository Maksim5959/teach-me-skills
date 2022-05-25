package chuyashkou.lessonsOOP.animal;

public class Vet {

    String name;

    public Vet() {
    }

    public Vet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void treatAnimal(Animal animal) {
        System.out.print("Животное из " + animal.getLocation() + " ест " + animal.getFood() + ", ");
        animal.makeNoise();
    }
}
