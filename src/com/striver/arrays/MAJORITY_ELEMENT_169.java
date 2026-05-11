package com.striver.arrays;

public class MAJORITY_ELEMENT_169 {
        public int majorityElement(int[] nums) {
            int candi=0 , cnt = 0 , cnt1=0;
            for(int  i = 0 ; i < nums.length; i++){
                if(cnt == 0){
                    candi = nums[i];
                    cnt = 1;
                }
                else if(candi == nums[i]){
                    cnt++;
                }
                else {
                    cnt--;
                }
            }
            for( int i = 0 ; i < nums.length ; i++){
                if( nums[i] == candi){
                    cnt1++;
                }
            }
            if( cnt1 > nums.length/2)
                return candi;

            return candi;
        }

    static void main() {
        MAJORITY_ELEMENT_169 obj = new MAJORITY_ELEMENT_169();
        System.out.println(obj.majorityElement(new int[] {1,1,0,1,2,1,0,2,3 ,2 ,3 ,4 ,4, 4, 4,}));
    }
    }

