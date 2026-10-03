# 1-bit and 2-bit Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

We have two special characters:

- The first character can be represented by one bit 0.
- The second character can be represented by two bits (10 or 11).

Given a binary array `bits` that ends with `0`, return `true` if the last character must be a one-bit character.

 

 **Example 1:** 

```
Input: bits = [1,0,0]
Output: true
Explanation: The only way to decode it is two-bit character and one-bit character.
So the last character is one-bit character.

```

 **Example 2:** 

```
Input: bits = [1,1,1,0]
Output: false
Explanation: The only way to decode it is two-bit character and two-bit character.
So the last character is not one-bit character.

```

 

 **Constraints:** 

- 1 <= bits.length <= 1000
- bits[i] is either 0 or 1.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 44.7 MB (beats 11.75%)  
**Submitted:** 2026-10-03T17:04:23.319Z  

```java
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        int n = bits.length;
        while (i < n - 1) {
            if (bits[i] == 1) {
                i += 2;
            } else {
                i += 1;
            }
        }
        return i == n - 1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/1-bit-and-2-bit-characters/)