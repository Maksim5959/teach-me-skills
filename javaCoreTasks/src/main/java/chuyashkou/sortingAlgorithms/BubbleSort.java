package chuyashkou.sortingAlgorithms;

public class BubbleSort {

    //19274ms, 100000el
    public static int [] bubbleSort (int [] values) {
        boolean needIteration = true;
        int tmp;

        while (needIteration){
            needIteration = false;
            for (int i = 1; i < values.length; i++) {
                if (values [i] < values [i-1]){
                    tmp = values [i - 1];
                    values [i - 1] = values [i];
                    values [i] = tmp;
                    needIteration = true;
                }
            }
        }
        return values;
    }
}
