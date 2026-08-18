# First and Last in Sorted

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a sorted array  **arr[]**  with possibly some duplicates, find the first and last occurrences of an element  **x**  in the given array.
 **Note:**  If the number  **x**  is not found in the array then return both the indices as -1.

 **Examples:** 

```
Input: arr[] = [1, 3, 5, 5, 5, 5, 67, 123, 125], x = 5
Output: [2, 5]
Explanation: First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5

```

```
Input: arr[] = [1, 3, 5, 5, 5, 5, 7, 123, 125], x = 7
Output: [6, 6]
Explanation: First and last occurrence of 7 is at index 6

```

```
Input: arr[] = [1, 2, 3], x = 4
Output: [-1, -1]
Explanation: No occurrence of 4 in the array, so, output is [-1, -1]
```

**Constraints:
**1 ≤ arr.size() ≤ 106
1 ≤ arr[i], x ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T16:22:07.505Z  

```java
class Solution {
	ArrayList<Integer> find(int arr[], int x) {
		// code here
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(findFirst(arr, x));
		list.add(findLast(arr, x));
		return list;
	}
	private int findFirst(int[] arr, int x) {
		int low = 0, high = arr.length - 1;
		int firstIdx = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == x) {
				firstIdx = mid;
				high = mid - 1;
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return firstIdx;
	}
	private int findLast(int[] arr, int x) {
		int low = 0, high = arr.length - 1;
		int lastIdx = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == x) {
				lastIdx = mid;
				low = mid + 1;
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return lastIdx;
	}
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1)