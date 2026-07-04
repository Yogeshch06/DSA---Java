package com.striver.arrays;

import java.util.Arrays;

public class REARRANGE_BY_SIGN_2149 {
    public int[] rearrangeArray(int[] nums){
        int posi=0;
        int posn=1;
        int arr[]= new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                arr[posi]= nums[i];
                posi +=2;
            }
            if(nums[i] < 0){
                arr[posn]= nums[i];
                posn +=2;
            }
        }
        return arr;
    }

    static void main() {
        REARRANGE_BY_SIGN_2149 s = new REARRANGE_BY_SIGN_2149();
        System.out.println(Arrays.toString(s.rearrangeArray(new int[]{1,2,3,5,-6,-7,-8,-9})));
    }
}
