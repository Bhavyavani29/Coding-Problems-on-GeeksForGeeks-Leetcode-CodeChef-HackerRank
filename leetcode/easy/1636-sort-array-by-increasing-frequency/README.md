# Sort Array by Increasing Frequency

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of integers `nums`, sort the array in  **increasing**  order based on the frequency of the values. If multiple values have the same frequency, sort them in  **decreasing**  order.

Return the  *sorted array*.

 

 **Example 1:** 

```
Input: nums = [1,1,2,2,2,3]
Output: [3,1,1,2,2,2]
Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.

```

 **Example 2:** 

```
Input: nums = [2,3,1,3,2]
Output: [1,3,3,2,2]
Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.

```

 **Example 3:** 

```
Input: nums = [-1,1,-6,4,5,-6,1,4,1]
Output: [5,-1,4,4,-6,-6,1,1,1]
```

 

 **Constraints:** 

- 1 <= nums.length <= 100
- -100 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 72.94%)  
**Memory:** 45.6 MB (beats 50.52%)  
**Submitted:** 2026-10-08T16:34:27.433Z  

```java
class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : nums){
            hm.put(num , hm.getOrDefault(num , 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a , b) ->{
            int fA = hm.get(a);
            int fB = hm.get(b);
            if(fA != fB){
                return fA - fB;
            }
            else{
                return b - a;
            }
        });
        for(int num : nums)
            pq.offer(num);
        int [] res = new int[nums.length];
        int  i = 0;
        while(!pq.isEmpty())
            res[i++] = pq.poll();
        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sort-array-by-increasing-frequency/)