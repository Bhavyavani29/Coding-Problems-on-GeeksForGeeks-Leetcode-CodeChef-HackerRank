# LPJSPR146

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Square of numbers

Write a program that uses a for loop to print the squares from 1 to $N$, but skips numbers greater than $5$.

Check the sample input and output below for further clarity.

 **Note** : Output the square of each element on a new line.

### Sample 1:
Input
Output

```
8
```

```
1
4
9
16
25
```

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-08T16:32:41.054Z  

```js
let N = parseInt(inputChar); 

 for (let i = 1; i <= N; i++) {
    if (i > 5) {
      break;
    }
    console.log(i * i);
  }
```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR146)