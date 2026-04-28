package com.striver.arrays;

import java.util.Arrays;

public class MOVE_ZEROS_283 {
    //TWO POINTER
        public void moveZeroes(int[] nums) {
            int j = -1;
            for( int i = 0 ; i < nums.length ; i++){
                if( nums[i] == 0){
                    j=i;
                    break;
                }
            }
            if( j == -1)
                return;

            for (int i = j + 1; i < nums.length; i++) {
                if (nums[i] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;
                }
            }
            System.out.println(Arrays.toString(nums));
        }

    static void main() {
        MOVE_ZEROS_283 a = new MOVE_ZEROS_283();
        a.moveZeroes(new int[]{1,0,0,4,0,6,7});
    }
    }

