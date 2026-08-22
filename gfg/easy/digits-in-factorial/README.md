# Digits in Factorial

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer  **n**, find the number of digits in the value of  **n**  factorial. 

 **Examples :** 

```
Input: n = 5
Output: 3
Explanation: Factorial of 5 is 120. Number of digits in 120 is 3 (1, 2, and 0)
```

```
Input: n = 120
Output: 199
Explanation: The number of digits in 120! is 199
```

 **Constraints:** 
1 ≤ n ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T17:01:45.308Z  

```java
class Solution {
	public int digitsInFactorial(int n) {
		// code here
		if (n <= 1) {
			return 1;
		}
		double logSum = 0;
		for (int i = 1; i <= n; i++) {
			logSum += Math.log10(i);
		}
		return (int) Math.floor(logSum) + 1;
	}		
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/digits-in-factorial/1)