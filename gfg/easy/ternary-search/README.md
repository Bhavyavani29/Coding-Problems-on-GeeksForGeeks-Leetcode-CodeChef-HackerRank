# Minimum in Decreasing Increasing Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  that  **strictly decreases**  and then  **strictly increases**, the array is said to be V-shaped or unimodal. Find the  **index** of the  **minimum**  element present in the array.

 **Examples:** 

```
Input: arr[] = [9, 7, 5, 2, 4, 6, 10]
Output: 3
Explanation: The minimum of the given array is 2, which is at index 3.
```

```
Input: arr[] = [10, 8, 6, 5, 2, 12, 14]
Output: 4
Explanation: The minimum of the given array is 2, which is at index 4.
```

 **Constraint:** 
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T16:27:01.278Z  

```java
class Solution {
    public int findMinIndex(int[] arr) {
        // code here
        int n = arr.length;
        int l = 0,h = n - 1;
		while(l < h){
			int m1 = l + (h-l) / 3;
			int m2 = h - (h-l) / 3;
			if(arr[m2] > arr[m1]){
			    h = m2 - 1;
			} 
			else{
			    l = m1 + 1;
			}
		}
		return l;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/ternary-search/1)