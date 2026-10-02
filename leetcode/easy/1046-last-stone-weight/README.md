# Last Stone Weight

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array of integers `stones` where `stones[i]` is the weight of the `ith` stone.

We are playing a game with the stones. On each turn, we choose the  **heaviest two stones**  and smash them together. Suppose the heaviest two stones have weights `x` and `y` with `x <= y`. The result of this smash is:

- If x == y, both stones are destroyed, and
- If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.

At the end of the game, there is  **at most one**  stone left.

Return  *the weight of the last remaining stone*. If there are no stones left, return `0`.

 

 **Example 1:** 

```
Input: stones = [2,7,4,1,8,1]
Output: 1
Explanation: 
We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.

```

 **Example 2:** 

```
Input: stones = [1]
Output: 1

```

 

 **Constraints:** 

- 1 <= stones.length <= 30
- 1 <= stones[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 32.14%)  
**Memory:** 42.8 MB (beats 69.60%)  
**Submitted:** 2026-10-02T16:10:24.364Z  

```java
class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        if (n == 1) {
            return stones[0];
        }
        for(int i = 0; i < n;i++){
            Arrays.sort(stones);
            int stone1 = stones[n - 1];
            int stone2 = stones[n - 2];
            if(stone2 == 0){
                break;
            }
            if(stone1 == stone2){
                stones[n - 1] = 0;
                stones[n - 2] = 0;
            }
            else{
                stones[n - 1] = stone1 - stone2;
                stones[n - 2] = 0;
            }
        }
        Arrays.sort(stones);
        return stones[n - 1];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/last-stone-weight/)