# Count Sum Pairs in Sorted

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer  **target**  and an array  **arr[]**. You need to find number of pairs in arr[] which sums up to target. It is given that the elements of the arr[] are in sorted order.

 **Note:**   Pairs should have elements of distinct indexes. 

 **Examples :** 

```
Input: arr[] = [-1, 1, 5, 5, 7], target = 6
Output: 3
Explanation: There are 3 pairs which sum up to 6 : {1, 5}, {1, 5} and {-1, 7}.

```

```
Input: arr[] = [1, 1, 1, 1], target = 2
Output: 6
Explanation: There are 6 pairs which sum up to 2 : {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1} and {1, 1}.
```

```
Input: arr[] = [-1, 10, 10, 12, 15], target = 125
Output: 0
Explanation: There is no such pair which sums up to 125.
```

 **Constraints:** 
-105 <= target <=105
 2 <= arr.size() <= 105
-105 <= arr[i] <= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T04:52:29.177Z  

```java
class Solution {
    int countPairs(int arr[], int target) {
        //  Code Here
       HashMap<Integer, Integer> hm = new HashMap<>();
       int count = 0;
       for(int num : arr){
           
           int remain = target - num;
           if(hm.containsKey(remain)){
               count += hm.get(remain);
           }
           hm.put(num, hm.getOrDefault(num, 0) + 1);
       }
       return count;
       
        /*int n = arr.length;
        int i = 0, j = n - 1;
        int count = 0;
        while(i < n && j > 0){
            if(arr[i] + arr[j] == target){
                count++;
                i++;
            }
            i = 0;
            j++;
        }
        return count; */
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/pair-with-given-sum-in-a-sorted-array4940/1)