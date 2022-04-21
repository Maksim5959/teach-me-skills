package chuyashkou.sortingAlgorithms;

public class ShellSort {

    //8372ms, 100000el
    public static int[] shellSort(int[] values) {
        int gap = (values.length - 1) / 2;

        while (gap >= 1) {
            for (int i = 0; i < values.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (values[j] > values[j + gap]) {
                        int tmp = values[j];
                        values[j] = values[j + gap];
                        values[j + gap] = tmp;
                    }
                }
            }
            gap /= 2;
        }
        return values;
    }
}
