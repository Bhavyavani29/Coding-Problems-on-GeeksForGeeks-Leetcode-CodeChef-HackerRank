# Circular Primes

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer **n**, find all circular prime numbers less than n. A prime number is called a circular prime if all rotations of its digits are also prime numbers.

 **Note:** A rotation is obtained by moving the last digit of a number to the front. For example, the rotations of 197 are 197, 719, and 971.

 **Examples:** 

```
Input: n = 4
Output: [2, 3]
Explanation: 2 and 3 are the circular prime number less than 4.

```

```
Input: n = 197
Output: [2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, 97, 113, 131]
Explanation: All the numbers in the output are circular primes less than 197. For example:
13 -> rotations: 13, 31 (both prime)
113 -> rotations: 113, 311, 131 (all prime)
197 is not included because the problem asks for circular primes less than 197.
```

 **Constraints:** 
2 ≤ n ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-10T16:58:00.735Z  

```java
class Solution {
    public ArrayList<Integer> isCircularPrime(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        int maxRotationValue = getMaxRotationValue(n);
        boolean[] isPrime = sieve(maxRotationValue);
        for (int i = 2; i < n; i++) {
            if (isPrime[i] && isCircular(i, isPrime)) {
                result.add(i);
            }
        }
        return result;
    }
    private boolean[] sieve(int limit) {
        boolean[] prime = new boolean[limit + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i * i <= limit; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    prime[j] = false;
                }
            }
        }
        return prime;
    }
    private boolean isCircular(int num, boolean[] isPrime) {
        String s = String.valueOf(num);
        int len = s.length();
        for (int i = 0; i < len; i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            int rotatedNum = Integer.parseInt(rotated);
            if (rotatedNum >= isPrime.length || !isPrime[rotatedNum]) {
                return false;
            }
        }
        return true;
    }
    private int getMaxRotationValue(int n) {
        int maxDigits = String.valueOf(n - 1).length();
        // Largest number with maxDigits (e.g., 999 for 3 digits)
        return (int) Math.pow(10, maxDigits) - 1;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/circular-prime-number0230/1)