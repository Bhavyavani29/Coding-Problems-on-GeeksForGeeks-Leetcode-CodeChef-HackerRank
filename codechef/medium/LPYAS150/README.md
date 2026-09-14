# LPYAS150

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Even odd

Write a program that first accepts the number of test cases  **t**. For each test case, read an integer  **num**. Check if  **num**  is even using the  **isEven**  function. If  **num**  is even, output "Even"; otherwise, output "Odd".

### Sample 1:
Input
Output

```
3
2
6
5
```

```
Even
Even
Odd
```

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-14T16:18:49.973Z  

```py
def is_even(num):
    return num % 2 == 0

def main():
    t = int(input())
    for _ in range(t):
        num = int(input())
        if is_even(num):
            print("Even")
        else:
            print("Odd")

if __name__ == "__main__":
    main()

```

---

[View on CodeChef](https://www.codechef.com/problems/LPYAS150)