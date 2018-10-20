package com.techmisal.easy;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    private TwoSum twoSum = new TwoSum();

    @Test
    public void example1() {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[] {0, 1};
        Assert.assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    public void example2() {
        int[] nums = new int[] {3, 2, 7, 1, 5};
        int target = 12;
        int[] expected = new int[] {2, 4};
        Assert.assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }
}