# LPYAS140B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Simple Interest Calculator

Write a program to calculate the simple interest for a given principal amount, rate of interest, and time period using a function.

Simple interest is calculated using the following formula:

where `P` is the principal amount, `T` is the time period in years and `R` is the annual rate of interest.

### Input Format
- The only line of input contains three space separated numbers - values of P, T and R
### Output Format
- Output a single number - the simple interest for the given values of P, T and R.
### Sample 1:
Input
Output

```
5000 2 5
```

```
500.0
```

### Explanation:

For given P = 5000, T = 2 and R = 5
SI = (5000 x 2 x 5) / 100 = 500.0

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:53:02.042Z  

```py
def calculate_simple_interest(P, T, R):
    # Complete the function
    return (P * T * R) / 100
    

def main():
    P, T, R = map(int, input().split())
    # call the calculate_simple_interest function and print the result
    result = calculate_simple_interest(P, T, R)
    print(result);

main()

```

---

[View on CodeChef](https://www.codechef.com/problems/LPYAS140B)