# LPJSPR155

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Calculate power

Write a function named  **calculatePower**  that takes an integer  **base**  and returns the result of raising  **base**  to the power of  **10**.

### Sample 1:
Input
Output

```
2
```

```
1024
```

### Explanation:

210 = 1024

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-14T16:26:29.516Z  

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

[View on CodeChef](https://www.codechef.com/problems/LPJSPR155)