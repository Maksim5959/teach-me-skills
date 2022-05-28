package com.chuyashkou.collections.examclouds_tasks;

/*2. Создать TreeSet
Создать TreeSet содержащий HeavyBox.
HeavyBox должен реализовать интерфейс Comparable.
Распечатать содержимое с помощью for each.*/

import com.chuyashkou.collections.examclouds_tasks.box.HeavyBox;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Task2 {

    public static void main(String[] args) {

        Set<HeavyBox> heavyBoxes = createHeavyBoxSet();
        heavyBoxes.forEach(System.out::println);
    }

    private static Set<HeavyBox> createHeavyBoxSet() {
        Random random = new Random();
        Set<HeavyBox> heavyBoxes = new TreeSet<>();
        for (int i = 1; i < 10; i++) {
            heavyBoxes.add(new HeavyBox(random.nextInt(10)+1,random.nextInt(10)+1,
                    random.nextInt(10)+1, random.nextInt(1001)+1));
        }
        return heavyBoxes;
    }
}
