package com.chuyashkou.collections.examclouds_tasks;

/*9. Домашние животные
Создайте класс Pet и его наследников Cat, Dog, Parrot.
Создайте отображение из домашних животных, где в качестве ключа выступает имя животного, а в качестве значения класс Pet.
Добавьте в отображение разных животных. Создайте метод выводящий на консоль все ключи отображения.*/

import com.chuyashkou.collections.examclouds_tasks.pets.Cat;
import com.chuyashkou.collections.examclouds_tasks.pets.Dog;
import com.chuyashkou.collections.examclouds_tasks.pets.Parrot;
import com.chuyashkou.collections.examclouds_tasks.pets.Pet;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Task9 {

    public static void main(String[] args) {

        Map<String, Pet> pets = createNewPetMap();
        printPetsNames(pets);
    }

    private static Map<String, Pet> createNewPetMap() {
        Map<String, Pet> pets = new HashMap<>();
        for (int i = 1; i < 11; i++) {
            Cat cat = new Cat(String.format("Food %d", 1), String.format("Country %d", i), String.format("Cat %d", i));
            Dog dog = new Dog(String.format("Food %d", 2), String.format("Country %d", i), String.format("Dog %d", i));
            Parrot parrot = new Parrot(String.format("Food %d", 3), String.format("Country %d", i), String.format("Parrot %d", i));
            pets.put(cat.getName(), cat);
            pets.put(dog.getName(), dog);
            pets.put(parrot.getName(), parrot);
        }
        return pets;
    }

    private static void printPetsNames(Map<String, Pet> pets) {
        TreeSet<String> petsNames = new TreeSet<>(String::compareTo);
        petsNames.addAll(pets.keySet());
        petsNames.forEach(System.out::println);
    }
}
