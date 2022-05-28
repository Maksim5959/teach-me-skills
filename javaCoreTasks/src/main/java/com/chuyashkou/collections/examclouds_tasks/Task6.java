package com.chuyashkou.collections.examclouds_tasks;

/*6. Разделение коллекции
Создать коллекцию, содержащую объекты HeavyBox.
Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
Если вес коробки больше 300 кг, коробка перемещается в другую коллекцию.*/

import com.chuyashkou.collections.examclouds_tasks.box.HeavyBox;
import com.chuyashkou.collections.examclouds_tasks.comparators.CompareToHeavyBoxByWeight;
import com.chuyashkou.collections.examclouds_tasks.comparators.CompareToHeavyBoxByWidth;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Task6 {

    public static void main(String[] args) {

        Set<HeavyBox> heavyBoxes = createHeavyBoxSet();
        relocateBoxes(heavyBoxes).forEach(System.out::println);
        System.out.println();
        heavyBoxes.forEach(System.out::println);
    }

    private static Set<HeavyBox> relocateBoxes(Set<HeavyBox> heavyBoxes) {
        Set<HeavyBox> result = new TreeSet<>(new CompareToHeavyBoxByWidth());
        HeavyBox[] heavyBoxesArray = heavyBoxes.toArray(new HeavyBox[0]);
        for (int i = heavyBoxesArray.length - 1; i > 0; i--) {
            if (heavyBoxesArray[i].getWeight() > 300) {
                result.add(heavyBoxesArray[i]);
                heavyBoxes.remove(heavyBoxesArray[i]);
            } else {
                break;
            }
        }
        return result;
    }

    private static Set<HeavyBox> createHeavyBoxSet() {
        Random random = new Random();
        Set<HeavyBox> heavyBoxes = new TreeSet<>(new CompareToHeavyBoxByWeight());
        for (int i = 1; i < 10; i++) {
            heavyBoxes.add(new HeavyBox(random.nextInt(10) + 1, random.nextInt(10) + 1,
                    random.nextInt(10) + 1, random.nextInt(1001) + 1));
        }
        return heavyBoxes;
    }
}
