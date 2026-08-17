# Maximum Index

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  of positive integers, return the maximum difference between two indices  **j**  and  **i** (i.e.,  **j - i**) such that  **arr[i] ≤ arr[j]** and  **i**  **≤**   **j**.

 **Examples:** 

```
Input: arr[] = [1, 10]
Output: 1
Explanation: arr[0] ≤ arr[1] so (j-i) is 1-0 = 1.

```

```
Input: arr[] = [5, 4, 3]
Output: 0
Explanation: There is no pair that satisfies the given condition.
```

```
Input: arr[] = [34, 8, 10, 3, 2, 80, 30, 33, 1]
Output: 6
Explanation: In the given array arr[1] < arr[7] satisfying the required condition(arr[i] ≤ arr[j]) thus giving the maximum difference of j - i which is 6(7-1).

```

 **Constraints:** 
1 ≤ arr.size ≤ 105
0 ≤ arr[i] ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T16:20:29.665Z  

```java
class Solution {
	int maxIndexDiff(int[] arr) {
		// code here
		int n = arr.length;
		int[] leftMin = new int[n];
		int[] rightMax = new int[n];
		leftMin[0] = arr[0];
		for (int i = 1; i < n; i++)
			leftMin[i] = Math.min(leftMin[i - 1], arr[i]);
		rightMax[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--)
			rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
		int i = 0, j = 0, ans = 0;
		while (i < n && j < n) {
			if (leftMin[i] <= rightMax[j]) {
				ans = Math.max(ans, j - i);
				j++;
			}
			else {
				i++;
			}
		}
		
		return ans;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-index-1587115620/1)