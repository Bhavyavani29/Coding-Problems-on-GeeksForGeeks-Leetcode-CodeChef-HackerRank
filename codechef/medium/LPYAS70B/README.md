# LPYAS70B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Check Voting Eligibility

Write a program that takes two space separated inputs - the age (an integer) and the name of country(a string) and does the following:

- Prints "Eligible" if the age is greater than or equal to 18 and country is India
- Prints "Not Eligible", otherwise.

Check the sample input / output below for further clarity.

### Sample 1:
Input
Output

```
21 India
```

```
Eligible
```

### Sample 2:
Input
Output

```
16 India
```

```
Not Eligible
```

### Sample 3:
Input
Output

```
23 Nepal
```

```
Not Eligible
```

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T09:03:34.080Z  

```py
# cook your dish here
data = input().split()
age, country = int(data[0]), data[1]
if age >= 18 and country == "India":
    print("Eligible")
else:
    print("Not Eligible")

```

---

[View on CodeChef](https://www.codechef.com/problems/LPYAS70B)