# Check for 4 Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array  **arr[]**  and an integer  **x**, determine whether there exist four distinct elements in the array whose sum is equal to x.

Return true if such four elements exist. Otherwise, return false.

 **Examples:** 

```
Input: arr[] = [1, 5, 1, 0, 6, 0], x = 7
Output: true
Explanation: The four elements 1, 5, 1, 0 have a sum equal to 7.

```

```
Input: arr[] = [1, 2, 3, 4, 5], x = 50
Output: false
Explanation: No combination of four distinct elements has a sum equal to 50.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-12T16:07:54.011Z  

```java
class Solution {
	public boolean fourSum(int[] arr, int x) {
		// code here
		HashSet<Integer> hs = new HashSet<>();
		int n = arr.length;
		if (n < 4)
			return false;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int currSum = arr[i] + arr[j];
				int complement = x - currSum;
				if (hs.contains(complement)) {
					return true;
				}
			}
			for (int k = 0; k < i; k++) {
				hs.add(arr[k] + arr[i]);
			}
		}
		return false;
		
		/*ArrayList<Integer> al = new ArrayList<>();
		for (int num : arr) {
			al.add(num);
		}
		for (int i = 0; i < arr.length; i++) {
			int remain = x - arr[i];
			if (al.contains(remain)) {
				return true;
			}
		}
		return false; */
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/four-elements2452/1)