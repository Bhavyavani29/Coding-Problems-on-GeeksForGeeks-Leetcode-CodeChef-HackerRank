# Remove Duplicates from an array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]** consisting of  **positive**  integers, return the array by removing all  **duplicate**  numbers.

 **Example:** 

```
Input: arr[] = [2, 2, 3, 3, 7, 5] 
Output: [2, 3, 7, 5]
Explanation: After removing the duplicates 2 and 3 we get 2 3 7 5.

```

```
Input: arr[] = [1, 2, 3, 4, 5] 
Output: [1, 2, 3, 4, 5]
Explanation: There doesn't exists any duplicate element.
```

 **Constraints:** 
2≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-20T17:16:53.989Z  

```java
class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> result = new ArrayList<>();
        if(arr.length == 0 || arr == null)
            return result;
        result.add(arr[0]);
        for(int i = 1;i < arr.length;i++){
            if(arr[i] != arr[i - 1])
                result.add(arr[i]);
        }
        return result;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-duplicates-in-small-prime-array/1)