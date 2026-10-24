# Count the Number of Special Characters I

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string `word`. A letter is called  **special**  if it appears  **both**  in lowercase and uppercase in `word`.

Return the number of  **special**  letters in `word`.

 

 **Example 1:** 

 **Input:**  word = "aaAbcBC"

 **Output:**  3

 **Explanation:** 

The special characters in `word` are `'a'`, `'b'`, and `'c'`.

 **Example 2:** 

 **Input:**  word = "abc"

 **Output:**  0

 **Explanation:** 

No character in `word` appears in uppercase.

 **Example 3:** 

 **Input:**  word = "abBCab"

 **Output:**  1

 **Explanation:** 

The only special character in `word` is `'b'`.

 

 **Constraints:** 

- 1 <= word.length <= 50
- word consists of only lowercase and uppercase English letters.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 57.47%)  
**Memory:** 43.4 MB (beats 67.41%)  
**Submitted:** 2026-10-24T16:27:59.570Z  

```java
class Solution {
    public int numberOfSpecialChars(String word) {
        int specialCount = 0;
        boolean hasLower[] = new boolean[26];
        boolean hasUpper[] = new boolean[26];
        for (char ch : word.toCharArray()) {
            if (Character.isLowerCase(ch))
                hasLower[ch - 'a'] = true;
            else if (Character.isUpperCase(ch)) {
                hasUpper[ch - 'A'] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (hasLower[i] && hasUpper[i]) {
                specialCount++;
            }
        }
        return specialCount;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-the-number-of-special-characters-i/)