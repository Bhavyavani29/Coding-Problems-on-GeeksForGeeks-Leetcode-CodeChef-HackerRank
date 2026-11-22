# Power of Four

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `n`, return  *`true` if it is a power of four. Otherwise, return `false`*.

An integer `n` is a power of four, if there exists an integer `x` such that `n == 4x`.

 

Original
Java
 **Example 1:** 

```
Input: n = 16
Output: true

```

 **Example 2:** 

```
Input: n = 5
Output: false

```

 **Example 3:** 

```
Input: n = 1
Output: true

```

 

 **Constraints:** 

- -231 <= n <= 231 - 1

 

 **Follow up:**  Could you solve it without loops/recursion?

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 41.2 MB  
**Submitted:** 2026-11-22T12:52:39.965Z  

```java
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0) return false;
        double res = Math.log(n) / Math.log(4);
        return res % 1 == 0;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/power-of-four/)