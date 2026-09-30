# LPJSPR121

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Print Squares

Write a program that utilizes a while loop to print the squares of numbers from 1 to $N$

Check the sample input / output below further clarity.

### Sample 1:
Input
Output

```
5
```

```
1 4 9 16 25
```

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T16:40:50.308Z  

```js
    let N = parseInt(inputChar);
    let y = 1;
    let result = [];

    while (y <= N) {
        // For each value of y, calculate its square (y * y) and append it to the result array.
        result.push(y * y);
        y++;
    }
   
    //result.join(' ') to convert the array of squares into a space-separated string.
    console.log(result.join(' '));
```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR121)