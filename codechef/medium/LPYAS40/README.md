# LPYAS40

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Print the length

Write a program to print the length of each word of the sentence given below as well as the length of the whole sentence.
 **"Coding on CodeChef"** 

#### Note:

There is spacing between the words and the number, consider it while printing the outputs.

 **Note:**  Please print the outputs in the same format as given below.

### Output Format

Coding - 6
on - 2
CodeChef - 8
Coding on CodeChef - 18

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-28T17:08:13.519Z  

```py
# cook your dish here
one = "Coding"
two = "on"
three = "CodeChef"
four = one + " " + two + " " + three
print(one + " - " + str(len(one)))
print(two + " - " + str(len(two)))
print(three + " - " + str(len(three)))
print(four + " - " + str(len(four)))
```

---

[View on CodeChef](https://www.codechef.com/problems/LPYAS40)