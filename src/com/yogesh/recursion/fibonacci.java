package com.yogesh.recursion;

public class fibonacci {
    static int fibo(int n){
        if(n < 2)
            return n;
        return fibo(n-1)+fibo(n-2);
    }

    static void main() {
        int a=fibo(5);
        System.out.println(a);
    }
}
