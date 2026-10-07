# LPJSPR136

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Number not divisible by 2 or 3 or 5

Given an integer  **N**, print the number of elements between $1$ and  **N**  that are not divisible by $2$, $3$, or $5$.

### Sample 1:
Input
Output

```
10
```

```
2
```

### Explanation:

1 and 7 are not divisible by 2, 3 or 5

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T16:20:04.831Z  

```js
let N = parseInt(inputChar);
 
let cnt = 0;

  for (let i = 1; i <= N; i++) {
    if (i % 2 !== 0 && i % 3 !== 0 && i % 5 !== 0) {
      cnt++;
    }
  }

  console.log(cnt);

```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR136)