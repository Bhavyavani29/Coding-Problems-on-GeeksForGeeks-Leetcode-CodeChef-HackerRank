# Reverse a Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the  **head** of a singly linked list. Reverse the linked list and return the head of the reversed list.

 **Examples:** 

```
Input:

Output: 4 -> 3 -> 2 -> 1
Explanation: After reversing the linked list

```

```
Input: 

Output: 8 -> 9 -> 10 -> 7 -> 2
Explanation: After reversing the linked list

```

```
Input: 

Output: 8
Explanation:

```

**Constraints:
**1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T16:37:44.422Z  

```java
/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        if(head.next == null){
            return head;
        }
        else{
            Node cur = head;
            Node p = head.next;
            Node nxt = head.next;
            cur.next = null;
            while(p.next != null){
                nxt = p.next;
                p.next = cur;
                cur = p;
                p = nxt;
            }
            p.next = cur;
            head = p;
            }
            return head;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1)