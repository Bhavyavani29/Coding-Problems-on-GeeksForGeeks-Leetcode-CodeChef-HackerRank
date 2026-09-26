# LPJSPR88

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-26T17:22:57.638Z  

```js
const inputChar = input.trim().toLowerCase();

let result;
switch (inputChar) {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
        result = "Vowel";
        break;
    default:
        result = "Consonant";
}

console.log(result);
```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR88)