# LPJSPR135

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Parity Difference

Given an integer  **N**, Find the difference of largest even and largest odd integer from 1 to N.

### Input Format
- The first line of input will contain a single integer $N$,
### Output Format
- Output on a single line - the difference
### Sample 1:
Input
Output

```
5
```

```
-1
```

### Explanation:

largest even = 4
largest odd = 5
difference = 4-5 = -1

### Sample 2:
Input
Output

```
6
```

```
1
```

### Explanation:

largest even = 6
largest odd = 5
difference = 6-5 = 1

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T16:51:23.072Z  

```js
  let N = parseInt(inputChar);
  
  let largest_even = 0;
  let largest_odd = 1;
  
  for (let i = 1; i <= N; i++) {
    if (i % 2 === 0) {
      largest_even = i;
    } else {
      largest_odd = i;
    }
  }
  
  console.log(largest_even - largest_odd);
```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR135)