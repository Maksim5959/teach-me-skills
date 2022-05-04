package chuyashkou.collections.examcloudsTasks.comparators;

import chuyashkou.collections.examcloudsTasks.box.HeavyBox;

import java.util.Comparator;

public class CompareToHeavyBoxByWeight implements Comparator <HeavyBox> {

    @Override
    public int compare(HeavyBox o1, HeavyBox o2) {
        return Double.compare(o1.getWeight(), o2.getWeight());
    }
}
