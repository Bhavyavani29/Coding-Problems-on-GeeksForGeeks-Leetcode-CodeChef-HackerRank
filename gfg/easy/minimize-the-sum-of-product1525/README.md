# Minimize Sum of Product

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two arrays  **a[]**  and  **b[]** of same size containing positive integers. Rearrange the elements of both arrays so that the value of: a[0]  *b[0] + a[1]*  b[1] +... + a[n-1] * b[n-1] becomes minimum. Each element of a[] and b[] must be used exactly once.

 **Examples:** 

```
Input: a[] = [3, 1, 1], b[] = [6, 5, 4]
Output: 23
Explanation: After rearranging: a[] = [1, 1, 3] and b[] = [6, 5, 4]. Minimum sum = (1  *6) + (1*  5) + (3 * 4) = 6 + 5 + 12 = 23.
```

```
Input: a[] = [6, 1, 9, 5, 4], b[] = [3, 4, 8, 2, 4]
Output: 80
Explanation: After rearranging: a[] = [1, 4, 5, 6, 9] and b[] = [8, 4, 4, 3, 2]. Minimum sum = (1  *8) + (4*  4) + (5  *4) + (6*  3) + (9 * 2) = 8 + 16 + 20 + 18 + 18 = 80.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T16:31:49.387Z  

```java
class Solution {
  public int minProductSum(int[] a, int[] b) {
    // code here
    Arrays.sort(a);
    Arrays.sort(b);
    int j = b.length - 1;
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i] * b[j];
      j--;
    }
    return sum;
  }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/minimize-the-sum-of-product1525/1)