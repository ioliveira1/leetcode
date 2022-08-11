package com.ioliveira.leetcode;

public class PalindromeNumber {

    //https://leetcode.com/problems/palindrome-number/

    public static boolean isPalindrome(int x) {
        final String xString = String.valueOf(x);
        StringBuilder builder = new StringBuilder(xString);

        return builder.reverse().toString().equals(xString);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
}
