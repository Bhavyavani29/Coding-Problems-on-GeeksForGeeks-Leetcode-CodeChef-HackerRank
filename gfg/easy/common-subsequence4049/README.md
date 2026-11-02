# Common Subsequence

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings **s1**  and **s2.**  Check whether they contain any common subsequence (non empty) or not.

 **Examples :** 

```
Input: s1 = "ABEF" s2 = "CADE"
Output: true
Explanation: Subsequence "AE" occurs in both the strings.

```

```
Input: s1 = "ABCD", s2 = "EFGH"
Output: false
Explanation: There's no common subsequence in both the strings.

```

 **Constraints:** 
1 ≤ |s1|, |s2| ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-02T04:38:00.074Z  

```java
class Solution {
    public boolean commonSubseq(String s1, String s2) {
        // code here
        HashSet<Character> hs = new HashSet<>();
        for(char ch : s1.toCharArray()){
            hs.add(ch);
        }
        for(char ch : s2.toCharArray()){
            if(hs.contains(ch)){
                return true;
            }
        }
        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/common-subsequence4049/1)