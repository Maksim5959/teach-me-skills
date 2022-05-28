package com.chuyashkou.collections.examclouds_tasks.comparators;

import com.chuyashkou.collections.examclouds_tasks.box.HeavyBox;

import java.util.Comparator;

public class CompareToHeavyBoxByWidth implements Comparator <HeavyBox> {

    @Override
    public int compare(HeavyBox o1, HeavyBox o2) {
        return Double.compare(o1.getWidth(),o2.getWidth());
    }
}
