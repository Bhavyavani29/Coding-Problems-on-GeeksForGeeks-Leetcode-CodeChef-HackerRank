# Queue using Stack

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Implement a  **Queue** using  **stacks**. You are allowed to use only stack data structures to implement the queue.
The Queue must support the following operations:

 **(i)**  **enqueue(x):**  Insert an element x at the rear of the queue.
 **(ii)**   **dequeue():**  Remove the element from the front of the queue.
 **(iii)**   **front()** : Return the front element if the queue is not empty, else return -1.
 **(iv)**   **size()** : Return the number of elements currently in the queue.

There will be a sequence of queries  **queries[][]**. The queries are represented in numeric form:

- 1 x : Call enqueue(x)
- 2: Call dequeue()
- 3: Call front()
- 4: Call size()

You just have to implement the functions  **enqueue,**  **dequeue,**  **front** and  **size.**  The driver code will handle the input and output.

 **Examples:** 

```
Input: q = 7, queries[][] = [[1, 5], [1, 3], [1, 4], [3], [2], [4], [3]]
Output: [5, 2, 3]
Explanation: Queries on queue are as follows:
enqueue(5): Insert 5 at the rear of the queue.
enqueue(3): Insert 3 at the rear of the queue.
enqueue(4): Insert 4 at the rear of the queue.
front(): Return the front element i.e 5.
dequeue(): Remove the front element 5 from the queue.
size(): Queue now has 2 elements.
front(): Return the front element i.e 3.
```

```
Input: q = 3, queries[][] = [[3], [4], [1, 10]]
Output: [-1, 0]
Explanation: Queries on queue are as follows:
front(): Queue is empty, return -1.
size(): Queue contains 0 elements return 0.
enqueue(10): Insert 10 at the rear (no output for enqueue).
```

 **Constraints:** 
1 ≤ number of query ≤ 103
0 ≤ x ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T16:18:22.127Z  

```java
class myQueue {
    // Initialize your data members
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    void enqueue(int x) {
        // Implement enqueue operation
        s1.push(x);
    }
    void dequeue() {
        // Implement dequeue operation
         if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        if (!s2.isEmpty()) {
            s2.pop();
        }
    }
    int front() {
        // Implement front operation
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        if (s2.isEmpty()) return -1;

        return s2.peek();
    }
    int size() {
        // Implement size operation
         return s1.size() + s2.size();
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/queue-using-stack/1)