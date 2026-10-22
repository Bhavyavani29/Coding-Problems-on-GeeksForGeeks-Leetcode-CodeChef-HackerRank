# Binary Tree Postorder Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `root` of a binary tree, return  *the postorder traversal of its nodes' values*.

 

 **Example 1:** 

 **Input:**  root = [1,null,2,3]

 **Output:**  [3,2,1]

 **Explanation:** 

 **Example 2:** 

 **Input:**  root = [1,2,3,4,5,null,8,null,null,6,7,9]

 **Output:**  [4,6,7,5,2,9,8,3,1]

 **Explanation:** 

 **Example 3:** 

 **Input:**  root = []

 **Output:**  []

 **Example 4:** 

 **Input:**  root = [1]

 **Output:**  [1]

 

 **Constraints:** 

- The number of the nodes in the tree is in the range [0, 100].
- -100 <= Node.val <= 100

 

 **Follow up:**  Recursive solution is trivial, could you do it iteratively?

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.9 MB (beats 87.06%)  
**Submitted:** 2026-10-22T17:23:58.126Z  

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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        post(root, al);
        return al;
    }
    public static void post(TreeNode node, List<Integer> al) {
        if (node == null) return;
        post(node.left, al);
        post(node.right, al);
        al.add(node.val);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/binary-tree-postorder-traversal/)