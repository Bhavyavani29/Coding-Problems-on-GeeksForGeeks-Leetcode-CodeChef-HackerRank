# Smaller Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array  **arr[]**. For each index i, find the sum of all strictly smaller elements present in the array.

 **Examples:** 

```
Input: arr[] = [1, 2, 3]
Output: [0, 1, 3]
Explanation:
For 1, there are no elements less than 1.
For 2, only 1 is less than 2.
And for 3, 1 and 2 are less than 3, so the sum is 1 + 2.
```

```
Input: arr[] = [4, 4]
Output: [0, 0]
Explanation:
For 4, there are no elements lesser than itself. 
For 4, there are no elements lesser than itself.
There are no smaller elements than 4.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T15:51:46.768Z  

```java
class Solution {
	public ArrayList<Integer> smallerSum(int[] arr) {
		// code here
		int [] sortedArray = arr.clone();
		Arrays.sort(sortedArray);
		int prefixsum [] = new int[arr.length];
		int current = 0;
		for (int i = 0; i < sortedArray.length; i++) {
			prefixsum[i] = current;
			current += sortedArray[i];
		}
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < sortedArray.length; i++) {
			if (!hm.containsKey(sortedArray[i])) {
				hm.put(sortedArray[i], prefixsum[i]);
			}
		}
		int ans[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			ans[i] = hm.get(arr[i]);
		}
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < ans.length; i++) {
			result.add(ans[i]);
		}
		return result;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smaller-sum--170647/1)