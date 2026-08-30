# Good or Bad string

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

In this problem, a  *String*   **S**  is composed of lowercase alphabets and wildcard characters i.e. ' **?'.**  Here, '?' can be replaced by any of the lowercase alphabets. Now you have to classify the given  *String*  on the basis of following rules:

If there are more than  **3 consonants together or more than 5 vowels together**, the  *String*  is considered to be " **BAD** ". A  *String*  is considered " **GOOD" only if it is not “BAD”**.

 **NOTE:**  *String*  is considered as "BAD" if the above condition is satisfied even once. Else it is "GOOD" and the task is to make the string "BAD".
 

 **Example 1:** 

```
Input:
S = aeioup??
Output:
1
Explanation: The String doesn't contain more
than 3 consonants or more than 5 vowels together.
So, it's a GOOD string.

```

 **Example 2:** 

```
Input:
S = bcdaeiou??
Output:
0
Explanation: The String contains the
Substring "aeiou??" which counts as 7
vowels together. So, it's a BAD string.

```

 **Your Task:** 
You don't need to read input or print anything. Your task is to complete the function  **isGoodorBad**  **()**  which takes the String S as input and returns 0 or 1.
 

 **Expected Time Complexity:**  O(|S|)
 **Expected Auxiliary Space:**  O(1)
 

 **Constraints:** 
1 <= |S| <= 100000

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T16:15:37.113Z  

```java
// User function Template for Java

class Solution {
    static int isGoodorBad(String S) {
        // code here
        int Vcount = 0, Ccount = 0;
        for(int i = 0;i < S.length(); i++){
            char ch = S.charAt(i);
            if(ch == '?') {
                Vcount++;
                Ccount++;
            }
            else if(isVowel(ch)){
                Vcount++;
                Ccount = 0;
            }
            else{
                Ccount++;
                Vcount = 0;
            }
            if(Vcount > 5 || Ccount > 3)
                return 0;
        }
        return 1;
    }
    static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/good-or-bad-string1417/1)