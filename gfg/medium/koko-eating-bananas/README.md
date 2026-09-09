# Koko Eating Bananas

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Koko is given an array **arr[],**  where each element represents a pile of bananas. She has exactly  **k**  hours to eat all the bananas.

Each hour, Koko can choose one pile and eat up to **s** bananas from it.

- If the pile has atleast s bananas, she eats exactly s bananas.
- If the pile has fewer than s bananas, she eats the entire pile in that hour.

Koko can only eat from one pile per hour.

Your task is to find the  **minimum** value of  **s**  (bananas per hour) such that Koko can finish all the piles within  **k** hours.

 **Examples:** 

```
Input: arr[] = [5, 10, 3], k = 4
Output: 5
Explanation: If Koko eats at the rate of 5 bananas per hour:
First pile of 5 bananas will be finished in 1 hour.
Second pile of 10 bananas will be finished in 2 hours.
Third pile of 3 bananas will be finished in 1 hours.
Therefore, Koko can finish all piles of bananas in 1 + 2 + 1 = 4 hours.
```

```
Input: arr[] = [5, 10, 15, 20], k = 7
Output: 10
Explanation: If Koko eats at the rate of 10 bananas per hour, it will take 6 hours to finish all the piles.
```

 **Constraint:** 
1 ≤ arr.size() ≤ k ≤ 106
1 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T10:15:24.574Z  

```java
class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
         int low = 1, high = 0, result = 0;
        for (int num : arr) {
            high = Math.max(num, high);
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canEat(arr, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
    public static boolean canEat(int[] arr, int k, int currMidValue) {
        long totalHours = 0;
        for(int num : arr){
            int hoursForPile = num / currMidValue;
            if (num % currMidValue != 0) {
                hoursForPile++;
            }
            totalHours += hoursForPile;
        }
        return totalHours <= k;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/koko-eating-bananas/1)