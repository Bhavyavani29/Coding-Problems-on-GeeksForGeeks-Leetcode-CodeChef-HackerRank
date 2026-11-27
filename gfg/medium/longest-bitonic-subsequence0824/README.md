# Longest Bitonic Subsequence

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of positive integers. Find the maximum length of Bitonic subsequence.  A subsequence of array is called Bitonic if it is first strictly increasing, then strictly decreasing. Return the maximum length of bitonic subsequence.
 
 **Note**  : A strictly increasing or a  **strictly**  decreasing sequence should not be considered as a bitonic sequence

 **Examples :** 

```
Input: n = 5, nums[] = [1, 2, 5, 3, 2]
Output: 5
Explanation: The sequence [1, 2, 5] is increasing and the sequence [3, 2] is decreasing so merging both we will get length 5.

```

```
Input: n = 8, nums[] = [1, 11, 2, 10, 4, 5, 2, 1]
Output: 6
Explanation: The bitonic sequence [1, 2, 10, 4, 2, 1] has length 6.
```

```
Input: n = 3, nums[] = [10, 20, 30]
Output: 0
Explanation: The decreasing or increasing part cannot be empty.
```

```
Input: n = 3, nums[] = [10, 10, 10]
Output: 0
Explanation: No strictly increasing or decreasing sequence exists.

```

 **Constraints:** 
1 ≤ length of array ≤ 103
1 ≤ arr[i] ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T08:29:38.903Z  

```java
class Solution {
  public static int longestBitonicSequence(int n, int[] nums) {
    // code here
    int[] dp1 = new int[n];
    int[] dp2 = new int[n];
    int max = 0;
    for (int i = 0; i < n; i++) {
      dp1[i] = 1;
      for (int prev = 0; prev < i; prev++)
        if (nums[i] > nums[prev])
          dp1[i] = Math.max(1 + dp1[prev], dp1[i]);
    }
    for (int i = n - 1; i >= 0; i--) {
      dp2[i] = 1;
      for (int prev = n - 1; prev >= i; prev--)
        if (nums[i] > nums[prev])
          dp2[i] = Math.max(dp2[i], 1 + dp2[prev]);
    }
    for (int i = 0; i < n; i++)
      if (dp1[i] > 1 && dp2[i] > 1)
        max = Math.max(max, dp1[i] + dp2[i] - 1);
    return max;
  }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/longest-bitonic-subsequence0824/1)