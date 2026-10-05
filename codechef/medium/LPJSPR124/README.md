# LPJSPR124

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Product and Sum of digits

Given an integer  **N**, Calculate and print the  **sum**  and  **product**  of its digit.

### Input Format
- The first and only line of input will contain a single positive integer $N$ <= 109.
### Output Format
- Print the sum and product of digits of $N$ on single line with a space between them.
### Sample 1:
Input
Output

```
22
```

```
4 4
```

### Explanation:

For number = 22
sum of digits = 2 + 2 = 4
product of digits = 2 * 2 = 4

### Sample 2:
Input
Output

```
222
```

```
6 8
```

### Explanation:

For number = 222
sum of digits = 2 + 2 + 2 = 6
product of digits = 2  *2*  2 = 8

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:04:47.768Z  

```js
 let N = parseInt(inputChar); 

 let sumOfDigits = 0;
    let productOfDigits = 1;

    while (N > 0) {
        let digit = N % 10;  // Get the last digit
        sumOfDigits += digit;  // Add the digit to sum
        productOfDigits *= digit;  // Multiply the digit to product
        N = Math.floor(N / 10);  // Remove the last digit
    }

    console.log(sumOfDigits,productOfDigits);
```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR124)