# Cake Distribution Problem

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Geek has a cake consisting of  **n** consecutive chunk, find the maximum possible sweetness that Geek can get by choosing the cuts optimally.

- Sweetness of each chunk is given in the array sweetness[].
- Geek wants to divide the cake into exactly k + 1 non-empty contiguous pieces and give k pieces to his friends while keeping one piece for himself.
- The sweetness of a piece is the sum of the sweetness values of its chunks.
- Geek keeps the piece with the minimum sweetness among all k + 1 pieces.

 **Examples:** 

```
Input: k = 2, sweetness[] = [6, 3, 2, 8, 7, 5]
Output: 9
Explanation: The cake can be divided into [6, 3], [2, 8], and [7, 5]. Their sweetness values are 9, 10, and 12. Therefore, Geek gets 9.
```

```
Input: k = 3, sweetness[] = [1, 2, 4, 7, 3, 6, 9]
Output: 7
Explanation: The cake can be divided into [1, 2, 4], [7], [3, 6], and [9]. Their sweetness values are 7, 7, 9, and 9. Therefore, Geek gets 7.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T04:58:14.941Z  

```java
class Solution {
    int maxSweetness(int[] sweetness, int k) {
        // code here
        int low = 1, high = 0, result = 0;
        for(int num : sweetness){
            high += num;
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(canDivide(sweetness, k + 1, mid)){
                result = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return result;
    }
    public static boolean canDivide(int []sweetness, int requiredPieces, int currValue){
        int currSum = 0;
        int maxPieces = 0;
        for(int num : sweetness){
            currSum += num;
            if(currSum >= currValue){
                maxPieces++;
                currSum = 0;
            }
        }
        return maxPieces >= requiredPieces;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/cake-distribution-problem--170647/1)