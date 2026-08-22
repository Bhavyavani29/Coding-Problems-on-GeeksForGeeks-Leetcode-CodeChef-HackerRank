# JPRACMCQ13 - Rating 245

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T16:45:05.830Z  

```java
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