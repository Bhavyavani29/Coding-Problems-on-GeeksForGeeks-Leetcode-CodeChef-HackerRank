# Binary Substrings with Corners as 1

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a binary string  **s**. You have to count the number of substrings that start and end with 1.

 **Examples:** 

```
Input: s = "1111"
Output: 6
Explanation: There are 6 substrings from the given string. They are "11", "11", "11", "111", "111", "1111".
```

```
Input: s = "01101"
Output: 3
Explanation: There are 3 substrings from the given string. They are "11", "101", "1101".
```

 **Constraints:** 
1 ≤ |s| ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-22T17:01:30.800Z  

```java
class Solution {
	public int binarySubstring(String s) {
		// code here
		int n = s.length();
		int count = 0;
		for (int i = 0; i<n; i++) {
			if (s.charAt(i) == '1') {
				count++;
			}
		}
		int sum = 0;
		count--;
		while (count>0) {
			sum += count;
			count--;
		} return sum;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/binary-string-1587115620/1)