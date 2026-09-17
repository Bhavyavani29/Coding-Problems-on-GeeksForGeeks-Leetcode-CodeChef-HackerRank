# Reverse Vowels

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string consisting of lowercase English alphabets, reverse only the vowels present in it and print the resulting string.

 **Examples:** 

```
Input: s = "geeksforgeeks"
Output: "geeksforgeeks"
Explanation: The vowels are: e, e, o, e, e. Reverse of these is also e, e, o, e, e.

```

```
Input: s = "practice"
Output: "prectica"
Explanation: The vowels are a, i, e. Reverse of these is e, i, a.

```

```
Input: s = "bcdfg"
Output: "bcdfg"
Explanation: There are no vowels in s.
```

 **Constraints:** 
1<=|s|<=105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T17:16:35.514Z  

```java
class Solution {
    public String modify(String s) {
        // code here
        String vowels = "AEIOUaeiou";
        char ch[] = s.toCharArray();
        int i = 0, j = ch.length - 1;
        while(i < j){
            while(i < j && vowels.indexOf(ch[i]) == -1){
                i++;
            }
            while(i < j && vowels.indexOf(ch[j]) == -1){
                j--;
            }
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reversing-the-vowels5304/1)