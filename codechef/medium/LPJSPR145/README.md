# LPJSPR145

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### First occurrence

Write a program using a 'for' loop to find and print the numbers divisible by 8 from 1 to N. Check the sample input / output below for further details.

### Input Format
- First line of input contains a positive integer $N$
### Output Format
- Space separated values
### Sample 1:
Input
Output

```
20
```

```
8 16
```

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-08T16:32:30.965Z  

```js
let N = parseInt(inputChar);

let result = [];
for (let i = 1; i <= N; i++) {
    if (i % 8 !== 0) {
      continue;
    }
    result.push(i);
  }

console.log(result.join(' '));
```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR145)