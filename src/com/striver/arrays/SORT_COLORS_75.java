package com.striver.arrays;

import java.util.Arrays;

public class SORT_COLORS_75 {
        public void sortColors(int[] nums) {
            //    for( int i = 0 ; i < nums.length - 1 ; i++) {
            //         for( int j = 0 ; j < nums.length - i - 1 ; j++){
            //            if(nums[j] > nums[j+1]){
            //                int temp = nums[j];
            //                nums[j] = nums[j+1];
            //              nums[j+1] = temp;
            //           }
            //        }
            //    }
            int temp=0;
            int mid = 0 , low = 0 ,high = nums.length-1;
            while ( mid <= high){
                if( nums[mid] == 0){
                    temp = nums[mid];
                    nums[mid] = nums[low];
                    nums[low] = temp;

                    mid++;
                    low++;
                }
                else if( nums[mid] == 2){
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] =temp;

                    //   mid++; because when swapped with the right side element it can be 0 if the mid point goes fwd the 0 stay in that pos
                    high--;
                }
                else{
                    mid++;
                }
            }
            System.out.println(Arrays.toString(nums));
            return;
        }

    static void main() {
            SORT_COLORS_75 obj = new SORT_COLORS_75();
        obj.sortColors(new int[] {1,1,0,1,2,1,0,2});
    }
    }
