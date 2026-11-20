# Inorder Successor in BST

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a BST, and a reference to a Node  **k**  in the BST. Find the Inorder Successor of the given node in the BST. If there is no successor, return -1. 

 **Examples :** 

```
Input: root = [2, 1, 3], k = 2
Output: 3 
Explanation: Inorder traversal : 1 2 3 Hence, inorder successor of 2 is 3.

```

```
Input: root = [20, 8, 22, 4, 12, N, N, N, N, 10, 14], k = 8     
Output: 10
Explanation: Inorder traversal: 4 8 10 12 14 20 22. Hence, successor of 8 is 10.

```

 **Constraints:** 
1 ≤ n ≤ 105, where n is the number of nodes

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T14:31:03.157Z  

```java
/*
Definition for Node
class Node {
	public int data;
	public Node left;
	public Node right;
	
	public Node(int val) {
		data = val;
		left = right = null;
	}
};
*/

class Solution {
	private Node ans = null;
	public int inOrderSuccessor(Node root, Node k) {
		// code here
		dfs(root, k);
		return (ans != null) ? ans.data : -1;
	}
	private void dfs(Node root, Node k) {
		if (root == null)
			return;
		if (root.data <= k.data) {
			dfs(root.right, k);
		} 
		else {
			ans = root;
			dfs(root.left, k);
		}
	}
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/inorder-successor-in-bst/1)