# K-Pangrams

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**  and an integer  **k**, return  **true**  if the string can be changed into a  **pangram**  after at most k operations, else return  **false**.  A pangram consists of all 26 lowercase English alphabet characters at least once.

- The string may contain duplicate characters. 
- A single operation consists of swapping an existing alphabetic character with any other lowercase alphabetic character or spaces.

 **Note** : A pangram is a sentence containing every letter in the English alphabet.

 **Examples :** 

```
Input: s = "the quick brown fox jumps over the lazy dog", k = 2
Output: true
Explanation: the sentence contains all 26 characters and is already a pangram.
```

```
Input: s = "aaaaaaaaaaaaaaaaaaaaaaaaaa", k = 25 
Output: true
Explanation: The word contains 26 instances of 'a'. Since only 25 operations are allowed. We can keep 1 instance and change all others to make s a pangram.

```

```
Input: s = "abcdefghijklm", k = 20
Output: false
Explanation: Since, there are only 13 alphabetical characters in this case, no amount of swapping can produce a pangram here.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T15:42:34.906Z  

```java
class Solution {
    public boolean kPangram(String s, int k) {
        // code here
        boolean arr[] = new boolean[26];
        int totalLetters = 0, uniqueLetters = 0;;
        for(char ch : s.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                totalLetters++;
                if(!arr[ch - 'a']){
                    arr[ch - 'a'] = true;
                    uniqueLetters++;
                }
            }
        }
        if(totalLetters < 26){
            return false;
        }
        if(26 - uniqueLetters <= k){
            return true;
        } 
        return false;
        
        
        
        
        /*HashSet<Character> hs = new HashSet<>();
        if(s.length() < 26){
            return false;
        }
        for(char ch : s.toCharArray()){
            hs.add(ch);
        }
        if(hs.size() + k == 26){
            return true;
        }
        return false;*/
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/k-pangrams0909/1)