package com.striver.arrays;
import java.util.Arrays;
public class ROTATED_ARRAY_189 {
    //Brute force
        public void rotate(int[] nums, int k) {
            k=k%nums.length;
            int[] temp =Arrays.copyOfRange(nums , nums.length - k , nums.length);


            for (int i = nums.length - k - 1; i >= 0; i--) {
                nums[i + k] = nums[i];
            }
            for( int i = 0 ; i < k ;i++) {
                nums[i] = temp [i];
            }
            System.out.println(Arrays.toString(nums));
        }
    static void main() {
        ROTATED_ARRAY_189 r = new ROTATED_ARRAY_189();
        r.rotate( new int[]{1,2,3,4,5,6,7}, 4);
    }
}

//Optimal Approach
//class Solution {
//    public void rotate(int[] nums, int k) {
//
//        int n=nums.length;
//        k=k%n;
//        reverse(nums,0,n-1); //reverse entire array
//        reverse(nums,0,k-1); //reverse first k elements
//        reverse(nums,k,n-1); //reverse remaining array
//    }
//    private void reverse(int[] nums,int start,int end){
//        while(start<end){
//            int temp=nums[start];
//            nums[start]=nums[end];
//            nums[end]=temp;
//            start++;
//            end--;
//        }
//    }
//}