package com.striver.arrays;

import java.util.Arrays;

public class TWO_SUM_1 {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[] { i, j };
                    }
                }
            }
            return new int[] {};
        }

    static void main() {
        TWO_SUM_1 obj = new TWO_SUM_1();
        System.out.println(Arrays.toString(obj.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
