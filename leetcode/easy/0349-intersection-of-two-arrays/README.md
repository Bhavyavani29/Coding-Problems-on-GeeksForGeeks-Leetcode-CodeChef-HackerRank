# Intersection of Two Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two integer arrays `nums1` and `nums2`, return  *an array of their intersection*. Each element in the result must be  **unique**  and you may return the result in  **any order**.

 

 **Example 1:** 

```
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

```

 **Example 2:** 

```
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

```

 

 **Constraints:** 

- 1 <= nums1.length, nums2.length <= 1000
- 0 <= nums1[i], nums2[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 97.36%)  
**Memory:** 45 MB (beats 40.50%)  
**Submitted:** 2026-09-06T16:32:11.004Z  

```java
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums1.length;i++){
            hs.add(nums1[i]);
        }
        HashSet<Integer> intersection = new HashSet<>();
        for(int i = 0;i < nums2.length;i++){
            if(hs.contains(nums2[i])){
                intersection.add(nums2[i]);
            }
        }
        int[] result = new int[intersection.size()];
        int index = 0;
        for (int num : intersection) {
            result[index++] = num;
        }
        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/intersection-of-two-arrays/)