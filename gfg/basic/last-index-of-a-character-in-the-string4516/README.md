# Last Index of Character

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**  of size  **n**  and a character  **c**, find the last index (0-based indexing) of c in s. If the character is not present, return -1. Both s and c contain only lowercase and uppercase English alphabets.

 **Examples:** 

```
Input: s = "Geeks", c = 'e'
Output: 2
Explanation: The last occurrence of 'e' is at index 2.

```

```
Input: s = "okiyh", c = 'z'
Output: -1
Explanation: The character 'z' is not present in the string.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T16:41:35.757Z  

```java
class Solution {
    int lastIndex(String s, char c) {
        // code here
        int n = s.length();
        for(int i = n - 1; i >= 0;i--){
            if(s.charAt(i) == c){
                return i;
            }
        }
        return -1;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/last-index-of-a-character-in-the-string4516/1)