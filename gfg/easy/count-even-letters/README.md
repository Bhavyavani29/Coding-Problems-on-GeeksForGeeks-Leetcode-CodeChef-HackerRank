# Count Even Letters

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string  **s**  consisting of lowercase english letters. Your task is to count how many **distinct**  characters appear an  **even**  number of times in the string.

 **Examples:** 

```
Input: s = "abacaba"
Output: 2
Explanation: The frequency of a is 4, b is 2 and c is 1 so there are 2 characters with even frequency.

```

```
Input: s = "zzacccz"
Output: 0
Explanation:The frequency of z is 3, a is 1 and c is 3 so there are no characters with even frequency.
```

**Constraints:
**1 ≤ s.size() ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T16:28:25.865Z  

```java
class Solution {
    public int count(String s) {
        // code here
        HashMap<Character,Integer> hm = new HashMap<>();
        for(Character ch : s.toCharArray() ){
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        int count =0;
        for(int ch : hm.values()){
            if(ch % 2 ==0){
                count++;
            }
        }
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-even-letters/1)