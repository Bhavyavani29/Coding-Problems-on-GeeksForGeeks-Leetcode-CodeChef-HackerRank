# LPYAS120B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sum of Multiple of 3

Write a program to calculate the sum of first  **N**  multiples of 3 and print it.

Check the sample input / output below for further clarity.

### Input Format
- The only input is an integer N.
### Output Format
- The only output is the sum of first N multiples of 3.
### Sample 1:
Input
Output

```
4
```

```
30
```

### Explanation:

First 4 multiples of 3 are: 3, 6, 9 and 12
Hence, 3 + 6 + 9 + 12 = 30

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T17:14:27.430Z  

```py
# Enter the value of N
N = int(input())

# Initialize the sum
total_sum = 0

# Calculate the sum of the first N multiples of 3
for i in range(1, N + 1):
    total_sum += 3 * i

# Print the sum
print(total_sum)

```

---

[View on CodeChef](https://www.codechef.com/problems/LPYAS120B)