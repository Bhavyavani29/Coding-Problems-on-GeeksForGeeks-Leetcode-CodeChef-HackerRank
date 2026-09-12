# Sieve of Eratosthenes

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a positive integer  **n**, calculate and return all primes less than or equal to n using the Sieve of Eratosthenes algorithm.

 **Examples:** 

```
Input: n = 10
Output: [2, 3, 5, 7]
Explanation: Prime numbers less than equal to 10 are 2, 3, 5 and 7.
```

```
Input: n = 35
Output: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31]
Explanation: Prime numbers less than equal to 35 are 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 and 31.
```

 **Constraints:** 
1 ≤ n ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-12T17:27:44.222Z  

```java
class Solution {
	public ArrayList<Integer> sieve(int n) {
		// code here
		boolean[] isPrime = new boolean[n + 1];
		Arrays.fill(isPrime, true);
		if (n >= 0)
			isPrime[0] = false;
		if (n >= 1)
			isPrime[1] = false;
		for (int p = 2; p * p <= n; p++) {
			if (isPrime[p]) {
				for (int i = p * p; i <= n; i += p) {
					isPrime[i] = false;
				}
			}
		}
		ArrayList<Integer> primes = new ArrayList<>();
		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				primes.add(i);
			}
		}
		return primes;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sieve-of-eratosthenes5242/1)