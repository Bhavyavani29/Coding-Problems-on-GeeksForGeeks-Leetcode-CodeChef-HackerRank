# LPJSPR157

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### All Primes in Range

Write a program to print all prime numbers in the range [$N$, $5N$].

### Input Format
- The first and only line of input contain an integer $N$.
### Output Format
- Print on a single line, all prime numbers between $N$ and $5N$ (inclusive) in increasing order with a space between them.
### Constraints
- 1 ≤ $N$ ≤ 1000
### Sample 1:
Input
Output

```
3
```

```
3 5 7 11 13 
```

### Explanation:

The prime numbers in the range [$3$, $15$] are: $3$, $5$, $7$, $11$ and $13$

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-12T15:49:52.994Z  

```js
    const n = parseInt(line);

// Function to check if a number is prime
    function isPrime(x) {
    if (x <= 1) return false;
    if (x <= 3) return true;
    if (x % 2 === 0 || x % 3 === 0) return false;

    let i = 5;
    while (i * i <= x) {
        if (x % i === 0 || x % (i + 2) === 0) return false;
        i += 6;
    }

    return true;
}

// Function to print prime numbers between l and r (inclusive)
function printPrimes(l, r) {
    let result = [];
    for (let i = l; i <= r; i++) {
        if (isPrime(i)) {
            result.push(i);
        }
    }
    console.log(result.join(' '));
}

    printPrimes(n, 5 * n);
```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR157)