# Three Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array  **arr**, return all the  **unique** triplets [arr[i], arr[j], arr[k]] such that **i != j, i != k, and j != k,** and  **arr[i] + arr[j] + arr[k] == 0.** 

Note: The triplets must be returned in  **sorted** order, the solution vector should also be  **sorted**, and the answer must not contain any  **duplicate** triplets.

 **Examples:** 

```
Input: arr = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: arr[0] + arr[1] + arr[2] = (-1) + 0 + 1 = 0.
arr[1] + arr[2] + arr[4] = 0 + 1 + (-1) = 0.
arr[0] + arr[3] + arr[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].

```

```
Input: arr = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
```

**Constraints:
**3 <= arr.length <= 3000
-105 <= arr[i] <= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T16:39:36.179Z  

```java
class SortPairs implements Comparator<List<Integer>>{
    public int compare(List<Integer> a, List<Integer> b){
        for(int i = 0;i < a.size();i++){
            if(a.get(i) != b.get(i)){
                return a.get(i) - b.get(i);
            }
        }
        return 0;
    }
}
class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i = 0;i < n;i++){
            if(i > 0 && arr[i] == arr[i-1])
                continue;
            int l = i + 1, r = n - 1;
            while(l < r){
                int x = arr[i] + arr[l] + arr[r];
                if(x == 0){
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(arr[i]);
                    al.add(arr[l]);
                    al.add(arr[r]);
                    res.add(al);
                    l++;
                    r--;
                    while(l < r && arr[l] == arr[l-1])
                    l++;
                    while(l < r && arr[r] == arr[r+1])
                    r--;
                }
                else if(x < 0)
                    l++;
                else
                    r--;
            }
        }
        return res;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/three-sum/1)