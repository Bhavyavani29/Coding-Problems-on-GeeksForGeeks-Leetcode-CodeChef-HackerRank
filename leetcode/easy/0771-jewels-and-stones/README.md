# Jewels and Stones

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You're given strings `jewels` representing the types of stones that are jewels, and `stones` representing the stones you have. Each character in `stones` is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so `"a"` is considered a different type of stone from `"A"`.

 

 **Example 1:** 

```
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

```

 **Example 2:** 

```
Input: jewels = "z", stones = "ZZ"
Output: 0

```

 

 **Constraints:** 

- 1 <= jewels.length, stones.length <= 50
- jewels and stones consist of only English letters.
- All the characters of jewels are unique.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 9.51%)  
**Memory:** 42.9 MB (beats 83.04%)  
**Submitted:** 2026-09-26T16:42:21.235Z  

```java
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0;i < jewels.length();i++){
            hs.add(jewels.charAt(i));
        }
        int count = 0;
        for(int i = 0;i < stones.length();i++){
            if(hs.contains(stones.charAt(i)))
                count++;
        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/jewels-and-stones/)