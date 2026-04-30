package com.striver.arrays;

public class LONGEST_SUBARRY_SUMK {
        public int longestSubarray(int[] nums, int k) {
            int max=0;
            for(int i=0 ; i<nums.length ; i++){
                int c=0;
                int sum=0;
                for(int j=i ; j<nums.length ; j++){
                    sum+=nums[j];
                    c++;
                    if(sum == k ){
                        max = Math.max(max, c);                    }
//                    if( sum > k){
//                        break;
//                    }
                }
            }
            return max;
        }

    static void main() {
        LONGEST_SUBARRY_SUMK obj = new LONGEST_SUBARRY_SUMK();
        System.out.println(obj.longestSubarray( new int[]{1, 5, 3, 1, 1, 4, 7, 8, 4, 1, 1, 1, 1}, 6));
    }
}
