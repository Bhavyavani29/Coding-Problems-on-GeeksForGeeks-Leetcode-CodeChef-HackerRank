# Final Value of Number

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

A person randomly chooses a number between 1 and 10 and performs the following operations:

- Double the chosen number.
- Add an even number  (given as input) to the result obtained in Step 1.
- Divide the result from Step 2 by 2.
- Subtract the original chosen number n from the result obtained in Step 3.

Your task is to find the final value obtained after performing all the above operations.

 **Examples:** 

```
Input: k = 10
Output: 5
Explanation:
Suppose chosen number is 3, then after
Step 1: number = 6
Step 2: number = 6 + 10 = 16
Step 3: number = 16/2 = 8
Step 4: 8-3 = 5(required answer).
```

```
Input: k = 2
Output: 1
Explanation:
Suppose chosen number is 8, then after
Step 1: number = 16
Step 2: number = 16+2 = 18
Step 3: number = 18/2 = 9
Step 4: 9-8 = 1(required answer).
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-14T16:28:10.488Z  

```java
class Solution {
    static int mindGame(int K) {
        // code here
        return K/2;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/mind-game3637/1)