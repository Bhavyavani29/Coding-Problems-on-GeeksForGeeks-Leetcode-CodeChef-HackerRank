# GEOTRI

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Geometric Triplets

You are given a sorted array $A$ of $N$ distinct positive integers.

A triplet $(A_i,A_j,A_k)$, where $i<j<k$, is called a  **geometric triplet**  if there exists a positive integer $R$ such that:

$A_j=A_i\times R$

and

$A_k=A_j\times R$

In other words, the ratio between the second and first elements must be the same as the ratio between the third and second elements, and this common ratio must be a  **positive integer**.

Find and print all geometric triplets present in the array.

Print the triplets in  **lexicographically increasing order**  — first by the first element, then by the second element, and then by the third element.

### Input Format

The first line contains an integer $N$ — the size of the array.

The second line contains $N$ space-separated distinct positive integers $A_1,A_2,\ldots,A_N$ in strictly increasing order.

### Output Format

Print each geometric triplet on a separate line in the following format:

$A_i\ A_j\ A_k$

If no geometric triplet exists, print `-1`.

### Constraints
- $1 \le N \le 2000$
- $1 \le A_i \le 10^9$
- $A_i \lt A_{i+1}$ for every $1 \le i \lt N$
### Sample 1:
Input
Output

```
6
1 2 6 10 18 54
```

```
2 6 18
6 18 54
```

### Explanation:

The triplet $(2,6,18)$ forms a geometric progression with common ratio $3$, since:

$6=2\times3$

and

$18=6\times3$

Similarly, $(6,18,54)$ forms a geometric progression with common ratio $3$.

Therefore, these are the geometric triplets present in the array.

### Sample 2:
Input
Output

```
7
2 4 8 16 27 54 108
```

```
2 4 8
4 8 16
27 54 108
```

### Explanation:

The triplets $(2,4,8)$ and $(4,8,16)$ form geometric progressions with common ratio $2$.

The triplet $(27,54,108)$ also forms a geometric progression with common ratio $2$.

Therefore, these are all the geometric triplets present in the array.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-16T14:11:50.240Z  

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println(-1);
            return;
        }

        long[] A = new long[N];
        HashSet<Long> values = new HashSet<>();
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
            values.add(A[i]);
        }

        Arrays.sort(A);

        StringBuilder sb = new StringBuilder();
        boolean found = false;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[j] % A[i] != 0) continue;

                long ratio = A[j] / A[i];
                // Check potential overflow before multiplying
                if (A[N - 1] / ratio < A[j]) {
                    break; // third would exceed A[N-1]
                }

                long third = A[j] * ratio;

                if (values.contains(third)) {
                    sb.append(A[i]).append(" ").append(A[j]).append(" ").append(third).append("\n");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println(-1);
        } else {
            System.out.print(sb.toString());
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            String s = next();
            return s == null ? -1 : Integer.parseInt(s);
        }

        long nextLong() {
            String s = next();
            return s == null ? -1L : Long.parseLong(s);
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/GEOTRI)