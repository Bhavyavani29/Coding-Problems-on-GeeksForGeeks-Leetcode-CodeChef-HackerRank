# Smallest window containing 0, 1 and 2

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**  consisting only of the characters ' **0'**, ' **1'**  and ' **2'**, determine the length of the  **smallest substring**  that contains all three characters at least once.

If no such substring exists, return  **-1**.

 **Examples :** 

```
Input: s = "10212"
Output: 3
Explanation: The substring "102" is the shortest substring that contains all three characters '0', '1', and '2', so the answer is 3.
```

```
Input: s = "12121"
Output: -1
Explanation: The character '0' is not present in the string, so no substring can contain all three characters '0', '1', and '2'. Hence, the answer is -1.
```

 **Constraints:** 
1 ≤ s.size() ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-29T16:46:49.287Z  

```java
// User function Template for Java

class Solution {
    public int smallestSubstring(String S) {
        // Code here
        int n = S.length();
        int[] count = new int[3];
        int dist = 0;
        int left = 0, minLen = Integer.MAX_VALUE;
        for(int right = 0;right < n;right++){
            int idx = S.charAt(right)-'0';
            if(count[idx] == 0) dist++;
            count[idx]++;
            while(dist == 3){
                minLen = Math.min(minLen,right-left+1);
                int l = S.charAt(left)-'0';
                count[l]--;
                if(count[l] == 0) dist--;
                left++;
            }
        }
        if(minLen == Integer.MAX_VALUE) return -1;
        else return minLen;
    }
};

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-window-containing-0-1-and-2--170637/1)