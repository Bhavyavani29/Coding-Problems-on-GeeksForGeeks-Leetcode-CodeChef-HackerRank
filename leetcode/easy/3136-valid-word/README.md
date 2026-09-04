# Valid Word

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A word is considered  **valid**  if:

- It contains a minimum of 3 characters.
- It contains only digits (0-9), and English letters (uppercase and lowercase).
- It includes at least one vowel.
- It includes at least one consonant.

You are given a string `word`.

Return `true` if `word` is valid, otherwise, return `false`.

 **Notes:** 

- 'a', 'e', 'i', 'o', 'u', and their uppercases are vowels.
- A consonant is an English letter that is not a vowel.

 

 **Example 1:** 

 **Input:**  word = "234Adas"

 **Output:**  true

 **Explanation:** 

This word satisfies the conditions.

 **Example 2:** 

 **Input:**  word = "b3"

 **Output:**  false

 **Explanation:** 

The length of this word is fewer than 3, and does not have a vowel.

 **Example 3:** 

 **Input:**  word = "a3$e"

 **Output:**  false

 **Explanation:** 

This word contains a `'$'` character and does not have a consonant.

 

 **Constraints:** 

- 1 <= word.length <= 20
- word consists of English uppercase and lowercase letters, digits, '@', '#', and '$'.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.91%)  
**Memory:** 43.4 MB (beats 35.14%)  
**Submitted:** 2026-09-04T06:19:44.412Z  

```java
class Solution {
    public boolean isValid(String word) {
        if(word == null || word.length() < 3)
            return false;
        boolean hasVowel = false;
        boolean hasConsonant = false;
        String vowels = "aeiouAEIOU";
        for(int i = 0;i < word.length(); i++){
            char ch = word.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            if(Character.isLetter(ch)){
                if (vowels.indexOf(ch) != -1) {
                    hasVowel = true;
                } 
                else {
                    hasConsonant = true;
                }
            }
        }
        return hasVowel&&hasConsonant;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-word/)