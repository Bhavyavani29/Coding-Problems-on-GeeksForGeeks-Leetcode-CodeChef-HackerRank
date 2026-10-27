# Length of longest subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**, return the length of the longest subarray of non-negative integers.

 **Examples:** 

```
Input: arr[] = [2, 3, 4, -1, -2, 1, 5, 6, 3]
Output: 4
Explanation: The subarray [ 1, 5, 6, 3] has longest length 4 and contains no negative integers.
```

```
Input: arr[] = [1, 0, 0, 1, -1, -1, 0, 0, 1, 0]
Output: 4
Explanation: The subarrays [1, 0, 0, 1] and [0, 0, 1, 0] both have the maximum length 4 and contain no negative integers. Hence, the answer is 4.

```

 **Constraints:** 
1 ≤ arr.size() ≤ 106
-106 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T04:32:21.284Z  

```java
class Solution {
    public int longestSubarray(int arr[]) {
        // code here
        int currCount = 0, maxCount = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] >= 0){
                currCount++;
            }
            else{
                maxCount = Math.max(currCount, maxCount);
                currCount = 0;
            }
        }
        return Math.max(currCount, maxCount);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/length-of-longest-subarray0440/1)