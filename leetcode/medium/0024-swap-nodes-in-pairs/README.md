# Swap Nodes in Pairs

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

 

 **Example 1:** 

 **Input:**  head = [1,2,3,4]

 **Output:**  [2,1,4,3]

 **Explanation:** 

 **Example 2:** 

 **Input:**  head = []

 **Output:**  []

 **Example 3:** 

 **Input:**  head = [1]

 **Output:**  [1]

 **Example 4:** 

 **Input:**  head = [1,2,3]

 **Output:**  [2,1,3]

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 100].
- 0 <= Node.val <= 100

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.1 MB (beats 47.44%)  
**Submitted:** 2026-10-11T17:21:19.486Z  

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
				return head;
		ListNode prev = null;
		ListNode curr = head;
	    head = head.next;
		while(curr != null && curr.next != null){
			ListNode nextPair = curr.next.next;
			ListNode second = curr.next;
			second.next = curr;
			curr.next = nextPair;
			if(prev != null)
            	prev.next = second;
			prev = curr;
			curr = nextPair;
		}
		return head;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/swap-nodes-in-pairs/)