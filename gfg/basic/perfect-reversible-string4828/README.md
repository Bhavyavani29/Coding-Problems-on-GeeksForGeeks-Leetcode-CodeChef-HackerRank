# Perfect Reversible String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, check if the reverse of every possible substring of  **s**  is also present as a substring in  **s**. 

 **Examples:** 

```
Input: s = "ab"
Output: false
Explanation: All substrings are "a", "b", "ab" but the reverse of "ab" which is "ba" is not present in s.
```

```
Input: s = "aba"
Output: true
Explanation: Reverse of every possible substring is present in s.
```

```
Input: s = "abc"
Output: false
Explanation: The reverse of substring "abc" which is "cba" is not present in s.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T16:12:46.911Z  

```java
class Solution {
	public boolean isReversible(String s) {
		// code here
		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/perfect-reversible-string4828/1)