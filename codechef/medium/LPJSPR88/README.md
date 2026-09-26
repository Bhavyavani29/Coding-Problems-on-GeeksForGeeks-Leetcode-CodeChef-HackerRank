# LPJSPR88

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Arithmetic operation

Write a program that takes an operator (+, -, *, /) as input.

Use a 'switch' statement to return the name of corresponding arithmetic operation among  **Addition**, **Subtraction**, **Multiply**  and  **Divide**.

Check the sample input / output below for clarity.

### Sample 1:
Input
Output

```
-
```

```
Subtraction
```

### Sample 2:
Input
Output

```
/
```

```
Divide
```

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-26T17:23:06.932Z  

```js
const inputChar = input.trim();

let operation;
switch (inputChar) {
    case '+':
        operation = "Addition";
        break;
    case '-':
        operation = "Subtraction";
        break;
    case '*':
        operation = "Multiply";
        break;
    case '/':
        operation = "Divide";
        break;
    default:
        operation = "Invalid operator";
}

console.log(operation);
```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR88)