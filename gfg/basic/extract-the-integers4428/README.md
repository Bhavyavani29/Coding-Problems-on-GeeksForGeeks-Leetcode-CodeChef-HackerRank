# Extract Integers from String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string **s**  consisting of lowercase letters, uppercase letters, digits, and special characters, extract all the integers present in the string and return them in the order they appear.

If no integers are present in the string, return an empty array.

 **Examples:** 

```
Input: s = "1: Geeks for geeks, 2: geeksfor geeks, 3: forGeeksgeeks 56"
Output: [1, 2, 3, 56]
Explanation: 1, 2, 3, 56 are the integers present in s.

```

```
Input: s = "geeksforgeeks"
Output: []
Explanation: No integers present in the string.
```

 **Constraints:** 
1 ≤ n ≤ 105, n is size of the string.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-26T17:18:55.427Z  

```java
class Solution {
    public List<String> extractInt(String s) {
        List<String> al = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                str.append(ch);
            } else {
                if (str.length() > 0) {
                    al.add(str.toString());
                    str.setLength(0);
                }
            }
        }
        if (str.length() > 0) {
            al.add(str.toString());
        }
        return al;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/extract-the-integers4428/1)