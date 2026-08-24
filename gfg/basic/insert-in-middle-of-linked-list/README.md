# Insert at Middle of Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given the head of a Singly Linked List and a value x. Insert the key in the middle of the linked list.

 **Examples :** 

```
Input: 1->2->4, x = 3
Output: 1->2->3->4
Explanation: 

```

```
Input: 10->20->40->50, x = 30
Output: 10->20->30->40->50
Explanation: 

```

 **Constraints:** 
0 ≤ number of nodes ≤ 105
0 ≤ node->data, x ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T16:22:25.929Z  

```java
/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        // Code here
        Node newNode = new Node(x);
        if (head == null) {
            return newNode;
        }
        int count = 0;
        Node p = head;
        while (p != null) {
            count++;
            p = p.next;
        }
        int mid = count%2 == 0? (count / 2) : ((count + 1)/2);
        p = head;
        for (int i = 1; i < mid; i++) {
            p = p.next;
        }
        newNode.next = p.next;
        p.next = newNode;
        return head;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/insert-in-middle-of-linked-list/1)