# Find All Duplicates in an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` of length `n` where all the integers of `nums` are in the range `[1, n]` and each integer appears  **at most**   **twice**, return  *an array of all the integers that appears  **twice***.

You must write an algorithm that runs in `O(n)` time and uses only  *constant*  auxiliary space, excluding the space needed to store the output

 

 **Example 1:** 

```
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]

```

 **Example 2:** 

```
Input: nums = [1,1,2]
Output: [1]

```

 **Example 3:** 

```
Input: nums = [1]
Output: []

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 105
- 1 <= nums[i] <= n
- Each element in nums appears once or twice.

## Solution

**Language:** Java  
**Runtime:** 33 ms (beats 8.86%)  
**Memory:** 71.8 MB (beats 28.82%)  
**Submitted:** 2026-10-21T17:23:07.188Z  

```java
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num:nums)
        {
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        Set<Integer> s1=hm.keySet();
        ArrayList<Integer> al=new ArrayList<>();
        for(int x:s1)
        {
            if(hm.get(x)==2)
            {
                al.add(x);
            }
        }
        return al;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-all-duplicates-in-an-array/)