# Longest Palindromic Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string  **s**, return the  **longest palindromic substring**  in s. If there are multiple answers, return the one that appears  **first**  in the given string **s**.

 **Note:**  Substring is a  **contiguous**  sequence of characters within a string, i.e. s[ i.... j ] where 0 ≤ i ≤ j < len(s) **.** 

 **Examples :** 

```
Input: s = "forgeeksskeegfor"
Output: geeksskeeg
Explanation: There are several possible palindromic substrings like "kssk", "ss", "eeksskee" etc. But the substring "geeksskeeg" is the longest among all.

```

```
Input: s = "abacac"
Output: aba
Explanation: The palindromic substrings "aba", "aca" and "cac" all have the same length. Since "aba" appears first, it is the answer.
```

```
Input: s = "geeks"
Output: ee
Explanation: The longest palindromic substring present in the given string is "ee".
```

 **Constraints:** 
1 ≤ |s| ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T14:56:03.438Z  

```java
class Solution {
	public String getLongestPal(String s) {
		// code here
		if (s == null || s.length() <= 0)
			return "";
		int start = 0, end = 0;
		for (int i = 0; i < s.length(); i++) {
			int left = 0;
			int right = 0;
			int len1 = validOrNot(s, i, i);
			int len2 = validOrNot(s, i, i + 1);
			int maxLen = Math.max(len1, len2);
			if (maxLen > end - start + 1) {
				start = i - (maxLen - 1) / 2;
				end = i + maxLen / 2;
			}
		}
		return s.substring(start, end + 1);
	}
	public static int validOrNot(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right - left - 1;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string1956/1)