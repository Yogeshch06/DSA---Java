package com.yogesh.recursion.pattern;

public class triangle1 {
    public static void main() {
        triangle(4,0);
    }
    static void triangle(int r, int c){
        if(r==0)
            return;
        if(c<r){
            System.out.print("*");
            triangle(r,c+1);
        }
        else{
            System.out.println();
            triangle(r-1,0);
        }
    }
}
