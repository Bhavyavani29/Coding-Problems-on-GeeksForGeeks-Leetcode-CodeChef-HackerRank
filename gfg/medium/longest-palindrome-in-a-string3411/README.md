# Longest Palindrome in String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string s, your task is to find the longest palindromic substring within s. If there are multiple palindromic substrings with the same length, return the first occurrence of the longest palindromic substring from left to right.

 **Examples :** 

```
Input: s = “forgeeksskeegfor” 
Output: “geeksskeeg”
Explanation: There are several possible palindromic substrings like “kssk”, “ss”, “eeksskee” etc. But the substring “geeksskeeg” is the longest among all.
```

```
Input: s = “Geeks” 
Output: “ee”
Explanation: "ee" is the longest palindromic substring of "Geeks". 
```

```
Input: s = “abc” 
Output: “a”
Explanation: "a", "b" and "c" are longest palindromic substrings of same length. So, the first occurrence is returned.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T17:18:41.951Z  

```java
class Solution {
	static String longestPalindrome(String s) {
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

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string3411/1)