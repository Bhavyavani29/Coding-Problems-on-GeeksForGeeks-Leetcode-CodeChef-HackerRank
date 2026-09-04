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

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T06:27:26.339Z  

```py
n = int(input())
# write your code here
print((n * n) // 2)
```

---

[View on CodeChef](https://www.codechef.com/problems/BLACKCEL)