# Check if the Sentence Is Pangram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A  **pangram**  is a sentence where every letter of the English alphabet appears at least once.

Given a string `sentence` containing only lowercase English letters, return `true` *if* `sentence` *is a  **pangram**, or* `false` *otherwise.* 

 

 **Example 1:** 

```
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

```

 **Example 2:** 

```
Input: sentence = "leetcode"
Output: false

```

 

 **Constraints:** 

- 1 <= sentence.length <= 1000
- sentence consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 29.79%)  
**Memory:** 42.3 MB (beats 95.93%)  
**Submitted:** 2026-11-03T15:47:56.373Z  

```java
class Solution {
    public boolean checkIfPangram(String sentence) {
        /*sentence = sentence.toLowerCase();
		int[] freq = new int[26];
        for(int i = 0; i < sentence.length(); i++){
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                freq[ch - 'a']++;
            }
        }
        for(int i = 0; i < 26; i++){
            if(freq[i] == 0){
                return false;
            }
        }
        return true; */

        HashSet<Character> hs = new HashSet<>();
        if(sentence.length() < 26)
            return false;
        for(char ch : sentence.toCharArray()){
            hs.add(ch);
        }
        if(hs.size() == 26){
            return true;
        }
        return false;
    } 
}
```

---

[View on LeetCode](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)