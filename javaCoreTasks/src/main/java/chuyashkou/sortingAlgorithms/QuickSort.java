package chuyashkou.sortingAlgorithms;

public class QuickSort {

    //24ms, 100000el
    //7192ms, 100000000el
    public static int[] quickSort(int[] values, int lowIndex, int highIndex) {
        int left = lowIndex;
        int right = highIndex;
        int pivot = values[(left + right) / 2];

        do {
            while (values[left] < pivot) {
                left++;
            }
            while (values[right] > pivot) {
                right--;
            }

            if (left <= right) {
                int tmp = values[left];
                values[left] = values[right];
                values[right] = tmp;
                left++;
                right--;
            }
        } while (left < right);
        if (lowIndex < right) {
            quickSort(values, lowIndex, right);
        }
        if (left < highIndex) {
            quickSort(values, left, highIndex);
        }
        return values;
    }
}
