package com.yogesh.recursion;

public class countzeros {
    static int count(int n){
        return helper( n , 0);
    }
    static int helper(int n , int c){
        if(n == 0) {
            return c;
        }
        int rem = n%10;
        if(rem == 0) {
            return helper(n / 10, c + 1);
        }
        return helper(n/10 , c);
    }

    static void main() {
        System.out.println(count(3002103));
    }
}
