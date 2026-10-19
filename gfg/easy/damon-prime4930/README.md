# Damon Prime

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer  **n**, determine whether it is a Damon Prime. A number is called a Damon Prime if both  **n - 1** and  **n + 1**  are prime numbers.

 **Examples:** 

```
Input: n = 4
Output: true
Explanation: 4 - 1 = 3 and 4 + 1 = 5. Both 3 and 5 are prime numbers. Hence, 4 is a Damon Prime.
```

```
Input: n = 5
Output: false
Explanation: 5 - 1 = 4 is not a prime number. Hence, 5 is not a Damon Prime.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T17:05:09.630Z  

```java
class Solution {
	public boolean damonPrime(int n) {
		// Code here
		if (isPrime(n - 1) && isPrime(n + 1))
			return true;
		else
			return false;
	}
	public static boolean isPrime(int N) {
		if (N <= 1)
			return false;
		if (N == 2 || N == 3)
			return true;
		if (N%2 == 0 || N%3 == 0)
			return false;
		for (int i = 5; i*i <= N; i = i + 6) {
			if ((N%i == 0) || (N%(i + 2) == 0))
				return false;
		}
		return true;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/damon-prime4930/1)