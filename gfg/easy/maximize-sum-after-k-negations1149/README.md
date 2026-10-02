# Maximize Sum After k Negations

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array  **arr[]**  and an integer  **k**, perform exactly k operations on the array. In one operation, you can select any element and change its sign: Replace arr[i] with -arr[i].

The same element can be selected multiple times. Return the maximum possible sum of the array after exactly k operations.

 **Examples:** 

```
Input: arr[] = [1, 2, -3, 4, 5], k = 1
Output: 15
Explanation: Change -3 to 3. The resulting array is [1, 2, 3, 4, 5], whose sum is 15.
```

```
Input: arr[] = [5, -2, 5, -4, 5, -12, 5, 5, 5, 20], k = 5
Output: 68
Explanation: Change -12, -4, and -2 to positive values using three operations. The remaining two operations can be performed on the same element, changing its sign twice. Therefore, the maximum sum remains 68.
```

**Constraints:
**1 ≤ k ≤ 105
1 ≤ arr.size() ≤ 105
-104 ≤ arr[i] ≤ 104

The element range ensures that the maximum possible array sum fits within a 32-bit signed integer.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T16:48:23.632Z  

```java
class Solution {
    public int maximizeSum(int[] arr, int k) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 0;i < n && k > 0;i++){
            if(arr[i] < 0){
            arr[i] = -arr[i];
            k--;
            }
        }
        if(k % 2 != 0){
            Arrays.sort(arr);
            arr[0] = -arr[0];
        }
        int sum = 0;
        for(int i = 0;i < n;i++){
            sum += arr[i];
        }
        return sum;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximize-sum-after-k-negations1149/1)