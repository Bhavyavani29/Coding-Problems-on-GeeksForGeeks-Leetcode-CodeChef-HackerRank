# Harshad Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

An integer divisible by the  **sum**  of its digits is said to be a  **Harshad**  number. You are given an integer `x`. Return *the sum of the digits* of `x` if `x` is a  **Harshad**  number, otherwise, return `-1` *.* 

 

 **Example 1:** 

 **Input:**  x = 18

 **Output:**  9

 **Explanation:** 

The sum of digits of `x` is `9`. `18` is divisible by `9`. So `18` is a Harshad number and the answer is `9`.

 **Example 2:** 

 **Input:**  x = 23

 **Output:**  -1

 **Explanation:** 

The sum of digits of `x` is `5`. `23` is not divisible by `5`. So `23` is not a Harshad number and the answer is `-1`.

 

 **Constraints:** 

- 1 <= x <= 100

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.2 MB (beats 25.03%)  
**Submitted:** 2026-09-05T18:00:44.429Z  

```java
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0, temp = x;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return (x % sum == 0) ? sum : -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/harshad-number/)