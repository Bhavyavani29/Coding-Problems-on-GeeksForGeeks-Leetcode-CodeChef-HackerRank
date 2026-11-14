# Pair Sum in Sorted Doubly Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a sorted doubly linked list containing distinct positive integers and an integer target, find all pairs of nodes whose values add up to target.

 **Examples :** 

```
Input:

target = 7
Output: [[1, 6], [2, 5]]
Explanation: There are two pairs (1, 6) and (2,5) with sum 7.
```

```
Input: 

target = 6
Output: [[1, 5]]
Explanation: There is one pairs  (1, 5) with sum 6.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-14T16:28:18.966Z  

```java
/* Structure of Doubly Linked List Node
class Node {
	public int data;
	public Node next;
	public Node prev;
	
	public Node(int val) {
		data = val;
		next = null;
		prev = null;
	}
}; */

class Solution {
	public ArrayList<ArrayList<Integer>> givenSumPairs(Node head, int target) {
		// code here
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		if (head == null)
			return result;
		Node left = head;
		Node right = head;
		while (right.next != null)
			right = right.next;
		while (left != null && right != null && left != right && right.next != left) {
			int sum = left.data + right.data;
			if (sum == target) {
				ArrayList<Integer> pair = new ArrayList<>();
				pair.add(left.data);
				pair.add(right.data);
				result.add(pair);
				left = left.next;
				right = right.prev;
			}
			else if (sum < target) {
				left = left.next;
			}
			else {
				right = right.prev;
			}
		}
		return result;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-pairs-with-given-sum-in-doubly-linked-list/1)