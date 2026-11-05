# Construct Binary Search Tree from Preorder Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers preorder, which represents the  **preorder traversal**  of a BST (i.e.,  **binary search tree**), construct the tree and return  *its root*.

It is  **guaranteed**  that there is always possible to find a binary search tree with the given requirements for the given test cases.

A  **binary search tree**  is a binary tree where for every node, any descendant of `Node.left` has a value  **strictly less than**  `Node.val`, and any descendant of `Node.right` has a value  **strictly greater than**  `Node.val`.

A  **preorder traversal**  of a binary tree displays the value of the node first, then traverses `Node.left`, then traverses `Node.right`.

 

 **Example 1:** 

```
Input: preorder = [8,5,1,7,10,12]
Output: [8,5,10,1,7,null,12]

```

 **Example 2:** 

```
Input: preorder = [1,3]
Output: [1,null,3]

```

 

 **Constraints:** 

- 1 <= preorder.length <= 100
- 1 <= preorder[i] <= 1000
- All the values of preorder are unique.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.8 MB (beats 91.57%)  
**Submitted:** 2026-11-05T16:36:34.351Z  

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
    public TreeNode bstFromPreorder(int[] preorder) {
        return createBST(preorder, 0, preorder.length - 1);
    }
    private TreeNode createBST(int[] pre, int st, int end){
        if(st > end){
            return null;
        }
        TreeNode root = new TreeNode(pre[st]);
        int i = st + 1;
        while(i <= end && pre[i] < root.val){
            i++;
        }
        root.left = createBST(pre, st + 1, i - 1);
        root.right = createBST(pre, i, end);
        return root;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/)