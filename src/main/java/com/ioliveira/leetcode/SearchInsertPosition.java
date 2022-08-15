package com.ioliveira.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchInsertPosition {

    //https://leetcode.com/problems/search-insert-position/


    public static int searchInsert(int[] nums, int target) {

        final List<Integer> integers = Arrays.stream(nums).boxed().toList();

        final int position = Collections.binarySearch(integers, target);

        return position >= 0 ? position : Math.abs(position + 1);
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 6));
    }
}
