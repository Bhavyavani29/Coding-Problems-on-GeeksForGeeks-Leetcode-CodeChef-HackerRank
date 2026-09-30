# LPJSPR122

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Print factorial

Write a program that uses a while loop to find the factorial of a given number.

### Sample 1:
Input
Output

```
5
```

```
120
```

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T16:41:01.980Z  

```js
    let x = parseInt(inputChar);
    let ans = 1; // Factorial of x will be stored in ans
    let i = 1;   // Start from 1

    while (i <= x) {
        ans *= i; // Multiply ans by the current value of i
        i++;      // Increment i by 1
    }

    console.log(ans);
```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR122)