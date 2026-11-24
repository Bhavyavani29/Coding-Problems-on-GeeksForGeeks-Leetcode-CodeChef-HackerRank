# Adjacency Matrix to List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an undirected graph represented by its adjacency matrix  **mat[][]** where,

- mat[i][j] = 1 indicates that there is an edge between vertex i and vertex j
- And mat[i][j] = 0 indicates no edge.

Your task is to convert the given adjacency matrix into its corresponding adjacency list representation. In the resulting adjacency list, each element adj[i] should contain all vertices that are directly connected to vertex i.

 **Examples :** 

```
Input: mat[][] = [[0, 1, 0, 1], [1, 0, 1, 0], [0, 1, 0, 1], [1, 0, 1, 0]]
Output: [[1, 3], [0, 2], [1, 3], [0, 2]]
Explanation: 
    
The adjacency matrix represents the graph above and hence the adjacency list is [[1, 3], [0, 2], [1, 3], [0, 2]].
```

```
Input: mat[][] = [[0, 1, 1, 0, 0], [1, 0, 1, 0, 0], [1, 1, 0, 1, 1], [0, 0, 1, 0, 0], [0, 0, 1, 0, 0]]
Output: [[1, 2], [0, 2], [0, 1, 3, 4], [2], [2]]
Explanation: 

The adjacency matrix represents the graph above and hence the adjacency list is [[1, 2], [0, 2], [0, 1, 3, 4], [2], [2]].

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-24T15:30:58.524Z  

```java
class Solution {
  public ArrayList<ArrayList<Integer>> matToAdj(int[][] mat) {
    // code here
    ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    for (int i = 0; i < mat.length; i++) {
      ArrayList<Integer> a = new ArrayList<>();
      for (int j = 0; j < mat.length; j++) {
        if (mat[i][j] == 1)
          a.add(j);
      }
      arr.add(a);
    }
    return arr;
  }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/convert-adjacency-matrix-to-adjacency-list/1)