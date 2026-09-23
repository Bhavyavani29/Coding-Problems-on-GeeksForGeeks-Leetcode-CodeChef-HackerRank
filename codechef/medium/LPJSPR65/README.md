# LPJSPR65

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Prodigy Student - Rectify code

Modify the given program to output the name of the student with the higher percentage. In case they score equal percentages, print ' **equal** '.

### Task
- The first two lines contain the names of the first and second students.
- The third and fourth lines assign the percentage scores of both students.

Rectify the given code.

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T16:19:14.433Z  

```js
let name_1 = "Ajay";
let name_2 = "Sumit";

let marks_1 = 98.4;
let marks_2 = 98.4;

if (marks_2 < marks_1) {
    console.log(name_2);
} else if (marks_2 > marks_1) {
    console.log(name_1);
} else {
    console.log("equal");
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR65)