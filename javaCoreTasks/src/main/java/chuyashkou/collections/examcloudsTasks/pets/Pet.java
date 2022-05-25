package chuyashkou.collections.examcloudsTasks.pets;

import java.util.Objects;

public class Pet {

    private String food;
    private String location;

    public Pet() {
    }

    public Pet(String food, String location) {
        this.food = food;
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(food, pet.food) && Objects.equals(location, pet.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(food, location);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
