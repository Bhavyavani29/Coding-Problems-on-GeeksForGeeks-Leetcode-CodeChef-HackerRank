# Substrings With Same Corners

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**  consisting of lowercase characters, the task is to find the  **count**  of all substrings that **start** and  **end**  with the same character.

 **Examples:** 

```
Input: s = "abcab"
Output: 7
Explanation: There are 7 substrings where the first and last characters are the same: "a", "abca", "b", "bcab", "c", "a", and "b"
```

```
Input: s = "aba"
Output: 4
Explanation: There are 4 substrings where the first and last characters are the same: "a", "aba", "b", "a"
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-02T04:49:44.945Z  

```java
class Solution {
    public int countSubstring(String s) {
        // code here
        HashMap<Character, Integer> hm = new HashMap<>();
        int result = s.length();
        for(char ch : s.toCharArray()){
            result += hm.getOrDefault(ch, 0);
            hm.put(ch, hm.getOrDefault(ch, 0)  +1);
        }
        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/substrings-with-similar-first-and-last-characters3644/1)