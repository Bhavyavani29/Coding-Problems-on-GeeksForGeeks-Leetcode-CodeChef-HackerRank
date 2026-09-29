# LPJSPR112

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Difference between odd and even

Write a program to input an integer n (the length of array), then print the difference between largest even and largest odd number in an array containing elements from 1 to n (both inclusive).

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

Array will be [ 1, 2, 3, 4, 5 ]
largest Even = 4
largest Odd = 5
4 - 5 = -1

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-29T18:02:26.313Z  

```js
let n = parseInt(inputChar);

let largest_even = n;
let largest_odd = n - 1;

if (n % 2 !== 0) {
    largest_even = n - 1;
    largest_odd = n;
}

console.log(largest_even - largest_odd);

```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR112)