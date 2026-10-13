# LPJSPR158

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Armstrong Number

Write a program to check if the given number $N$ is Armstrong number.

 **Note:**  Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

### Input Format
- The first and only line of input contains a single integer, $N$ - The number that needs to be checked.
### Output Format
- Print on a single line: YES if $N$ is Armstrong number. NO otherwise.
### Constraints
- 0 ≤ $N$ ≤ 1000000
### Sample 1:
Input
Output

```
153
```

```
YES
```

### Explanation:

$1^{\text{3}}$ + $5^{\text{3}}$ + $3^{\text{3}}$ = 1 + 125 + 27 = 153.

The number 153 has 3 digits, so each digit was raised to the power of 3 before summing.

### Sample 2:
Input
Output

```
92727
```

```
YES
```

### Explanation:

$9^{\text{5}}$ + $2^{\text{5}}$ + $7^{\text{5}}$ + $2^{\text{5}}$ + $7^{\text{5}}$ = 59049 + 32 + 16807 + 32 + 16807 = 92727

The number 92727 has 5 digits, so each digit was raised to the power of 5 before summing.

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T16:00:06.950Z  

```js
 let n = parseInt(inputChar);
    
// Function to calculate power
 function calculatePower(base, len) {
    let ans = 1;
    for (let i = 1; i <= len; i++) {
        ans *= base;
    }
    return ans;
 }

// Function to check if a number is Armstrong
 function checkArmstrong(n) {
    let x = n;
    let digits = [];
    while (n > 0) {
        let b = n % 10;
        digits.push(b);
        n = Math.floor(n / 10);
 }

 let len = digits.length;
    let sum = 0;
    for (let i of digits) {
        sum += calculatePower(i, len);
 }

  return x === sum;
 }
 
    if (checkArmstrong(n)) {
        console.log("YES");
    } else {
        console.log("NO");
    }

```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR158)