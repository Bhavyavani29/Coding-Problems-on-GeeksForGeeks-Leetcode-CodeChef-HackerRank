# Count Distinct Vowels in String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s,**  count the total distinct vowels in the string. 

 **Examples:** 

```
Input: s = geeksforgeeks
Output: 2
Explanation: String "geeksforgeeks" has 2 distinct vowel "e" and "o".
```

```
Input: s = world
Output: 1
Explanation: It has only 1 distinct vowel "o".
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T16:49:16.845Z  

```java
class Solution {
    public int countVowels(String s) {
        // code here
        HashSet<Character> hs = new HashSet<>();
        for(char ch : s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                hs.add(ch);
            }
        }
        return hs.size();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-distinct-vowels-in-string/1)