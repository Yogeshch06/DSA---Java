package com.yogesh.recursion;

public class ProductofDigits {
    static int pod(int n){
        if( n % 10 == n){
            return n;
        }
        return n%10 * pod(n/10);
    }

    static void main() {
        int n=134;
        System.out.println("Product of digits is ="+ pod(n));
    }
}
