# BLACKCEL - Rating 746

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Black cells in a chessboard

Given $n$ ($n$ is  **even**), determine the number of  **black cells**  in an $n \times n$ chessboard.

### Input Format

The only line of the input contains a single integer $n$.

### Output Format

Output the number of black cells in an $n \times n$ chessboard.

### Constraints
- $2 \leq n \leq 100$
- $n$ is even
### Sample 1:
Input
Output

```
8
```

```
32
```

### Explanation:

There are $32$ black cells and $32$ white cells in an $8 \times 8$ chessboard. So the answer is $32$.

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T17:25:09.321Z  

```js
// Solution

function totalBlackCells(n){
    console.log(n * n / 2);
}

// Input related code. Please do not change. 
process.stdin.setEncoding('utf8');
process.stdin.on('data', function (input) {
   let n = parseInt(input); 
   totalBlackCells(n);
});


```

---

[View on CodeChef](https://www.codechef.com/problems/BLACKCEL)