# Factorial

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a positive integer,  **n**. Find the factorial of  **n**.

 **Examples :** 

```
Input: n = 5
Output: 120
Explanation: 1 x 2 x 3 x 4 x 5 = 120
```

```
Input: n = 4
Output: 24
Explanation: 1 x 2 x 3 x 4 = 24
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-12T17:15:17.914Z  

```java
class Solution {
    static int factorial(int n) {
        int fact=1;
        for(int i=1;i<=n;i++){
           fact=fact*i;
        }
        return fact;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/factorial5739/1)