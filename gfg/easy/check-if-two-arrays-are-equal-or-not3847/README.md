# Check Equal Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two arrays  **a[]**  and  **b[]** of equal size, the task is to find whether the elements in the arrays are equal.
Two arrays are said to be equal if both contain the same set of elements, arrangements (or permutations) of elements may be different though.
 **Note:**  If there are repetitions, then counts of repeated elements must also be the same for two arrays to be equal.

 **Examples:** 

```
Input: a[] = [1, 2, 5, 4, 0], b[] = [2, 4, 5, 0, 1]
Output: true
Explanation: Both the array can be rearranged to [0,1,2,4,5]

```

```
Input: a[] = [1, 2, 5], b[] = [2, 4, 15]
Output: false
Explanation: a[] and b[] have only one common value.
```

 **Constraints:** 
1 ≤ a.size(), b.size() ≤ 107
0 ≤ a[i], b[i] ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T15:13:14.861Z  

```java
class Solution {
	public static boolean checkEqual(int[] a, int[] b) {
		// code here
		if (a.length != b.length)
			return false;
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				return false;
		}
		return true;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1)