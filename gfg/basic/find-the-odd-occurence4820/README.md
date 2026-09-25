# One Odd Occuring

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array of  **arr[]** positive integers where all numbers occur even number of times except one number which occurs odd number of times. Return that number.

 **Examples:** 

```
Input:arr[] = [1, 2, 3, 2, 3, 1, 3]
Output: 3
Explaination: 3 occurs three times.

```

```
Input:arr[] = [5, 7, 2, 7, 5, 2, 5]
Output: 5
Explaination: 5 occurs three times.

```

 **Constraints:** 
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T16:50:59.514Z  

```java
class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : arr){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for(int num : arr){
            int freq = hm.get(num);
            if(freq % 2 != 0)
                return num;
        }
        return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-the-odd-occurence4820/1)