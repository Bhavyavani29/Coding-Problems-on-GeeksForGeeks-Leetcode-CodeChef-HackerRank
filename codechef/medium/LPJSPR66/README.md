# LPJSPR66

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Print the minimum

Rectify the given code to print the smallest among them.

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T16:20:34.442Z  

```js
let x = 2;
let y = 3;
let z = 1;

if (x < y) {
    if (x < z) {
        console.log(x);
    } else {
        if (y < z) {
            console.log(y);
        } else {
            console.log(z);
        }
    }
} else {
    if (y < z) {
        console.log(y);
    } else {
        if (x < z) {
            console.log(x);
        } else {
            console.log(z);
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR66)