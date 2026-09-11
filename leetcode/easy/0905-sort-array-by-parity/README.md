# Sort Array By Parity

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, move all the even integers at the beginning of the array followed by all the odd integers.

Return  ***any array**  that satisfies this condition*.

 

 **Example 1:** 

```
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

```

 **Example 2:** 

```
Input: nums = [0]
Output: [0]

```

 

 **Constraints:** 

- 1 <= nums.length <= 5000
- 0 <= nums[i] <= 5000

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 46.9 MB (beats 30.72%)  
**Submitted:** 2026-09-11T15:04:13.239Z  

```java
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int i = 0, j = n-1;
        while(i < j){
            if(nums[i] % 2 == 0){
                i++;
            }
            else if(nums[j] % 2 != 0){
                j--;
            }
            else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        return nums;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sort-array-by-parity/)