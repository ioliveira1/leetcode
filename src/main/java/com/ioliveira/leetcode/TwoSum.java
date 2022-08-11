package com.ioliveira.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {

    //https://leetcode.com/problems/two-sum/

    public static int[] twoSum(int[] nums, int target) {
        List<Integer> differences = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            final int diff = target - nums[i];
            if (differences.contains(diff)) {
                return new int[]{differences.indexOf(target - nums[i]), i};
            } else {
                differences.add(nums[i]);
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
