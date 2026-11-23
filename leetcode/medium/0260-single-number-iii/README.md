# Single Number III

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums`, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in  **any order**.

You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

 

Original
Java
 **Example 1:** 

```
Input: nums = [1,2,1,3,2,5]
Output: [3,5]
Explanation:  [5, 3] is also a valid answer.

```

 **Example 2:** 

```
Input: nums = [-1,0]
Output: [-1,0]

```

 **Example 3:** 

```
Input: nums = [0,1]
Output: [1,0]

```

 

 **Constraints:** 

- 2 <= nums.length <= 3 * 104
- -231 <= nums[i] <= 231 - 1
- Each integer in nums will appear twice, only two integers will appear once.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 36.57%)  
**Memory:** 47.4 MB (beats 88.55%)  
**Submitted:** 2026-11-23T15:01:36.133Z  

```java
class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int n : nums){
            if(!hs.add(n)){
                hs.remove(n);
            }
        }
        int[] res = new int[2];
        int i = 0;
        for(int n : hs){
            res[i++] = n;
        }
        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/single-number-iii/)