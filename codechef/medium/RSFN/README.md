# RSFN

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Matrix Region Sum

You are given an $N \times N$ integer matrix A and an integer $K$.

Consider the following regions of the matrix:

- the main diagonal together with the diagonals immediately above and below it;
- the border of the matrix, consisting of all cells in the first row, last row, first column, or last column;
- the central $K \times K$ submatrix.

The central submatrix is positioned exactly at the center of the matrix. It is guaranteed that $N-K$ is even, so this submatrix is uniquely defined.

A matrix cell may belong to more than one of these regions. Such a cell must be  **counted only once**  in the total sum.

Find the sum of all matrix elements that belong to at least one of the three regions.

### Input Format

The first line contains two space-separated integers $N$ and $K$ — the size of the matrix and the size of the central submatrix.

Each of the next $N$ lines contains $N$ space-separated integers representing the matrix.

### Output Format

Print a single integer — the sum of all elements belonging to at least one of the specified regions.

### Constraints
- $1 \le K \le N \le 100$
- $N-K$ is even
- $-10^3 \le A_{i,j} \le 10^3$
### Sample 1:
Input
Output

```
3 1
1 1 1
1 1 1
1 1 1
```

```
9
```

### Explanation:

Every cell belongs to at least one of the specified regions.

Since each element is `1`, the required sum is `9`.

### Sample 2:
Input
Output

```
5 1
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
```

```
299
```

### Explanation:

The central submatrix consists only of the middle element `13`.

After considering the border, the main diagonal and its adjacent diagonals, and the central submatrix, while counting every cell only once, the total sum is `299`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-16T14:13:19.754Z  

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int start = (N - K) / 2;
        int end = start + K - 1;

        long sum = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                int x = Integer.parseInt(st.nextToken());

                boolean border =
                    i == 0 || i == N - 1 || j == 0 || j == N - 1;

                boolean diagonal =
                    Math.abs(i - j) <= 1;

                boolean central =
                    i >= start && i <= end &&
                    j >= start && j <= end;

                if (border || diagonal || central) {
                    sum += x;
                }
            }
        }

        System.out.println(sum);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/RSFN)