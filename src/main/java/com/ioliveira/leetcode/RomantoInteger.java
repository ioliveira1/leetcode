package com.ioliveira.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {

    //https://leetcode.com/problems/roman-to-integer/

    public static int romanToInt(String s) {
        char[] arr = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (map.get(arr[i + 1]) <= map.get(arr[i])) {
                sum += map.get(arr[i]);
            } else
                sum -= map.get(arr[i]);
        }

        return sum + map.get(arr[s.length() - 1]);
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("XI"));
    }
}
