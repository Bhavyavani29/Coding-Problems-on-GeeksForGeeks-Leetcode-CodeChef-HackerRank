# Operations on Standard Queue

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a queue of integers and  **Q**  queries. The task is to perform operations on the queue according to the query. 

Queries are as:

- i x : adds element x in the queue from the rear.
- r : removes the front element of the queue.
- h : returns the front element.
- f y : check if the element y is present or not in the queue. Return true if present, else false.

Note: You need to complete the functions enqueue(), dequeue(), front() and find() which perform the operations described above.

 **Examples:** 

```
Input: Q = 6, Queries = [[i, 2], [i, 4], [i, 3], [i, 5], [h], [f, 8]]
Output:
2
false
Explanation: After inserting 2, 4, 3, and 5, the front element (h) is 2. The element 8 is not in the queue, so the find operation (f, 8) returns false.

```

```
Input: Q = 4, Queries = [[i, 3] [i, 4] [r] [f, 3]]
Output:
false
Explanation: After inserting 3 and 4, removing the front element (r) leaves 4 in the queue. The element 3 is not in the queue, so the find operation (f, 3) returns false.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T16:37:16.365Z  

```java
class Solution {
    public void enqueue(Queue<Integer> q, int x) {
        // code here
        q.add(x);
    }

    public void dequeue(Queue<Integer> q) {
        
        // code here
        if(!q.isEmpty()){
            q.remove();
        }
    }

        
    public int front(Queue<Integer> q) {
        // code here
        return q.peek();
    }
        

    public boolean find(Queue<Integer> q, int x) {
        // code here
        return q.contains(x);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/operations-on-queue--114617/1)