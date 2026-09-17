# Reverse Vowels of a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, reverse only all the vowels in the string and return it.

The vowels are `'a'`, `'e'`, `'i'`, `'o'`, and `'u'`, and they can appear in both lower and upper cases, more than once.

 

 **Example 1:** 

 **Input:**  s = "IceCreAm"

 **Output:**  "AceCreIm"

 **Explanation:** 

The vowels in `s` are `['I', 'e', 'e', 'A']`. On reversing the vowels, s becomes `"AceCreIm"`.

 **Example 2:** 

 **Input:**  s = "leetcode"

 **Output:**  "leotcede"

 

 **Constraints:** 

- 1 <= s.length <= 3 * 105
- s consist of printable ASCII characters.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 62.79%)  
**Memory:** 46.8 MB (beats 21.61%)  
**Submitted:** 2026-09-17T17:10:08.078Z  

```java
class Solution {
    public String reverseVowels(String s) {
        String vowels = "AEIOUaeiou";
        char ch[] = s.toCharArray();
        int i = 0, j = ch.length - 1;
        while (i < j) {
            while (i < j && vowels.indexOf(ch[i]) == -1) {
                i++;
            }
            while (i < j && vowels.indexOf(ch[j]) == -1) {
                j--;
            }
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-vowels-of-a-string/)