# LPJSPR156

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-14T16:26:34.395Z  

```js
const base = parseInt(input);

// Function to calculate power
function calculatePower(base) {
    let ans = 1;
    for (let i = 0; i < 10; i++) {
        ans *= base;
    }
    return ans;
}


console.log(calculatePower(base));
```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR156)