package com.striver.arrays;

import java.util.ArrayList;

public class SORTED_OR_NOT {
    static boolean isSorted(int arr[]){
        for( int i = 1 ; i < arr.length ; i++ ){
            if( arr[i] < arr[i-1] ){
                return false;
            }
        }
        return true;
    }

    static void main() {
        SORTED_OR_NOT sort = new SORTED_OR_NOT();
        System.out.println(sort.isSorted(new int[]{1 , 2 , 3 , 4 , 5}));
    }
}
