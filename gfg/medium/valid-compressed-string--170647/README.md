# Valid Compressed String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings  **s**  and  **t**, where s is the original string and t is its compressed form, find if t is a valid compression of s or not.

- During compression, any sequence of consecutive characters may be replaced by the number of characters removed.
- If t contains consecutive digits, treat them as a single number. For example, "B32" represents "B" + "32",  not "B" + "3" + "2".

 **Examples:** 

```
Input: s = "GEEKSFORGEEKS", t = "G7G3S"
Output: true
Explanation: 'G' + skip 7 characters ("EEKSFOR") + 'G' + skip 3 characters ("EEK") + 'S' matches s exactly.

```

```
Input: s = "DFS", t = "D1D"
Output : false
Explanation: t is not a valid compressed string.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T17:48:10.464Z  

```java
class Solution { 
    public boolean checkCompressed(String s, String t) { 
        int n = s.length(), m = t.length(); 
        int i = 0, j = 0; 

        while (i < n && j < m) { 
            if (s.charAt(i) == t.charAt(j)) { 
                i++; 
                j++; 
            } else if (Character.isDigit(t.charAt(j))) { 
                long d = 0; 
                while (j < m && Character.isDigit(t.charAt(j))) { 
                    d = d * 10 + (t.charAt(j) - '0'); 
                    j++; 
                    if (d > n) { 
                        d = n + 1; 
                    } 
                } 
                i += d; 
                if (i > n) { 
                    return false; 
                } 
            } else { 
                return false; 
            } 
        } 
        return i == n && j == m; 
    } 
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/valid-compressed-string--170647/1)