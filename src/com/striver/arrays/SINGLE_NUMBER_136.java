package com.striver.arrays;

public class SINGLE_NUMBER_136 {

        public int singleNumber(int[] nums) {
            int xorr=0;
            for( int i = 0 ; i < nums.length ; i++){
                xorr ^= nums[i];
            }
            return xorr;
        }

    static void main() {
        SINGLE_NUMBER_136 obj = new SINGLE_NUMBER_136();
        System.out.println(obj.singleNumber(new int[]{1,1,3,4,4,5,5}));
    }
}
