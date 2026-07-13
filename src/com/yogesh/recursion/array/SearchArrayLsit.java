package com.yogesh.recursion.array;

import java.util.ArrayList;

public class SearchArrayLsit {
    static ArrayList<Integer> FindALLIndex(int [] arr, int target , int index , ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return FindALLIndex(arr , target , index+1, list);
    }

    static void main() {
        int[] arr= {1,2,3,4,4,3,4,5};
        ArrayList<Integer> index= FindALLIndex(arr , 4, 0 ,new ArrayList<>());
        System.out.println(index);
    }
}
