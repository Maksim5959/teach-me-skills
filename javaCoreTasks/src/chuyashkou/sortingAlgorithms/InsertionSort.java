package chuyashkou.sortingAlgorithms;

public class InsertionSort {

    //720ms, 100000el
    public static int[] insertionSort(int[] values) {
        for (int i = 1; i < values.length; i++) {
            int currentValue = values[i];
            int j = i - 1;
            for (; j >= 0 && currentValue <= values[j]; j--) {
                values[j + 1] = values[j];
            }
            values[j + 1] = currentValue;
        }
        return values;
    }

    //time = 3655ms, 100000el - binarySearchByRecursiveImplementation
    //time = 3802ms, 100000el - binarySearchByIterativeImplementation
    //time = 3660ms, 100000el - Arrays.binarySearch
    //time = 688ms, 100000el - System.arrayCopy + binarySearchByRecursiveImplementation
    //time = 763ms, 100000el - System.arrayCopy + binarySearchByIterativeImplementation
    //time = 725ms, 100000el - System.arrayCopy + Arrays.binarySearch
    public static int[] binaryInsertionSort(int[] values) {
        for (int i = 1; i < values.length; i++) {
            int currentValue = values[i];
            int j = i - 1;

//            int index = Math.abs(Arrays.binarySearch(values, 0,i, currentValue) + 1);
            int index = binarySearchByRecursiveImplementation(values, currentValue,0, j);
//            int index = binarySearchByIterativeImplementation(values, currentValue, j);

            /*if (currentValue <= values[index]) {
                for (; j >= index; j--) {
                    values[j + 1] = values[j];
                }
            }
            values[j + 1] = currentValue;*/

            if (currentValue <= values[index]){
                System.arraycopy(values,index,values,index+1,i-index);
                values [index] = currentValue;
            }
        }
        return values;
    }

    private static int binarySearchByRecursiveImplementation(int[] sortedArray, int value, int lowIndex, int highIndex) {
        int middleIndex = lowIndex + (highIndex - lowIndex) / 2;

        if (middleIndex == lowIndex && sortedArray[lowIndex] > value) {
            return lowIndex;
        } else if (middleIndex == lowIndex) {
            return highIndex;
        }

        if (value > sortedArray[middleIndex]) {
            return binarySearchByRecursiveImplementation(sortedArray, value, middleIndex, highIndex);
        } else if (value < sortedArray[middleIndex]) {
            return binarySearchByRecursiveImplementation(sortedArray, value, lowIndex, middleIndex);
        }
        return middleIndex;
    }

    private static int binarySearchByIterativeImplementation(int[] sortedArray, int value, int highIndex) {
        int left = 0, right = highIndex, middle = 0;

        while (left < right) {
            middle = left + (right - left) / 2;

            if (middle == left && sortedArray[left] > value) {
                return left;
            } else if (middle == left) {
                return right;
            }

            if (sortedArray[middle] < value) {
                left = middle;
            } else {
                right = middle;
            }
        }
        return middle;
    }
}
