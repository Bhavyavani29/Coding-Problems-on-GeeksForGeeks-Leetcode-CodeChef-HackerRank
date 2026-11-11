# Minimum Absolute Difference in BST

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `root` of a Binary Search Tree (BST), return  *the minimum absolute difference between the values of any two different nodes in the tree*.

 

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

- The number of nodes in the tree is in the range [2, 104].
- 0 <= Node.val <= 105

 

 **Note:**  This question is the same as 783: https://leetcode.com/problems/minimum-distance-between-bst-nodes/

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 46.6 MB (beats 65.84%)  
**Submitted:** 2026-11-11T16:05:05.927Z  

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
    int diff = Integer.MAX_VALUE;
    int pre = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        find(root);
        return diff;
    }
    private void find(TreeNode root) {
        if (root == null) {
            return;
        }
        find(root.left);
        diff = Math.min(diff, Math.abs(root.val - pre));
        pre = root.val;
        find(root.right);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-absolute-difference-in-bst/)