# LPJSPR98

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Identify the error

Rectify the errors in the program to get the desired output.

Check the sample input / output below for further clarity.

### Sample 1:
Input
Output

```
1
```

```
Option 1 selected
```

### Sample 2:
Input
Output

```
2
```

```
Option 2 selected
```

### Sample 3:
Input
Output

```
3
```

```
Option 3 selected
```

### Sample 4:
Input
Output

```
Any number other than 1, 2 or 3
```

```
Invalid choice
```

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T15:59:15.139Z  

```js
const choice = input.trim();

switch (choice) {
    case '1':
        console.log('Option 1 selected');
        break;
    case '2':
        console.log('Option 2 selected');
        break;
    case '3':
        console.log('Option 3 selected');
        break;
    default:
        console.log('Invalid choice');
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR98)