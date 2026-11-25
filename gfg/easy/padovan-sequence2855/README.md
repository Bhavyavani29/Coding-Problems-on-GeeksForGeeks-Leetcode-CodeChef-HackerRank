# Padovan Sequence

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a number  **n**, find the  **nth**  number in the Padovan Sequence.  A Padovan Sequence is a sequence which is represented by the following recurrence relation
P(n) = P(n-2) + P(n-3)
P(0) = P(1) = P(2) = 1

 **Note** : Since the output may be too large, compute the answer modulo 10^9+7.

 **Examples :** 

```
Input: n = 3
Output: 2
Explanation: We already know, P1 + P0 = P3 and P1 = 1 and P0 = 1

```

```
Input: n = 4
Output: 2
Explanation: We already know, P4  = P2 + P1 and P2 = 1 and P1 = 1
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T17:44:28.826Z  

```java
class Solution {
  public int padovanSequence(int n) {
    // code here.
    int z = 1, o = 1, t = 1;
    int MOD = 1000000007;
    if (n < 3)
      return 1;
    for (int i = 3; i <= n; i++) {
      int f = (z + o) % MOD;
      z = o;
      o = t;
      t = f;
    }
    return t % MOD;
  }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/padovan-sequence2855/1)