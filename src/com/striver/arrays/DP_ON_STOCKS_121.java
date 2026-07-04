package com.striver.arrays;

public class DP_ON_STOCKS_121 {
    int maxProfit(int[] prices) {

        //Brute force
//        int max = 0;
//        int cost = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                cost = prices[j] - prices[i];
//                if (max < cost)
//                    max = cost;
//                cost = 0;
//            }
//        }
        int min=prices[0];
        int profit=0;
        int cost=0;
        for(int i =1; i < prices.length; i++){
            cost= prices[i] - min;
            profit = Math.max(cost, profit);
            min= Math.min(min,prices[i]);
        }
        return profit;
    }

    static void main() {
        DP_ON_STOCKS_121 s = new DP_ON_STOCKS_121();
        System.out.println(s.maxProfit(new int[]{10, 9, 8, 1, 5, 4, 9, 10,11,9,4,8,15}));
    }
}
