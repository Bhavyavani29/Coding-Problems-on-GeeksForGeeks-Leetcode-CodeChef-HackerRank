# Sort Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a square matrix   mat[][] , sort all the elements of the matrix in non-decreasing order and return the resulting matrix.

 **Examples:** 

```
Input: mat[][] = [[10, 20, 30, 40], [15, 25, 35, 45], [27, 29, 37, 48], [32, 33, 39, 50]]
Output: [[10, 15, 20, 25], [27, 29, 30, 32], [33, 35, 37, 39], [40, 45, 48, 50]]
Explanation: Sorting the matrix gives this result:

```

```
Input: mat[][] = [[1, 5, 3], [2, 8, 7], [4, 6, 9]]
Output: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
Explanation: Sorting the matrix gives this result:

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-16T17:08:19.642Z  

```java
class Solution {
	public int[][] sortedMatrix(int mat[][]) {
		int n = mat.length;
		int arr[] = new int[n*n];
		int k = 0;
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<n; j++) {
				arr[k] = mat[i][j];
				k++;
			}
		}
		Arrays.sort(arr);
		k = 0;
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<n; j++) {
				mat[i][j] = arr[k];
				k++;
			}
		}
		return mat;
	}
};

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sorted-matrix2333/1)