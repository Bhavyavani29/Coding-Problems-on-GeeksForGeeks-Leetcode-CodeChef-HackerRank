# Longest Substring with All 1's

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a binary string  **s**. Return the length of the longest substring containing only ‘1’.

 **Examples:** 

```
Input: s = "110"
Output: 2
Explanation: "11" is the longest substring containing only 1's. 
```

```
Input: s = "11101110"
Output: 3
Explanation: "111" is the longest substring containing only 1's.
```

 **Constraints:** 
1 ≤ |s| ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T16:37:20.623Z  

```java
class Solution {
    public int longestSubstring(String s) {
        // code here
        int currCount = 0, result = 0;
        for(char ch : s.toCharArray()){
            if(ch == '1'){
                currCount++;
                result = Math.max(result, currCount);
            }
            else{
                currCount = 0;
            }
        }
        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/longest-substring-containing-1/1)