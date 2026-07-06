package com.striver.arrays;
import java.util.Arrays;
public class LONGEST_CONSECUTIVE_SEQUENCE_128 {
    public int longestConsecutive(int[] nums){
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int max = 1;
        int c = 1;

        for (int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i - 1] + 1) {
                c++;
            } else if (nums[i] != nums[i - 1]){
                c = 1;
            }
            max = Math.max(max, c);
        }
        return max;
    }

    static void main() {
        LONGEST_CONSECUTIVE_SEQUENCE_128 s = new LONGEST_CONSECUTIVE_SEQUENCE_128();
        System.out.println(s.longestConsecutive(new int[]{100,54,3,2,1,4,101,102,103}));
    }
}
