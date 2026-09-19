# Distribute n Candies Among k People

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two integers  **n**  and  **k**, where  **n**  represents the total number of candies and  **k**  represents the number of people, distribute the candies in rounds.

- In the first round, the first person receives 1 candy, the second person receives 2 candies, and so on until the kth person receives k candies.
- In the next round, the first person receives k + 1 candies, the second person receives k + 2 candies, and this pattern continues.

If the remaining candies are fewer than the required candies for a person, that person receives all the remaining candies.

Return an array arr of size k, where arr[i] represents the total candies received by the ith person.

 **Examples:** 

```
Input: n = 7, k = 4
Output: [1, 2, 3, 1]
Explanation: The first person receives 1 candy, the second receives 2 candies, and the third receives 3 candies. Only 1 candy remains for the fourth person, so they receive the remaining candy. Therefore, the final distribution is [1, 2, 3, 1].
```

```
Input: n = 10, k = 3
Output: [5, 2, 3]
Explanation: In the first round, the three people receive 1, 2, and 3 candies respectively. In the next round, the first person receives 4 candies, exhausting all the remaining candies. Therefore, the final distribution is [5, 2, 3]. 

```

 **Constraints:** 
1 ≤ n ≤ 108
1 ≤ k ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T17:04:48.518Z  

```java
class Solution {
    public ArrayList<Integer> distributeCandies(int n, int k) {
        // code here
        ArrayList<Integer> result = new ArrayList<>(k);
        for(int i = 0;i < k;i++){
            result.add(0);
        }
        int maxCandies = 1;
        int i =  0;
        while(n > 0){
            int distribute = Math.min(n, maxCandies);
            result.set(i, result.get(i) + distribute);
            n -= distribute;
            maxCandies++;
            i = (i + 1) % k;
        }
        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/distribute-n-candies/1)