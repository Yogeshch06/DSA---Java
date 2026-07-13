package com.striver.arrays;
import java.util.Arrays;
import java.util.HashSet;

public class LONGEST_CONSECUTIVE_SEQUENCE_128 {

    // Better soln
            public int longestConsecutive(int[] nums){
//        if (nums.length == 0) return 0;
//
//        Arrays.sort(nums);
//
//        int max = 1;
//        int c = 1;
//
//        for (int i = 1; i < nums.length; i++){
//            if (nums[i] == nums[i - 1] + 1) {
//                c++;
//            } else if (nums[i] != nums[i - 1]){
//                c = 1;
//            }
//            max = Math.max(max, c);
//        }
//        return max;
//    }

    // Optimal soln
    HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
        set.add(num);
    }
    int longest = 0;
        for (int num : set) {
        if (!set.contains(num - 1)) {
            int currentNum = num;
            int count = 1;

            while (set.contains(currentNum + 1)) {
                currentNum++;
                count++;
            }
            longest = Math.max(longest, count);
        }
    }
        return longest;
}

    static void main() {
        LONGEST_CONSECUTIVE_SEQUENCE_128 s = new LONGEST_CONSECUTIVE_SEQUENCE_128();
        System.out.println(s.longestConsecutive(new int[]{100,54,3,2,1,4,101,102,103}));
    }
}
