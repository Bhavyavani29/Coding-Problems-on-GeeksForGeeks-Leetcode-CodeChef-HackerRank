# Product Array Puzzle

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array,  **arr[]**, construct a product array, res[] where each element in res[i] is the product of all elements in arr[] except arr[i]. Return this resultant array, res[].
 **Note** : Each element is res[] lies inside the 32-bit integer range.

 **Examples:** 

```
Input: arr[] = [10, 3, 5, 6, 2]
Output: [180, 600, 360, 300, 900]
Explanation: For i=0, res[i] = 3  *5*  6 * 2 is 180.
For i = 1, res[i] = 10  *5*  6 * 2 is 600.
For i = 2, res[i] = 10  *3*  6 * 2 is 360.
For i = 3, res[i] = 10  *3*  5 * 2 is 300.
For i = 4, res[i] = 10  *3*  5 * 6 is 900.

```

```
Input: arr[] = [12, 0]
Output: [0, 12]
Explanation: For i = 0, res[i] is 0.
For i = 1, res[i] is 12.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T16:11:49.693Z  

```java
// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int count = 0, total = 1;
        int[] res = new int[arr.length];
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == 0){
                count ++;
            }
            else{
                total = total * arr[i];
            }
        }
        for(int i = 0;i < arr.length;i++){
            if(count > 1) 
                res[i] = 0;
            else if(count == 1) 
                res[i] = (arr[i] == 0) ? total : 0;
            else
                res[i] = total / arr[i];
        }
        return res;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/product-array-puzzle4525/1)