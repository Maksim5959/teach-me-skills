package chuyashkou.collections.examcloudsTasks.box;

import java.util.Objects;

public class HeavyBox extends Box implements Comparable <HeavyBox>{

    private double weight;

    public HeavyBox() {
    }

    public HeavyBox(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HeavyBox heavyBox = (HeavyBox) o;
        return Double.compare(heavyBox.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }

    @Override
    public String toString() {
        return super.toString() + "HeavyBox{" +
                "weight=" + weight +
                "kg" + '}';
    }

    @Override
    public int compareTo(HeavyBox heavyBox) {
        int result;
        result = Double.compare(getWeight(),heavyBox.getWeight());
        if (result != 0) return result;
        result = Double.compare(getHeight(),heavyBox.getHeight());
        if (result != 0) return result;
        result = Double.compare(getWidth(),heavyBox.getWidth());
        if (result != 0) return result;
        result = Double.compare(this.weight,heavyBox.getWeight());
        return result;
    }
}
