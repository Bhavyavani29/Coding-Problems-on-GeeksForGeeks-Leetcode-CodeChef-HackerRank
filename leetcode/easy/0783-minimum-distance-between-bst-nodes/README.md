# Minimum Distance Between BST Nodes

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `root` of a Binary Search Tree (BST), return  *the minimum difference between the values of any two different nodes in the tree*.

 

 **Example 1:** 

```
Input: root = [4,2,6,1,3]
Output: 1

```

 **Example 2:** 

```
Input: root = [1,0,48,null,null,12,49]
Output: 1

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [2, 100].
- 0 <= Node.val <= 105

 

 **Note:**  This question is the same as 530: https://leetcode.com/problems/minimum-absolute-difference-in-bst/

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.4 MB (beats 85.58%)  
**Submitted:** 2026-11-17T15:52:49.324Z  

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
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return ans;
    }
    private int ans = Integer.MAX_VALUE;
    private Integer pred = null;
    private void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        if (pred != null)
            ans = Math.min(ans, root.val - pred);
        pred = root.val;
        inorder(root.right);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-distance-between-bst-nodes/)