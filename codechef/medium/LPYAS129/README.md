# LPYAS129

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### First occurrence

Write a program using a 'for' loop to find and print the index of the first occurrence of the number 8 in any given list of $N$ integers.

Check the sample input / output below for further details.

Note that your output needs to take into account that the array is $0$ indexed.

### Sample 1:
Input
Output

```
2 4 8 12 8
```

```
2
```

### Explanation:

The first occurrence of the number 8 is at the 2nd index.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T17:12:40.117Z  

```py
numbers = list(map(int, input().split()))
# Update your code below this line
for i, num in enumerate(numbers):
    if num == 8:
        print(i)
        break
```

---

[View on CodeChef](https://www.codechef.com/problems/LPYAS129)