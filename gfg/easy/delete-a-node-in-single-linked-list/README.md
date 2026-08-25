# Linked List Delete at Position

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the  **head** of a linked list and an integer  **x**, delete the node at position x and return the updated head of the linked list.

 **Note** : Positions use 1-based indexing.

 **Examples:** 

```
Input: x = 4,

Output: 1 -> 2 -> 3 -> 5
Explanation: After deleting the node at the 4th position, the linked list is as

```

```
Input: x = 6,

Output: 2 -> 5 -> 7 -> 8 -> 99
Explanation: After deleting the node at 6th position, the linked list is as

```

 **Constraints:** 
1 ≤ size of linked list ≤ 105
1 ≤ x ≤ size of linked list

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T17:02:34.819Z  

```java
/* Structure of Linked List Node
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		this.data = d;
		this.next = null;
	}
}
*/
class Solution {
	Node deleteNode(Node head, int x) {
		// code here
		if (x == 1)
		{
			return head.next;
		}
		Node temp = head;
		for (int i = 1; i < x - 1; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		return head;
		
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1)