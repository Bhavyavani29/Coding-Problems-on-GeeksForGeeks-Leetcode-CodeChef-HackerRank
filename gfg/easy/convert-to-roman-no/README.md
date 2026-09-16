# Decimal to Roman

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a positive integer  **n**, convert it into its equivalent Roman numeral representation.

Roman numerals are formed using the following symbols:

Roman numerals also use the following subtractive combinations:

Return the Roman numeral representation of the given integer.

 **Examples :** 

```
Input: n = 9
Output: IX
Explanation: 9 is represented as IX (10 - 1).

```

```
Input: n = 493
Output: CDXCIII
Explanation: 493 = 400 + 90 + 3, which is represented as CD + XC + III = CDXCIII.

```

 **Constraints:** 
1 ≤ n ≤ 3999

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T17:21:10.445Z  

```java
class Solution {
	public String convertToRoman(int n) {
		// code here
		StringBuilder res = new StringBuilder();
		String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		int i = 0;
		while (n > 0) {
			if (n >= value[i]) {
				res.append(symbol[i]);
				n -= value[i];
			}
			else
				i++;
		}
		return res.toString();
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/convert-to-roman-no/1)