# Distinct Sorted

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[],**  return all distinct elements of the array in sorted (non-decreasing) order.

 **Examples:** 

```
Input: arr[] = [3, 3, 2, 2, 1, 4]
Output: 1 2 3 4
Explanation: All distinct in sorted order.
```

```
Input: arr[] = [12, 23, 12, 23, 2]
Output: 2 12 23
Explanation: All distinct in sorted order.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T16:36:14.653Z  

```java
class Solution {
	public ArrayList<Integer> uniqueSorted(int arr[]) {
		// code here
		ArrayList<Integer>list = new ArrayList<>();
		Arrays.sort(arr);
		int res = arr[0];
		for (int i = 1; i<arr.length; i++) {
			if (arr[i] == arr[i - 1])
				{
				continue;
			} 
			else {
				list.add(res);
				res = arr[i];
			}
		}
		list.add(res);
		return list;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/distinct-sorted--124713/1)