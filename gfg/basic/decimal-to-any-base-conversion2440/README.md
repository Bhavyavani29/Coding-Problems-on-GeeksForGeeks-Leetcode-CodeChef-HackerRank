# Decimal to Any Base Conversion

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a decimal number n and an integer b representing the target base, convert n into the given base.

Return the converted number as a string.

 **Examples:** 

```
Input: n = 12, b = 2
Output: "1100"
Explanation: Converting the decimal number 12 to base 2 gives 1100. Therefore, the output is "1100".
```

```
Input: n = 282, b = 16
Output: "11A"
Explanation: Converting the decimal number 282 to base 16 gives 11A. Therefore, the output is "11A".
```

 **Constraints:** 
2 ≤ b ≤ 16

1 ≤ n ≤ 109 - 1

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-29T18:09:16.254Z  

```java
class Solution {
	public String decimalToBase(int b, int n) {
		// code here
		if (n == 0)
			return "0";
		StringBuilder res = new StringBuilder();
		while (n > 0) {
			int rem = n % b;
			char digit = (char)(rem < 10 ? '0' + rem : 'A' + (rem - 10));
			res.append(digit);
			n /= b;
		}
		return res.reverse().toString();
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/decimal-to-any-base-conversion2440/1)