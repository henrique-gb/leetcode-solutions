package com.techmisal.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // O(n) complexity with O(n) auxiliary space
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            // If difference is seen before, return the pair
            if(map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            }

            // Store index of current element in the map
            map.put(nums[i], i);
        }

        return result;
    }
}