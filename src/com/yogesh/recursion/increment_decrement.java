package com.yogesh.recursion;

public class increment_decrement {
//    static int postinc(int n){
//        if(n==5){
//            System.out.println(n);
//            return n ;
//        }
//        System.out.println(n);
//        return postinc(n++);
//    }
    static int preinc(int n){
        if(n==5){
            return n;
        }
        System.out.println(n);
        return preinc(++n);
    }


    static void main() {
        int n=1;
        // System.out.println(postinc(n));
        System.out.println(preinc(n));


    }
}
