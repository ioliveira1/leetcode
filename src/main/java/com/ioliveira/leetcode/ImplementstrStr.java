package com.ioliveira.leetcode;

public class ImplementstrStr {

    //https://leetcode.com/problems/implement-strstr/


    public static int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", ""));
    }
}
