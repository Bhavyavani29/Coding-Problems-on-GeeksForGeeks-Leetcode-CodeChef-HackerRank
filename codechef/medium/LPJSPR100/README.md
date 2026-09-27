# LPJSPR100

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Whats Wrong

Debug the code in the IDE.

The code is supposed to do the following:

- Input one integer on a single line.
- If the number is negative print NOT FOUND
- else print the square root of that number
### Sample 1:
Input
Output

```
-1
```

```
NOT FOUND
```

### Sample 2:
Input
Output

```
36
```

```
6
```

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T15:59:49.414Z  

```js
let number = parseInt(inputChar);

if (number < 0) {
    
    console.log("NOT FOUND");
    
} else {
    
    let result = Math.sqrt(number);

    console.log(result);
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR100)