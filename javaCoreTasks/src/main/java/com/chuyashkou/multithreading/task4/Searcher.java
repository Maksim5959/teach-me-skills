package com.chuyashkou.multithreading.task4;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Searcher {

    private final List<Integer> list;

    public void printMax() {
        int max = list.get(0);
        for (int i : list) {
            if (max < i) max = i;
        }
        System.out.printf("max = %d\n", max);
    }

    public void printMin() {
        int min = list.get(0);
        for (int j : list) {
            if (min > j) min = j;
        }
        System.out.printf("min = %d\n", min);
    }
}
