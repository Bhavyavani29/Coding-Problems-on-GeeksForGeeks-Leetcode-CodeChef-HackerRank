# Sum of Submatrix Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a matrix  **arr[][]**   and four integers  **x1**,  **y1**,  **x2**, and  **y2** representing the top-left and bottom-right corners of a submatrix (using 1-based indexing), find the sum of all elements in that submatrix.

 **Examples:** 

```
Input: arr[][] = [[1, 2, 3, 4, 5, 6}, [7, 8, 9, 10, 11, 12], [13, 14, 15, 16, 17, 18], [19, 20, 21, 22, 23, 24], [25, 26, 27, 28, 29, 30]], x1 = 3, y1 = 4, x2 = 4, y2 = 5
Output: 78
Explanation: Sum from cell starting at position (3, 4) (1-based indexing) and ending at (4, 5) is 78 (16 + 17 + 22 + 23).

```

```
Input: arr[][] = [[9, 8, 7], [4, 2, 1], [6, 5, 3]], x1 = 1, y1 = 2, x2 = 3, y2 = 3
Output: 26
Explanation: Sum from cell starting at position (1, 2) (1-based indexing) and ending at (3, 3) is 26.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T04:22:28.254Z  

```java
class Solution {
    public int subMatrixSum(int[][] arr, int x1, int y1, int x2, int y2) {
        // code here
        int sum = 0;
        for(int i = x1 - 1; i <= x2 - 1;i++){
            for(int j = y1 - 1; j <= y2 - 1;j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/addition-of-submatrix5835/1)