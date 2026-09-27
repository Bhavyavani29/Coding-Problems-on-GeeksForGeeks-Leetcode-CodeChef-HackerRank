# LPJSPR99

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Which Day It Is

Debug the code in the IDE to solve the problem.

The code is supposed to do the following:

- Take a character as input.
- If its between 1 - 7, prints the corresponding day of the week.
- Else print, Invalid input. Check the sample test case.
### Sample 1:
Input
Output

```
5
```

```
Friday
```

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T15:59:38.577Z  

```js
const choice = input.trim();
let day;
     
  switch (choice) {
    case '1':
      day = "Monday";
      break;
    case '2':
      day = "Tuesday";
      break;
    case '3':
      day = "Wednesday";
      break;
    case '4':
      day = "Thursday";
      break;
    case '5':
      day = "Friday";
      break;
    case '6':
      day = "Saturday";
      break;
    case '7':
      day = "Sunday";
      break;
    default:
      day = null; // Handle invalid input
      break;
  }

  // Printing the result
  if (day) {
    console.log(day);
  } else {
    console.log("Invalid input");
  }
   
```

---

[View on CodeChef](https://www.codechef.com/problems/LPJSPR99)