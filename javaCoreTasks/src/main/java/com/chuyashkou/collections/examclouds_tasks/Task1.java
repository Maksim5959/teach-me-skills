package com.chuyashkou.collections.examclouds_tasks;

import com.chuyashkou.collections.examclouds_tasks.box.HeavyBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*1. Создать динамический массив
Создать динамический массив, содержащий объекты класса HeavyBox.
Распечатать его содержимое используя for each.
Изменить вес первого ящика на 1.
Удалить последний ящик.
Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
Удалить все ящики.*/

public class Task1 {

    public static void main(String[] args) {

        List<HeavyBox> heavyBoxes = createHeavyBoxList();
        printHeavyBoxByForEach(heavyBoxes);
        boxWeightUpdate(heavyBoxes, 1, 1);
        listBoxesToArray(heavyBoxes);
        removeAllBoxes(heavyBoxes);
    }

    private static void listBoxesToArray(List<HeavyBox> heavyBoxes) {
        HeavyBox[] heavyBoxes1 = new HeavyBox[heavyBoxes.size()];
        System.out.println(Arrays.toString(heavyBoxes.toArray(heavyBoxes1)));

        System.out.println(Arrays.toString(heavyBoxes.toArray(new HeavyBox[0])));

        Object[] objects = heavyBoxes.toArray();
        System.out.println(Arrays.toString(objects));
    }

    private static void removeAllBoxes(List<HeavyBox> heavyBoxes) {
        heavyBoxes.removeAll(heavyBoxes);
    }

    private static void boxWeightUpdate(List<HeavyBox> heavyBoxes, int numberOfBox, double newBoxWeight) {
        if (numberOfBox >= 1 && newBoxWeight > 0) heavyBoxes.get(numberOfBox - 1).setWeight(newBoxWeight);
    }

    private static List<HeavyBox> createHeavyBoxList() {
        List<HeavyBox> heavyBoxes = new ArrayList<>();
        for (int i = 2; i < 11; i++) {
            heavyBoxes.add(new HeavyBox(i, i, i, i));
        }
        return heavyBoxes;
    }

    private static void printHeavyBoxByForEach(List<HeavyBox> heavyBoxes) {
        heavyBoxes.forEach(System.out::println);
        System.out.println();
    }
}
