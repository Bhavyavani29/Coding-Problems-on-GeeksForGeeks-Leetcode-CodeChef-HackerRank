# Find First and Last Position of Element in Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given `target` value.

If `target` is not found in the array, return `[-1, -1]`.

You must write an algorithm with `O(log n)` runtime complexity.

 

 **Example 1:** 

```
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

```

 **Example 2:** 

```
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

```

 **Example 3:** 

```
Input: nums = [], target = 0
Output: [-1,-1]

```

 

 **Constraints:** 

- 0 <= nums.length <= 105
- -109 <= nums[i] <= 109
- nums is a non-decreasing array.
- -109 <= target <= 109

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 48.3 MB (beats 14.26%)  
**Submitted:** 2026-09-02T08:43:31.662Z  

```java
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }
    int findFirst(int[] nums, int target){
        int l = 0, h = nums.length - 1, idx = -1;
        while(l <= h){
            int m = l + (h - l) / 2;
            if (nums[m] == target){
                idx = m;
                h = m - 1;
            } 
            else if (nums[m] < target){
                l = m + 1;
            } 
            else {
                h = m - 1;
            }
        }
        return idx;
    }
    int findLast(int[] nums, int target){
        int l = 0, h = nums.length - 1, idx = -1;
        while(l <= h){
            int m = l + (h - l) / 2;
            if(nums[m] == target){
                idx = m;
                l = m + 1;
            } 
            else if(nums[m] < target){
                l = m + 1;
            } 
            else{
                h = m - 1;
            }
        }
        return idx;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)