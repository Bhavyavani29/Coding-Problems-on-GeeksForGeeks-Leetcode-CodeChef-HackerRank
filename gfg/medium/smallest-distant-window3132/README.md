# Smallest distinct window

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string  **str,**  your task is to find the  **length**  of the  **smallest** window that contains **all** the characters of the given string at least once.

 **Example:** 

```
Input: str = "aabcbcdbca"
Output: 4
Explanation: Sub-String "dbca" has the smallest length that contains all the characters of str.

```

```
Input: str = "aaab"
Output: 2
Explanation: Sub-String "ab" has the smallest length that contains all the characters of str.
```

```
Input: str = "geeksforgeeks"
Output: 7
Explanation: There are multiple substring with smallest length that contains all characters of str, "eksforg" and "ksforge". 
```

 **Constraints:** 
1 ≤ str.size() ≤ 105
str contains only lower-case english alphabets.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-29T16:51:47.462Z  

```java
// User function Template for Java

class Solution {
    public int findSubString(String str) {
        // code here
        Map<Character,Integer> hm = new HashMap<>();
        int small = Integer.MAX_VALUE;
        int i = 0,j = 0, unique = 0;
        while(j < str.length()){
            char c = str.charAt(j);
            hm.put(c,hm.getOrDefault(c,0)+1);
            while(i < str.length() && hm.get(str.charAt(i)) > 1){
                hm.put(str.charAt(i),hm.get(str.charAt(i)) - 1);
                i++;
            }
            if(hm.size() > unique){
                unique = hm.size();
                small = j-i+1;
            }else{
                small = Math.min(small,j-i+1);
            }
            j++;
        }
        return small;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-distant-window3132/1)