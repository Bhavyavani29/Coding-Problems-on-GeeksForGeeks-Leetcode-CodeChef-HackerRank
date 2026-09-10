# PYPRACMCQ13 - Rating 245

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-10T16:46:41.305Z  

```py
t = int(input())
for i in range(0,t):
    x,y,a = map(int,input().split())
    # write your code here
    if(a >= x and a < y):
        print("YES")
    else:
        print("NO")
```

---

[View on CodeChef](https://www.codechef.com/problems/PYPRACMCQ13)