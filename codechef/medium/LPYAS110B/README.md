# LPYAS110B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Count Vowels

Write a program that uses a while loop to find no. of vowels in given input string of lowercase latin letters.

 **Note:**  Vowels in lowercase latin letters are:  **a**,  **e**,  **i**,  **o**  and  **u**.

### Input Format
- The only line of input contains a string.
### Output Format
- The only line of output contains a single integer - The count of vowels in the input string.
### Sample 1:
Input
Output

```
codechef
```

```
3
```

### Explanation:

codechef has 3 vowels:  **o**,  **e**  and another  **e**

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T17:40:03.366Z  

```py
# Solution
str = input()
ans = 0
i = 0
while i < len(str):
    c = str[i]
    if c == 'a' or c == 'e' or c == 'i' or c == 'o' or c == 'u':
        ans += 1
    i += 1
    
print(ans)
```

---

[View on CodeChef](https://www.codechef.com/problems/LPYAS110B)