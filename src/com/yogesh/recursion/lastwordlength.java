package com.yogesh.recursion;

public class lastwordlength {
    static int lengthOfLastWord(String s) {
            int len = 0;

            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) != ' ') {
                    len++;
                } else if (len > 0) {
                    break;
                }
            }
            return len;
        }

        public static void main(String[] args) {
            System.out.println(lengthOfLastWord("HEELLO  WORLD   yefsg  "));
        }
    }


