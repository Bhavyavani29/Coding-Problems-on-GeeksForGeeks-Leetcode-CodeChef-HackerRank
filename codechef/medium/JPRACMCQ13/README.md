# JPRACMCQ13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Multiple Choice Question

Somu went to the gym today.
He decided to do $X$ sets of squats.
Each set consists of $15$ squats.
What is the total number of squats that he did today?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T16:45:42.376Z  

```cpp
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            // write your code here
            if (a >= x && a < y)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JPRACMCQ13)