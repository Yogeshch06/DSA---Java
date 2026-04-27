package com.striver.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DUPLICATE_REMOVE {
    int[] duplicate(int[] arr) {
        int c=0;
        for( int  i= 1 ; i < arr.length ; i++ ) {
            if( arr[c] != arr[i]) {
                c++;
                arr[c] = arr[i];
            }
        }
        return Arrays.copyOf(arr,c+1);

    }

    static void main() {
        DUPLICATE_REMOVE dupl = new DUPLICATE_REMOVE();
        System.out.println(Arrays.toString(dupl.duplicate(new int[]{1 ,1 ,2 ,2 ,3 ,4 ,4 ,5 ,5})));
    }
}
