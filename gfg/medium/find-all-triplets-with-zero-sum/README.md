# All Triplets with Zero Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**, find all possible triplets  **i, j, k**  in the  **arr[]**  whose sum of elements is equals to  **zero**. 
Returned triplet should also be internally sorted i.e.  **i<j<k.** 

 **Examples:** 

```
Input: arr[] = [0, -1, 2, -3, 1]
Output: [[0, 1, 4], [2, 3, 4]]
Explanation: Triplets with sum 0 are:
arr[0] + arr[1] + arr[4] = 0 + (-1) + 1 = 0
arr[2] + arr[3] + arr[4] = 2 + (-3) + 1 = 0
```

```
Input: arr[] = [1, -2, 1, 0, 5]
Output: [[0, 1, 2]]
Explanation: Only triplet which satisfies the condition is arr[0] + arr[1] + arr[2] = 1 + (-2) + 1 = 0
```

```
Input: arr[] = [2, 3, 1, 0, 5]
Output: [[]]
Explanation: There is no triplet with sum 0.
```

**Constraints:
**3 <= arr.size() <= 103
-104 <= arr[i] <= 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-08T16:47:49.598Z  

```java
class Solution {
	public List<List<Integer>> findTriplets(int[] arr) {
		// Your code here
		int n = arr.length;
		List<List<Integer>> res = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = i + 2; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0 && i < j && j < k) {
						List<Integer> al = new ArrayList<>();
						al.add(i);
						al.add(j);
						al.add(k);
						res.add(al);
					}
				}
			}
		}
		return res;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-all-triplets-with-zero-sum/1)