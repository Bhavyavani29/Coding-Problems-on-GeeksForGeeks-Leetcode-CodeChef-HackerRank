# Stack Operations

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Implement a class  **myStack**  that supports following operations:

 **void push(int x):**  Insert an element x at the top of the stack.
 **void pop():**  Remove the element from the top of the stack.
 **int peek():** Return the element currently at the top of the stack.
 **bool isEmpty():**  Return true if the stack is empty, otherwise false.
 **int getSize():** Return the number of elements currently in the stack.

There will be a sequence of  **q**  queries arr[]. The queries are represented in numeric form:

- 1 x - Call push(x)
- 2 - Call pop()
- 3 - Call peek()
- 4 - Call isEmpty()
- 5 - Call getSize()

The driver code will process the queries, call the corresponding functions, and print the outputs of peek(), isEmpty(), getSize() operations.
You only need to implement the above five functions.

 **Examples:** 

```
Input: arr[] = [[1 10], [1 30], [3], [5], [2], [4]]
Output: [30, 2, false]
Explanation: Queries will process as follows:
push(10) into the stack.
push(30) into the stack.
Return top of the stack, i.e. 30.
Return current size of the stack, i.e. 2.
Remove the element from the top of the stack
Stack is non-empty, i.e. return false.
```

```
Input: arr[] = [[1 5], [3], [2], [4]]
Output: [5, true]
Explanation: Queries will process as follows: 
push(5) into the stack.
Return top of the stack, i.e. 5.
Remove the element from the top of the stack.
Stack is Empty, i.e. return true.

```

**Constraints:
**1 ≤ q ≤ 100
1 ≤ x ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-15T16:23:20.293Z  

```java
class myStack {
    // Define your stack
    ArrayList<Integer> al = new ArrayList<>();
    
    public void push(int x) {
        // insert x into stack
        al.add(x);
    }

    public void pop() {
        // remove top ele from stack
        al.remove(al.size() - 1);
    }

    public int peek() {
        // return top of stack
        return al.get(al.size() - 1);
    }

    public int getSize() {
        // return current size of stack
        return al.size();
    }

    public boolean isEmpty() {
        // check whether stack is empty
        return al.size() == 0;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/stacks-operations/1)