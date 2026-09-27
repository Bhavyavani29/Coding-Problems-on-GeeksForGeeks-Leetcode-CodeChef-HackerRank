# LPJSPR96

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Identify the error

Rectify the errors in the program to correctly print the log base 10 of given input. If the output is not defined print  **Invalid input**.

### Sample 1:
Input
Output

```
100
```

```
2
```

### Sample 2:
Input
Output

```
-1
```

```
Invalid input
```

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T15:58:16.670Z  

```js
 let x = parseFloat(inputChar);

 if (x > 0) {
     let y = Math.log10(x);
     console.log(y);
 } else {
     console.log("Invalid input");
 }
```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR96)