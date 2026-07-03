package com.striver.arrays;

public class MAXIMUM_SUBARRAY_53 {
        public int longestSubarray(int[] nums) {

            // Brute Force
            //int i, j, k, sum=0, max=Integer.MIN_VALUE;
//                    int n = nums.length;
//                    for(i = 0; i < n; i++){
//                        for( j = i; j< n; j++ ){
//                            for( k = i; k <= j; k++){
//                                sum=sum+nums[k];
//                            }
//                            max=Math.max(max, sum);
//                            sum=0;
//                        }
//                    }

            // Better Approach
//            for(i =0; i < nums.length; i++){
//                sum=0;
//                for(j=i ; j< nums.length; j++){
//                    sum = sum + nums[j];
//                    if(sum > max)
//                        max = sum;
//                }
//            }

            // Optimal Aprroach (Kadane's Algorithm)
            int i, sum = 0, max = Integer.MIN_VALUE;
            for (i = 0; i < nums.length; i++) {
                sum = sum + nums[i];
                if (max < sum) {
                    max = sum;
                }
                if (sum < 0)
                    sum = 0;

            }
            return max;
        }
    static void main() {
        MAXIMUM_SUBARRAY_53 obj = new MAXIMUM_SUBARRAY_53();
        System.out.println(obj.longestSubarray( new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
