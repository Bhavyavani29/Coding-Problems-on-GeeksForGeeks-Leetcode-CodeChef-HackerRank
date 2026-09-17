# Longest Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` which consists of lowercase or uppercase letters, return the length of the  **longest palindrome**  that can be built with those letters.

Letters are  **case sensitive**, for example, `"Aa"` is not considered a palindrome.

 

 **Example 1:** 

```
Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

```

 **Example 2:** 

```
Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.

```

 

 **Constraints:** 

- 1 <= s.length <= 2000
- s consists of lowercase and/or uppercase English letters only.

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 48.52%)  
**Memory:** 43.4 MB (beats 17.06%)  
**Submitted:** 2026-09-17T16:46:54.539Z  

```java
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch : s.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        boolean hasOdd = false;
        int length = 0;
        for(int num : hm.values()){
            if(num % 2 == 0){
                length += num;
            }
            else{
                length += num - 1;
                hasOdd = true;
            }
            
        }
        if(hasOdd){
            length += 1;
        }
        return length;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-palindrome/)