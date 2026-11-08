# Check if Array is Max Heap

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**, determine whether it represents the  **level-order**  traversal of a valid max heap. Return  **true**  if it does; otherwise, return  **false**.

 **Examples :** 

```
Input: arr[] = [90, 15, 10, 7, 12, 2]
Output: true
Explanation: The given array represents the following tree. Each parent node is greater than or equal to its children, so the max-heap property holds.
 
```

```
Input: arr[] = [9, 15, 10, 7, 12, 11]
Output: false
Explanation: The given array represents the following tree. It does not satisfy the max-heap property, as 9 is smaller than 15 and 10, and 10 is smaller than 11.
 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-08T15:32:34.286Z  

```java
class Solution {
	public boolean isMaxHeap(int[] arr) {
		// code here
		int n = arr.length;
		for (int i = 0; i < n / 2; i++) {
			int left = 2 * i + 1;
			int right = 2 * i + 2;
			if (left < n && arr[i] < arr[left]) {
				return false;
			}
			if (right < n && arr[i] < arr[right]) {
				return false;
			}
		}
		return true;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/does-array-represent-heap4345/1)