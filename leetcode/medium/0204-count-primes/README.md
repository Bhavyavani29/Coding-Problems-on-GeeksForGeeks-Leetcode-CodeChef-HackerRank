# Count Primes

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer `n`, return  *the number of prime numbers that are strictly less than*  `n`.

 

 **Example 1:** 

```
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

```

 **Example 2:** 

```
Input: n = 0
Output: 0

```

 **Example 3:** 

```
Input: n = 1
Output: 0

```

 

 **Constraints:** 

- 0 <= n <= 5 * 106

## Solution

**Language:** Java  
**Runtime:** 561 ms (beats 38.24%)  
**Memory:** 80.1 MB (beats 6.42%)  
**Submitted:** 2026-09-12T17:37:20.784Z  

```java
class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        boolean[] isNotPrime = new boolean[n];
        int count = n - 2;
        for (int p = 2; p * p < n; p++) {
            if (!isNotPrime[p]) {
                for (long i = (long) p * p; i < n; i += p) {
                    if (!isNotPrime[(int) i]) {
                        isNotPrime[(int) i] = true;
                        count--; 
                    }
                }
            }
        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-primes/)