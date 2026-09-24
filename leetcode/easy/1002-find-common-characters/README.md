# Find Common Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string array `words`, return  *an array of all characters that show up in all strings within the* `words` *(including duplicates)*. You may return the answer in  **any order**.

 

 **Example 1:** 

```
Input: words = ["bella","label","roller"]
Output: ["e","l","l"]

```

 **Example 2:** 

```
Input: words = ["cool","lock","cook"]
Output: ["c","o"]

```

 

 **Constraints:** 

- 1 <= words.length <= 100
- 1 <= words[i].length <= 100
- words[i] consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 44.51%)  
**Memory:** 44.4 MB (beats 88.23%)  
**Submitted:** 2026-09-24T17:38:28.451Z  

```java
class Solution {
    public List<String> commonChars(String[] words) {
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);
        for (String word : words) {
            int[] charFreq = new int[26];
            for (int i = 0; i < word.length(); i++) {
                charFreq[word.charAt(i) - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], charFreq[i]);
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                result.add(String.valueOf((char) (i + 'a')));
                minFreq[i]--;
            }
        }
        return result;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/find-common-characters/)