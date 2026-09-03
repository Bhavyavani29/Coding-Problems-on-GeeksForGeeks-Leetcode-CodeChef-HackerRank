# Longest Palindromic Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, return  *the longest*   *palindromic*   *substring*  in `s`.

 

 **Example 1:** 

```
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

```

 **Example 2:** 

```
Input: s = "cbbd"
Output: "bb"

```

 

 **Constraints:** 

- 1 <= s.length <= 1000
- s consist of only digits and English letters.

## Solution

**Language:** Java  
**Runtime:** 15 ms (beats 59.94%)  
**Memory:** 43.6 MB (beats 69.71%)  
**Submitted:** 2026-09-03T05:11:35.663Z  

```java
class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() <= 0)
            return "";
        int start = 0, end = 0;
        for(int i = 0;i < s.length(); i++){
            int len1 = validOrNot(s, i, i);
            int len2 = validOrNot(s, i, i + 1);
            int maxLen = Math.max(len1, len2);
            if(maxLen > end - start + 1){
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }
        return s.substring(start, end + 1);
    }
    public static int validOrNot(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-palindromic-substring/)