package com.yogesh.recursion;

public class SumofDigits {
    static int sod(int n){
        if(n==0){
            return 0;
        }
        int r=n%10;
        return (r + sod(n/10) );
    }

    static void main() {
        int n=1111111111;
        System.out.println("SumofDigits is ="+sod(n));
    }
}
