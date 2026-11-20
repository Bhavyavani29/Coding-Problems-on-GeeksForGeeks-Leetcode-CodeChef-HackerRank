# Excel Sheet Column Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `columnTitle` that represents the column title as appears in an Excel sheet, return  *its corresponding column number*.

For example:

```
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...

```

 

Original
Java
 **Example 1:** 

```
Input: columnTitle = "A"
Output: 1

```

 **Example 2:** 

```
Input: columnTitle = "AB"
Output: 28

```

 **Example 3:** 

```
Input: columnTitle = "ZY"
Output: 701

```

 

 **Constraints:** 

- 1 <= columnTitle.length <= 7
- columnTitle consists only of uppercase English letters.
- columnTitle is in the range ["A", "FXSHRXW"].

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 95.35%)  
**Memory:** 43.4 MB (beats 47.77%)  
**Submitted:** 2026-11-20T14:32:39.196Z  

```java
class Solution {
    public int titleToNumber(String columnTitle) {
        long ans = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            ans = ans * 26 + (ch - 'A' + 1);
        }
        return (int) ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/excel-sheet-column-number/)