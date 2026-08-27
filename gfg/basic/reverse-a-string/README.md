# Reverse a String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given a string  **`s`**, and your task is to reverse the string.

 **Examples:** 

```
Input: s = "Geeks"
Output: "skeeG"

```

```
Input: s = "for"
Output: "rof"
```

```
Input: s = "a"
Output: "a"
```

 **Constraints:** 
1 <= s.size() <= 106
s contains only alphabetic characters (both uppercase and lowercase).

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T15:55:00.706Z  

```java
class Solution {
    public static String reverseString(String s) {
        // code here
        //return new StringBuilder(s).reverse().toString();
        char ch [] = s.toCharArray();
        int n = ch.length;
        int i = 0, j = n - 1;
        while(i < j){
            char x = ch[i];
            ch[i] = ch[j];
            ch[j] = x;
            i++;
            j--;
        }
        return new String(ch);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-a-string/1)