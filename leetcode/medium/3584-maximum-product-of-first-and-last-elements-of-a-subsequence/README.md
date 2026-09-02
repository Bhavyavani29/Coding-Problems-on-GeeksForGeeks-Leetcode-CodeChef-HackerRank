# Maximum Product of First and Last Elements of a Subsequence

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums` and an integer `m`.

Return the  **maximum**  product of the first and last elements of any  **subsequence**  of `nums` of size `m`.

 

 **Example 1:** 

 **Input:**  nums = [-1,-9,2,3,-2,-3,1], m = 1

 **Output:**  81

 **Explanation:** 

The subsequence `[-9]` has the largest product of the first and last elements: `-9 * -9 = 81`. Therefore, the answer is 81.

 **Example 2:** 

 **Input:**  nums = [1,3,-5,5,6,-4], m = 3

 **Output:**  20

 **Explanation:** 

The subsequence `[-5, 6, -4]` has the largest product of the first and last elements.

 **Example 3:** 

 **Input:**  nums = [2,-1,2,-6,5,2,-5,7], m = 2

 **Output:**  35

 **Explanation:** 

The subsequence `[5, 7]` has the largest product of the first and last elements.

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -105 <= nums[i] <= 105
- 1 <= m <= nums.length

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 73.91%)  
**Memory:** 150.4 MB (beats 78.26%)  
**Submitted:** 2026-09-02T07:02:31.680Z  

```java
class Solution {
    public long maximumProduct(int[] nums, int m) {
        long Ans = Long.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int L = 0;
        int R = m - 1;
        while(R < nums.length){
            min = Math.min(nums[L], min);
            max = Math.max(nums[L], max);
            long minProduct = 1L * nums[R] * min;
            long maxProduct = 1L * nums[R] * max;
            Ans = Math.max(Ans, Math.max(minProduct, maxProduct));
            L++;
            R++;
        }
        return Ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-product-of-first-and-last-elements-of-a-subsequence/)