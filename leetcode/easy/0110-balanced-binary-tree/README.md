# Balanced Binary Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a binary tree, determine if it is  **height-balanced**.

 

 **Example 1:** 

```
Input: root = [3,9,20,null,null,15,7]
Output: true

```

 **Example 2:** 

```
Input: root = [1,2,2,3,3,null,null,4,4]
Output: false

```

 **Example 3:** 

```
Input: root = []
Output: true

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [0, 5000].
- -104 <= Node.val <= 104

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 58.66%)  
**Memory:** 45.6 MB (beats 29.27%)  
**Submitted:** 2026-11-12T15:44:50.594Z  

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        int[] result = dfs(root);
        return result[0] == 1;
    }
    private int[] dfs(TreeNode node) {
        if (node == null)
            return new int[] { 1, 0 };
        int[] left = dfs(node.left);
        int[] right = dfs(node.right);
        boolean isBalanced = left[0] == 1 && right[0] == 1 && Math.abs(left[1] - right[1]) <= 1;
        return new int[] { isBalanced ? 1 : 0, 1 + Math.max(left[1], right[1]) };
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/balanced-binary-tree/)