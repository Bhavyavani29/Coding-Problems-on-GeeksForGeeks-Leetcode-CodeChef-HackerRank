# Remove All Except Alphabets

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, remove all characters except lowercase and uppercase alphabets (a-z and A-Z) and return the resulting string.

If no alphabetic characters remain after removal, return an empty string.

 **Examples:** 

```
Input: s = "$Gee*k;s..fo, r'Ge^eks?"
Output: "GeeksforGeeks"
Explanation: All characters other than alphabets are removed from the string "$Gee*k;s..fo, r'Ge^eks?", resulting in "GeeksforGeeks". 

```

```
Input:  s = "{{{}}>  *& ^%*)"
Output: ""
Explanation: The string "{{{}}>  *& ^%*)" does not contain any alphabetic characters, so after removing all non-alphabet characters, the resulting string is empty.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-01T16:46:14.421Z  

```java
class Solution {
    public String removeChars(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch) || Character.isLowerCase(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-all-characters-other-than-alphabets4923/1)