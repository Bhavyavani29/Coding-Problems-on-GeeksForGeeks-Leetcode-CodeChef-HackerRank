# Minimum in BST

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a Binary Search Tree, find the minimum in the given BST.

 **Examples** 

```
Input: root = [5, 4, 6, 3, N, N, 7, 1]

Output: 1
Explanation: The minimum element in the given BST is 1.
```

```
Input: root = [10, 5, 20, 2]

Output: 2
Explanation: The minimum element in the given BST is 2.
```

```
Input: root = []
Output: -1
Explanation: The root of the BST is NULL.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-17T15:51:10.457Z  

```java
/*
Definition for Node
class Node {
	int data;
	Node left;
	Node right;
	Node(int data) {
		this.data = data;
		left = right = null;
	}
}
*/

class Solution {
	public int minValue(Node root) {
		// code here
		if (root == null) return - 1;
		while (root.left != null) {
			root = root.left;
		}
		return root.data;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/minimum-element-in-bst/1)