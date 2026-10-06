# LPJSPR134

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Print fibonacci series

Write a program to generate and print the first $N$ terms of the  **Fibonacci series**  using a for-loop.

The  **Fibonacci series**  is the sequence where each number is the  **sum of the previous two numbers of the sequence**.

The number at the  **nth position**  can be represented by:
 **Fn = Fn-1 + Fn-2** 

where,
 **F0 = 0 and F1 = 1** 

Check the sample input / output below for further clarity.

### Input Format
- The first and only line of input contains $N$.
### Output Format
- On a single line, print the first $N$ terms of the fibonacci series with a space between them.
### Sample 1:
Input
Output

```
10
```

```
0 1 1 2 3 5 8 13 21 34 
```

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T16:49:13.734Z  

```js
let N = parseInt(inputChar);

let first = 0, second = 1, next;

let result = [];

    for (let i = 1; i <= N; ++i) {
        result.push(first);
        next = first + second;
        first = second;
        second = next;
    }

    console.log(result.join(' '));
```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR134)