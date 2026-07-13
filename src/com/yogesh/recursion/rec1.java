package com.yogesh.recursion;

import java.util.Scanner;

public class rec1 {
    static void show(int i) {
        if (i == 5) {
            System.out.println(i);
            return;
        } else {
            System.out.println(i);
            show(i + 1);
        }
    }

    static void main() {
        show(1);
    }
}
