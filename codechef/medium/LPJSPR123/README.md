# LPJSPR123

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find the number of digits

Given an integer  **N**, Calculate and print the number of digits present in  **N**.

### Constraints
- $1 \leq N \leq 10000$
### Sample 1:
Input
Output

```
1543
```

```
4
```

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:04:33.327Z  

```js
  let N = parseInt(inputChar);
  
  let digitCount = 0;
  
  while(N > 0){
    digitCount++;
    N = Math.floor(N / 10); // Use Math.floor to ensure N is an integer after division
  }
  
  console.log(digitCount);
```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR123)