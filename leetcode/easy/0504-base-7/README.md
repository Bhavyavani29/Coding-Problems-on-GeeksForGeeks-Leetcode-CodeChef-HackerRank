# Base 7

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `num`, return  *a string of its  **base 7**  representation*.

 

 **Example 1:** 

```
Input: num = 100
Output: "202"

```

 **Example 2:** 

```
Input: num = -7
Output: "-10"

```

 

 **Constraints:** 

- -107 <= num <= 107

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43 MB (beats 24.97%)  
**Submitted:** 2026-09-29T18:06:35.802Z  

```java
class Solution {
    public String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/base-7/)