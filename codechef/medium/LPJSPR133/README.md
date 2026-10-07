# LPJSPR133

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sum of numbers

Write a program using a for loop to calculate the sum of the first $N$ natural numbers.

Check the sample input / output below for further details.

### Input Format
- The first and only line of input contain a positive integer $N$.
### Output Format
- Output on a single line, the sum of first $N$ natural numbers.
### Sample 1:
Input
Output

```
10
```

```
55
```

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T16:19:45.293Z  

```js
 let N = parseInt(inputChar);

 let sum = 0;

    for (let i = 1; i <= N; i++) {
        sum += i;
    }

    console.log(sum);
```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR133)