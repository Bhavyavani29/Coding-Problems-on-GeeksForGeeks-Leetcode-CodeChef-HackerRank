# Adjacency List to Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a directed graph in the form of an adjacency list  **adj[][]**, where each element adj[i] contains a list of all vertices adjacent to vertex i. 

Your task is to convert this adjacency list into an adjacency matrix representation.

 **Examples :** 

```
Input: adj[][] = [[1, 3], [2], [], [2]]
   
Output: 
[[0, 1, 0, 1],
[0, 0, 1, 0],
[0, 0, 0, 0],
[0, 0, 1, 0]]
Explanation: The edges in the graph are (0, 1), (0, 3), (1, 2), and (3, 2). Hence, in the adjacency matrix, the cells (0,1), (0,3), (1,2) and (3,2) are marked as 1.
```

```
Input: adj[][] = [[1, 2], [2], [3, 4], [0], []]

Output: 
[[0, 1, 1, 0, 0], 
[0, 0, 1, 0, 0], 
[0, 0, 0, 1, 1], 
[1, 0, 0, 0, 0], 
[0, 0, 0, 0, 0]]
Explanation: The edges in the graph are (0, 1), (0, 2), (1, 2), (2, 3), (2, 4) and (3, 0). Hence, in the adjacency matrix, the cells (0,1), (0,2), (1,2), (2,3), (2,4) and (3,0) are marked as 1.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-10T14:27:58.134Z  

```java
class Solution {
	public int[][] adjToMat(ArrayList<ArrayList<Integer>> adj) {
		// code here
		int v = adj.size();
		int mat[][] = new int[v][v];
		for (int i = 0; i<v; i++) {
			for (int j:adj.get(i)) {
				mat[i][j] = 1;
			}
		}
		return mat;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/convert-adjacency-list-to-adjacency-matrix/1)