# Day of the Year

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `date` representing a Gregorian calendar date formatted as `YYYY-MM-DD`, return  *the day number of the year*.

 

 **Example 1:** 

```
Input: date = "2019-01-09"
Output: 9
Explanation: Given date is the 9th day of the year in 2019.

```

 **Example 2:** 

```
Input: date = "2019-02-10"
Output: 41

```

 

 **Constraints:** 

- date.length == 10
- date[4] == date[7] == '-', and all other date[i]'s are digits
- date represents a calendar date between Jan 1st, 1900 and Dec 31st, 2019.

## Solution

**Language:** Java  
**Runtime:** 10 ms (beats 32.79%)  
**Memory:** 46.8 MB (beats 79.32%)  
**Submitted:** 2026-09-12T17:39:44.146Z  

```java
class Solution {
    public int dayOfYear(String date) {
        String[] s = date.split("-");
        int year = Integer.parseInt(s[0]);
        int month = Integer.parseInt(s[1]);
        int day = Integer.parseInt(s[2]);
        int[] noDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(isLeap(year))
        {
            noDays[1] = 29;
        }
        int t = 0;
        for(int i = 0;i < month-1;i++)
        {
            t = t + noDays[i];
        }
        t = t + day;
        return t;
    }
    static boolean isLeap(int n)
    {
        if((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) return true;
        else
            return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/day-of-the-year/)