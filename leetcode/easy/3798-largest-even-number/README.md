# Largest Even Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string `s` consisting only of the characters `'1'` and `'2'`.

You may delete any number of characters from `s` without changing the order of the remaining characters.

Return the  **largest possible resultant string**  that represents an  **even**  integer. If there is no such string, return the empty string `""`.

 

 **Example 1:** 

 **Input:**  s = "1112"

 **Output:**  "1112"

 **Explanation:** 

The string already represents the largest possible even number, so no deletions are needed.

 **Example 2:** 

 **Input:**  s = "221"

 **Output:**  "22"

 **Explanation:** 

Deleting `'1'` results in the largest possible even number which is equal to 22.

 **Example 3:** 

 **Input:**  s = "1"

 **Output:**  ""

 **Explanation:** 

There is no way to get an even number.

 

 **Constraints:** 

- 1 <= s.length <= 100
- s consists only of the characters '1' and '2'.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 59.39%)  
**Memory:** 43.7 MB (beats 88.00%)  
**Submitted:** 2026-09-23T17:06:22.703Z  

```java
class Solution {
    public String largestEven(String s) {
        int lastTwoIdx = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '2') {
                lastTwoIdx = i;
                break;
            }
        }
        if (lastTwoIdx == -1) {
            return "";
        }
        return s.substring(0, lastTwoIdx + 1);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/largest-even-number/)