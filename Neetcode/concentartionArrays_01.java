// package Neetcode;

import java.util.Arrays;

// # Concatenation of Array

//  ---You are given an integer array nums of length n.
// Create an array ans of length 2n where ans[i] == nums[i] and 
//  ans[i + n] == nums[i] for 0 <= i < n (0-indexed)---

// Specifically, ans is the concatenation of two nums arrays.
// Return the array ans.

// # Example 1:
// Input: nums = [1,4,1,2]
// Output: [1,4,1,2,1,4,1,2]

// # Example 2:
// Input: nums = [22,21,20,1]
// Output: [22,21,20,1,22,21,20,1]


public class concentartionArrays_01 {
        public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 4, 1, 2};   // Input

        int[] result = getConcatenation(nums);

        System.out.println(Arrays.toString(result));
}
}