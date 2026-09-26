# LPJSPR87

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Vowel or Consonant

Write a program that takes a lowercase english alphabet character as input and uses a 'switch' statement to determine if it's a  **Vowel**  or  **Consonant**.

### Sample 1:
Input
Output

```
e
```

```
Vowel
```

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-26T17:22:55.349Z  

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

[View on CodeChef](https://www.codechef.com/problems/LPJSPR87)