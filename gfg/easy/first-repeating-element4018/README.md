# First Repeating Element

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[],**  find the first repeating element index. The element should occur more than once and the index of its first occurrence should be the smallest.

 **Note:-** The position you return should be according to 1-based indexing. 

 **Examples:** 

```
Input: arr[] = [1, 5, 3, 4, 3, 5, 6]
Output: 2
Explanation: 5 appears twice and its first appearance is at index 2 which is less than 3 whose first the occurring index is 3.
```

```
Input: arr[] = [1, 2, 3, 4]
Output: -1
Explanation: All elements appear only once so answer is -1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T16:08:02.543Z  

```java
class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
        HashMap<Integer,Integer> h =new HashMap<>();
        for(int num : arr){
            h.put(num, h.getOrDefault(num,0) + 1);
        }
        for(int i =0;i < arr.length;i++){
            if(h.get(arr[i]) > 1){
                return i + 1;
            }
        }
        return -1;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/first-repeating-element4018/1)