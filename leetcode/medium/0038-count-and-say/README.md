# Count and Say

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

The  **count-and-say**  sequence is a sequence of digit strings defined by the recursive formula:

- countAndSay(1) = "1"
- countAndSay(n) is the run-length encoding of countAndSay(n - 1).

Run-length encoding (RLE) is a string compression method that works by replacing each maximal group of consecutive identical characters with the concatenation of the length of the group followed by the character itself. For example, to compress the string `"3322251"` we replace `"33"` with `"23"`, replace `"222"` with `"32"`, replace `"5"` with `"15"`, and replace `"1"` with `"11"`. Thus the compressed string becomes `"23321511"`.

Given a positive integer `n`, return  *the* `nth` *element of the  **count-and-say**  sequence*.

 

 **Example 1:** 

 **Input:**  n = 4

 **Output:**  "1211"

 **Explanation:** 

```
countAndSay(1) = "1"
countAndSay(2) = RLE of "1" = "11"
countAndSay(3) = RLE of "11" = "21"
countAndSay(4) = RLE of "21" = "1211"

```

 **Example 2:** 

 **Input:**  n = 1

 **Output:**  "1"

 **Explanation:** 

This is the base case.

 

 **Constraints:** 

- 1 <= n <= 30

 

 **Follow up:**  Could you solve it iteratively?

## Solution

**Language:** Java  
**Runtime:** 9 ms (beats 33.49%)  
**Memory:** 42.6 MB (beats 84.74%)  
**Submitted:** 2026-11-01T16:57:23.647Z  

```java
class Solution {
    public String countAndSay(int n) {
       if (n <= 0)
            return "";
        String res = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int len = res.length();
            for (int j = 0; j < len; j++) {
                int count = 1;
                while (j + 1 < len && res.charAt(j) == res.charAt(j + 1)) {
                    count++;
                    j++;
                }
                sb.append(count).append(res.charAt(j));
            }
            res = sb.toString();
        }
        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-and-say/)