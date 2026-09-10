# PYPRACMCQ13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Calculating Total Squats - MCQ

Somu went to the gym today.
He decided to do $X$ sets of squats.
Each set consists of $15$ squats.
What is the total number of squats that he did today?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-10T16:47:07.298Z  

```cpp
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