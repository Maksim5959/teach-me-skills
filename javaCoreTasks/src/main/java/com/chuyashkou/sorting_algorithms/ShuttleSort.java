package com.chuyashkou.sorting_algorithms;

public class ShuttleSort {

    //1629ms, 100000el
    public static int [] shuttleSort (int [] values) {
        int tmp;
        for (int i = 1; i < values.length; i++) {
            if (values [i] < values [i-1]) {
                tmp = values [i];
                values [i] = values [i-1];
                values [i-1] = tmp;
                for (int j = i-1; j-1 >=0; j--) {
                    if (values [j] < values [j-1]){
                        tmp = values [j];
                        values [j] = values [j-1];
                        values [j-1] = tmp;
                    }else {
                        break;
                    }
                }
            }
        }
        return values;
    }
}
