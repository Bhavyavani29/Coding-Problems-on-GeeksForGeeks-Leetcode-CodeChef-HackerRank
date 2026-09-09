# Capacity To Ship Packages Within d Days

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given  **arr[]**  of weights, find the minimum boat capacity to ship all weights within  **d**  days.

- The items are loaded in the same order as their appearance.
- The total weight should not exceed the computed capacity on any day.

 **Examples:** 

```
Input: arr[] = [1, 2, 1], d = 2
Output: 3
Explanation: We can ship with boat capacity 3 in 2 days.
Day 1- 1, 2
Day 2- 1

```

```
Input: arr[] = [9, 8, 10], d = 3
Output: 10
Explanation: We can ship with boat capacity 10 in 3 days.
Day 1- 9
Day 2- 8
Day 3- 10
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T10:07:25.208Z  

```java
class Solution {
    public int leastWeightCapacity(ArrayList<Integer> arr, int d) {
        // code here
        int low = 1, high = 0, result = 0;
        for(int num : arr){
            high += num;
            low = Math.max(num, low);
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(shipCapacity(arr, d, mid)){
                result = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return result;
    }
    public static boolean shipCapacity(ArrayList<Integer> arr, int d, int currMidValue){
        int maxDays = 1, currSum = 0;
        for(int num : arr){
            if(currSum + num > currMidValue){
                maxDays++;
                currSum = 0;
            }
            currSum += num;
        }
        return maxDays <= d;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/capacity-to-ship-packages-within-d-days/1)