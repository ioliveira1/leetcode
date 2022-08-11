package com.ioliveira.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    //https://leetcode.com/problems/valid-parentheses/

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0 || s.startsWith("}") || s.startsWith("]") || s.startsWith(")")) {
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                int unicode = c == ')' ? 1 : 2;
                if (!stack.isEmpty() && c == (int) stack.getFirst() + unicode) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("}{"));
    }
}
