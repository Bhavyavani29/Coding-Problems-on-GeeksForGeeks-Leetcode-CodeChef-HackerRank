# Union of Arrays with Duplicates

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given two arrays  **a[]**  and  **b[]**, return the  **Union**  of both the arrays in any order.

The  **Union**  of two arrays is a collection of all  **distinct elements**  present in either of the arrays. If an element appears more than once in one or both arrays, it should be included  **only once** in the result.

 **Note:** Elements of  **a[]** and  **b[]**  are not necessarily distinct.
Note that, You can return the Union in any order but the driver code will print the result in  **sorted order** only.

 **Examples:** 

```
Input: a[] = [1, 2, 3, 2, 1], b[] = [3, 2, 2, 3, 3, 2]
Output: [1, 2, 3]
Explanation: Union set of both the arrays will be 1, 2 and 3.

```

```
Input: a[] = [1, 2, 3], b[] = [4, 5, 6] 
Output: [1, 2, 3, 4, 5, 6]
Explanation: Union set of both the arrays will be 1, 2, 3, 4, 5 and 6.
```

```
Input: a[] = [1, 2, 1, 1, 2], b[] = [2, 2, 1, 2, 1] 
Output: [1, 2]
Explanation: Union set of both the arrays will be 1 and 2.
```

 **Constraints:** 
1 ≤ a.size(), b.size() ≤ 106
0 ≤ a[i], b[i] ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T16:05:53.328Z  

```java
class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < a.length;i++){
            hs.add(a[i]);
        }
        for(int j = 0; j < b.length;j++){
            hs.add(b[j]);
        }
        return new ArrayList(hs);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1)