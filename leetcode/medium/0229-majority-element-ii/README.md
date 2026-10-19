# Majority Element II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array of size `n`, find all elements that appear more than `⌊n / 3⌋` times.

 

 **Example 1:** 

```
Input: nums = [3,2,3]
Output: [3]

```

 **Example 2:** 

```
Input: nums = [1]
Output: [1]

```

 **Example 3:** 

```
Input: nums = [1,2]
Output: [1,2]

```

 

 **Constraints:** 

- 1 <= nums.length <= 5 * 104
- -109 <= nums[i] <= 109

 

 **Follow up:**  Could you solve the problem in linear time and in `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 17 ms (beats 15.92%)  
**Memory:** 52.1 MB (beats 82.44%)  
**Submitted:** 2026-10-19T17:12:38.677Z  

```java
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> h = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int num : nums) {
            if (!h.containsKey(num))
                h.put(num, 1);
            else
                h.put(num, h.get(num) + 1);
        }
        Set<Integer> s1 = h.keySet();
        for (int x : s1) {
            if (h.get(x) > n / 3) {
                al.add(x);
            }
        }
        return al;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/majority-element-ii/)