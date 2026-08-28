# Valid Elements in an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums`.

An element `nums[i]` is considered  **valid**  if it satisfies  **at least**  one of the following conditions:

- It is strictly greater than every element to its left.
- It is strictly greater than every element to its right.

The first and last elements are always valid.

Return an array of all valid elements in the same order as they appear in `nums`.

 

 **Example 1:** 

 **Input:**  nums = [1,2,4,2,3,2]

 **Output:**  [1,2,4,3,2]

 **Explanation:** 

- nums[0] and nums[5] are always valid.
- nums[1] and nums[2] are strictly greater than every element to their left.
- nums[4] is strictly greater than every element to its right.
- Thus, the answer is [1, 2, 4, 3, 2].

 **Example 2:** 

 **Input:**  nums = [5,5,5,5]

 **Output:**  [5,5]

 **Explanation:** 

- The first and last elements are always valid.
- No other elements are strictly greater than all elements to their left or to their right.
- Thus, the answer is [5, 5].

 **Example 3:** 

 **Input:**  nums = [1]

 **Output:**  [1]

 **Explanation:** 

Since there is only one element, it is always valid. Thus, the answer is `[1]`.

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 1 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 46.7 MB (beats 46.56%)  
**Submitted:** 2026-08-28T17:01:11.802Z  

```java
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        if (n == 0) {
            return result;
        }
        if (n <= 2) {
            for (int num : nums) {
                result.add(num);
            }
            return result;
        }
        int[] maxRight = new int[n];
        int currentMaxRight = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            maxRight[i] = currentMaxRight;
            currentMaxRight = Math.max(currentMaxRight, nums[i]);
        }
        result.add(nums[0]);
        int maxLeft = nums[0];
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] > maxLeft || nums[i] > maxRight[i]) {
                result.add(nums[i]);
            }
            maxLeft = Math.max(maxLeft, nums[i]);
        }
        result.add(nums[n - 1]);
        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-elements-in-an-array/)