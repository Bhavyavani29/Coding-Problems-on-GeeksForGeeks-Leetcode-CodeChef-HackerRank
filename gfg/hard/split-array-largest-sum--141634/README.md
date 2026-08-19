# Split Array Largest Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given an array  **arr[]**  and an integer  **k**, divide the array into  **k**  contiguous subarrays such that the  **maximum** sum among these subarrays is  **minimized**. Find this minimum possible  **maximum sum**.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4], k = 3
Output: 4
Explanation: Optimal Split is [1, 2], [3], [4]. Maximum sum of all subarrays is 4, which is minimum possible for 3 splits.

```

```
Input: arr[] = [1, 1, 2], k = 2
Output: 2
Explanation: Splitting the array as [1, 1] and [2] is optimal. This results in a maximum sum subarray of 2.
```

**Constraints:
**1 ≤ k ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T16:11:03.250Z  

```java
class Solution {
    public int splitArray(int[] arr, int k) {
        int low = 0;
        int high = 0;
        for (int num : arr) {
            low = Math.max(low, num); 
            high += num;
        }
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isFeasible(arr, k, mid)) {
                ans = mid; 
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    private boolean isFeasible(int[] arr, int k, int maxTargetSum) {
        int subarrayCount = 1;
        int currentSum = 0;
        for (int num : arr) {
            if (currentSum + num <= maxTargetSum) {
                currentSum += num;
            } else {
                subarrayCount++;
                currentSum = num;
                if (subarrayCount > k) {
                    return false;
                }
            }
        }
        return true;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/split-array-largest-sum--141634/1)