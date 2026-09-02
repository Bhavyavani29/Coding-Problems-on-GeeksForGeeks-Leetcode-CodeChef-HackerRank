# Maximum Product Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  that contains positive and negative integers (may contain 0 as well). Find the  **maximum**  product that we can get in a subarray of  **arr[]**.

 **Note:**  It is guaranteed that the answer fits in a 32-bit integer.

**Examples
**

```
Input: arr[] = [-2, 6, -3, -10, 0, 2]
Output: 180
Explanation: The subarray with maximum product is [6, -3, -10] with product = 6  *(-3)*  (-10) = 180.
```

```
Input: arr[] = [-1, -3, -10, 0, 6]
Output: 30
Explanation: The subarray with maximum product is [-3, -10] with product = (-3) * (-10) = 30.
```

```
Input: arr[] = [2, 3, 4] 
Output: 24 
Explanation: For an array with all positive elements, the result is product of all elements. 
```

 **Constraints:** 
1 ≤ arr.size() ≤ 106
-100 ≤ arr[i] ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T05:50:55.997Z  

```java
class Solution {
    int maxProduct(int[] arr) {
        // code here
        int CurrMax = arr[0];
        int CurrMin = arr[0];
        int Max = arr[0];
        for(int i = 1;i < arr.length; i++){
            if(arr[i] < 0){
                int temp = CurrMax;
                CurrMax = CurrMin;
                CurrMin = temp;
            }
            CurrMax = Math.max(arr[i], CurrMax * arr[i]);
            CurrMin = Math.min(arr[i], CurrMin * arr[i]);
            Max = Math.max(Max, CurrMax);
        }
        return Max;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-product-subarray3604/1)