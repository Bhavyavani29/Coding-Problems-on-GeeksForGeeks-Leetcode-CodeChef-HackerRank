# Factorial Trailing Zeroes

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer `n`, return  *the number of trailing zeroes in* `n!`.

Note that `n! = n  *(n - 1)*  (n - 2)  *...*  3  *2*  1`.

 

 **Example 1:** 

```
Input: n = 3
Output: 0
Explanation: 3! = 6, no trailing zero.

```

 **Example 2:** 

```
Input: n = 5
Output: 1
Explanation: 5! = 120, one trailing zero.

```

 **Example 3:** 

```
Input: n = 0
Output: 0

```

 

 **Constraints:** 

- 0 <= n <= 104

 

 **Follow up:**  Could you write a solution that works in logarithmic time complexity?

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.7 MB (beats 17.55%)  
**Submitted:** 2026-08-29T16:59:36.654Z  

```java
class Solution {
    public int trailingZeroes(int n) {
        int c=0;
        if(n<=4)
           return c;
        for(int i=5;n/i>=1;i=i*5){
            c=c+n/i;
        }
        return c;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/factorial-trailing-zeroes/)