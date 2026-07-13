package com.yogesh.recursion.array;
import java.util.Arrays;
public class bubbleSort {
    static void bubble(int arr[], int r,int c){
        if(r==0){
            return;
        }
        if(c< r){
            if(arr[c] > arr[c+1]){
                int temp=arr[c];
                arr[c]= arr[c+1];
                arr[c+1]=temp;
            }
            bubble(arr,r,c+1);
        }
        else{
            bubble(arr, r-1, 0);
        }
    }

    static void main() {
        int [] a={4,3,1 ,2};
        bubble(a , a.length - 1, 0);
        System.out.println(Arrays.toString(a));
    }
}
