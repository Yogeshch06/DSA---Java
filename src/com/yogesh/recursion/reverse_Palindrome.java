package com.yogesh.recursion;

public class reverse_Palindrome {
    static int rev=0;

    // 1st way to solve revserse
    static void Reverse1(int n){
        if(n==0){
            return;
        }
        rev= rev*10 + n%10;
        Reverse1(n / 10);
    }

    //2nd way to solve reverse
    static int Reverse2(int n) {
        int digits = (int) Math.log10(n) +1;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if (n % 10 == n ) {
            return n;
        }
        int lastDigit = n % 10;
        return lastDigit * (int) Math.pow(10, digits -1) + helper(n / 10, digits - 1);
    }


    //Palindrome check
    static boolean pal(int n){
        if( n == Reverse2(n) ){
            return true;
        }
        return false;
    }

    static void main() {
        int n=3167;
        Reverse1(n);
        System.out.println(rev);
        System.out.println(Reverse2(n));
        System.out.println("Palindrome:"+pal(n));

    }
}
