# Ransom Note

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `ransomNote` and `magazine`, return `true` *if* `ransomNote` *can be constructed by using the letters from* `magazine` *and* `false` *otherwise*.

Each letter in `magazine` can only be used once in `ransomNote`.

 

 **Example 1:** 

```
Input: ransomNote = "a", magazine = "b"
Output: false

```

 **Example 2:** 

```
Input: ransomNote = "aa", magazine = "ab"
Output: false

```

 **Example 3:** 

```
Input: ransomNote = "aa", magazine = "aab"
Output: true

```

 

 **Constraints:** 

- 1 <= ransomNote.length, magazine.length <= 105
- ransomNote and magazine consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 16 ms (beats 18.20%)  
**Memory:** 46.8 MB (beats 37.18%)  
**Submitted:** 2026-10-17T16:24:24.325Z  

```java
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();
        for(int i = 0;i < ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            hm1.put(ch, hm1.getOrDefault(ch,0) + 1);
        }
        for(int i = 0;i < magazine.length();i++){
            char ch = magazine.charAt(i);
            hm2.put(ch, hm2.getOrDefault(ch,0) + 1);
        }
        for(int i = 0;i < ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            if(hm2.getOrDefault(ch,0) < hm1.get(ch)){
                return false;
            }
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/ransom-note/)