# sort-the-string-in-descending-order3542

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T17:41:58.887Z  

```java
class Solution {
	public String reverseSort(String s) {
		// code here
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		s = String.valueOf(ch);
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-the-string-in-descending-order3542/1)