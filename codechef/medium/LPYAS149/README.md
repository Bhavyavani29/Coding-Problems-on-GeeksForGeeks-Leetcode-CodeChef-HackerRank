# LPYAS149

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-14T16:18:55.350Z  

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

[View on CodeChef](https://www.codechef.com/problems/LPYAS149)