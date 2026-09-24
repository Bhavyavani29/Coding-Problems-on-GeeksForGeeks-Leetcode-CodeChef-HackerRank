# LPJSPR78

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Leap Year

Write a program to check whether a given year is a leap year or not. If a number is divisible by $400$ or divisible by $4$ but not by $100$, then the year is considered a leap year. Print  **Leap year**  if the given year is a leap year; otherwise, print  **Not a leap year**.

### Sample 1:
Input
Output

```
2024
```

```
Leap year
```

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T16:48:21.450Z  

```js
let year = parseInt(inputChar);

if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
    console.log("Leap year");
} else {
    console.log("Not a leap year");
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR78)