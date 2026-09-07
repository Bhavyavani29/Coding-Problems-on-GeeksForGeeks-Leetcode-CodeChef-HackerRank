# K Sized Subarray Maximum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  of positive integers and an integer  **k.**  Find the  **maximum value**  for each contiguous subarray of size k.

Return an array of maximum values corresponding to each contiguous subarray.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 1, 4, 5, 2, 3, 6], k = 3
Output: [3, 3, 4, 5, 5, 5, 6]
Explanation: 
1st contiguous subarray [1, 2, 3], max = 3
2nd contiguous subarray [2, 3, 1], max = 3
3rd contiguous subarray [3, 1, 4], max = 4
4th contiguous subarray [1, 4, 5], max = 5
5th contiguous subarray [4, 5, 2], max = 5
6th contiguous subarray [5, 2, 3], max = 5
7th contiguous subarray [2, 3, 6], max = 6

```

```
Input: arr[] = [5, 1, 3, 4, 2], k = 1
Output: [5, 1, 3, 4, 2]
Explanation: When k = 1, each element in the array is its own subarray, so the output is simply the same array

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T17:05:12.110Z  

```java
class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
		TreeMap<Integer,Integer> tm = new TreeMap<>();
		for(int i = 0;i < k;i++){
			tm.put(arr[i],tm.getOrDefault(arr[i],0)+1);
		}
		res.add(tm.lastKey());
		for(int i = 1;i <= n-k;i++){
			tm.put(arr[i+k-1],tm.getOrDefault(arr[i+k-1],0)+1);
			int count = tm.get(arr[i - 1]) - 1;
            if(count == 0) 
                tm.remove(arr[i - 1]);
            else 
                tm.put(arr[i - 1], count);
			res.add(tm.lastKey());
		}
		return res;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1)