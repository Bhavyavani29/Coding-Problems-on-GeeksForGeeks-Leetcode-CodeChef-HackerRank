# RPPS - Rating 1190

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Repeating Pairs

You are given a string $S$ consisting of lowercase English letters.

For every two adjacent characters in $S$, consider the pair they form. For example, the string `abca` contains the pairs `ab`, `bc`, and `ca`.

A pair is called  **repeating**  if it appears at least twice in the string.

Find the  **number of distinct repeating pairs**  in $S$.

For example, in `ababcabc`, the pair `ab` appears $3$ times and `bc` appears $2$ times, so the answer is $2$.

### Input Format
- The first line contains the string $S$.
### Output Format
- Print a single integer — the number of distinct consecutive character pairs that appear more than once.
### Constraints
- $1 \le |S| \le 10^5$
- $S$ consists only of lowercase English letters.
### Sample 1:
Input
Output

```
ababcabc
```

```
2
```

### Explanation:

The consecutive pairs are:

`ab`, `ba`, `ab`, `bc`, `ca`, `ab`, `bc`

The pair `ab` appears $3$ times and `bc` appears $2$ times.

Therefore, there are  **2**  distinct repeating pairs.

### Sample 2:
Input
Output

```
aaaa
```

```
1
```

### Explanation:

The consecutive pairs are:

`aa`, `aa`, `aa`

Only the pair `aa` appears more than once.

Therefore, the answer is  **1**.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-17T15:45:41.374Z  

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        if (S == null) return;
        S = S.trim();
        int N = S.length();
        if (N < 2) {
            System.out.println(0);
            return;
        }
        
        int[] freq = new int[676];
        for (int i = 0; i < N - 1; i++) {
            int code = (S.charAt(i) - 'a') * 26 + (S.charAt(i + 1) - 'a');
            freq[code]++;
        }
        
        int count = 0;
        for (int i = 0; i < 676; i++) {
            if (freq[i] > 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/RPPS)