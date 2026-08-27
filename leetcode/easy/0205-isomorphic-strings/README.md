# Isomorphic Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`,  *determine if they are isomorphic*.

Two strings `s` and `t` are isomorphic if the characters in `s` can be replaced to get `t`.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

 **Example 1:** 

 **Input:**  s = "egg", t = "add"

 **Output:**  true

 **Explanation:** 

The strings `s` and `t` can be made identical by:

- Mapping 'e' to 'a'.
- Mapping 'g' to 'd'.

 **Example 2:** 

 **Input:**  s = "f11", t = "b23"

 **Output:**  false

 **Explanation:** 

The strings `s` and `t` can not be made identical as `'1'` needs to be mapped to both `'2'` and `'3'`.

 **Example 3:** 

 **Input:**  s = "paper", t = "title"

 **Output:**  true

 

 **Constraints:** 

- 1 <= s.length <= 5 * 104
- t.length == s.length
- s and t consist of any valid ascii character.

## Solution

**Language:** Java  
**Runtime:** 16 ms (beats 47.80%)  
**Memory:** 43.8 MB (beats 58.73%)  
**Submitted:** 2026-08-27T16:07:59.738Z  

```java
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm1 = new HashMap<>();
        HashMap<Character,Character> hm2 = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(!hm1.containsKey(ch1)){
                hm1.put(ch1, ch2);
            }
            else{
                if(hm1.get(ch1) != ch2)
                    return false;
            }
            if(!hm2.containsKey(ch2)){
                hm2.put(ch2, ch1);
            }
            else{
                if(hm2.get(ch2) != ch1)
                    return false;
            }
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/isomorphic-strings/)