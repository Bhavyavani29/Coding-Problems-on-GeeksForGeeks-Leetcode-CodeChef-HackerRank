# Climbing Stairs

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are climbing a staircase. It takes `n` steps to reach the top.

Each time you can either climb `1` or `2` steps. In how many distinct ways can you climb to the top?

 

 **Example 1:** 

```
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

```

 **Example 2:** 

```
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

```

 

 **Constraints:** 

- 1 <= n <= 45

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.9 MB (beats 87.15%)  
**Submitted:** 2026-08-26T16:20:12.258Z  

```java
class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1; 
        if (n == 2) return 2;
        int F[] = new int[n+1];
		F[1] = 1; F[2] = 2;
		for(int i = 3;i <= n;i++){
			F[i] = F[i-1]+F[i-2];
		}
		return F[n];
        /*if(n == 1) return 1;
		else if(n == 2) return 2;
		else
			return climbStairs(n-1)+climbStairs(n-2);*/
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/climbing-stairs/)