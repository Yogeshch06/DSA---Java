package com.yogesh.recursion;

//factorial using int func

//public class factorial {
//    static int fact(int n){
//        if(n == 0)
//            return 1;
//        return (n* fact(n-1));
//    }
//
//    static void main() {
//        int n=6;
//        System.out.println(fact(n));
//    }
//}


// factorial using void function
public class factorial {
    static int f=1;
    static void fact(int n){

        if(n == 0)
            return;
        f = f*n ;
        fact(n-1);
    }

    static void main() {
        int n=6;
        fact(n);
        System.out.println(f);
    }
}