package com.striver.arrays;

public class MAX_CONSECUTIVE_485 {

        public int findMaxConsecutiveOnes(int[] nums) {
            int c=0,max=0;
            for(int i=0; i<nums.length; i++){
                if(nums[i] == 1){
                    c++;
                    max=Math.max(max,c);
                }
                else{
                    c=0;
                }
            }
            return max;
        }

    static void main() {
            MAX_CONSECUTIVE_485 a = new MAX_CONSECUTIVE_485();
        System.out.println(a.findMaxConsecutiveOnes(new int[]{1,0,1,0,1,1,1}));
    }

}
