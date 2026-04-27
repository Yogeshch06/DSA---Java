package com.striver.arrays;

import java.util.ArrayList;

public class SECONDLARGEST {
        public ArrayList<Integer> secondLargestElement(int[] nums) {
            int largest = Integer.MIN_VALUE;
            int seclargest = Integer.MIN_VALUE;
            int small = Integer.MAX_VALUE;
            int secsmall = Integer.MAX_VALUE;
            ArrayList<Integer> list = new ArrayList<>();
            for ( int i= 0 ; i < nums.length ; i++ ){
                if( nums[i] < small){
                    secsmall = small ;
                    small = nums[i];
                }
                else if (nums[i] < secsmall) { //
                    secsmall = nums[i];
                }
            }
            list.add(secsmall);
            for ( int i= 0 ; i < nums.length ; i++ ){
                if( nums[i] > largest){
                    seclargest = largest ;
                    largest = nums[i];
                }
                else if (nums[i] > seclargest) {
                    seclargest = nums[i];
                }
            }
            list.add(seclargest);
            return list;
        }

    static void main() {
        int arr[]={ 1 ,5 ,2, 8 ,7 };
        SECONDLARGEST obj = new SECONDLARGEST();
        System.out.println( obj.secondLargestElement(arr));
    }
}
