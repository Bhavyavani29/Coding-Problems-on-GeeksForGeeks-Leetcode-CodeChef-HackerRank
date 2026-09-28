# CBSPEED - Rating 362

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T17:24:23.165Z  

```js
// Solution

function isAliceHappy(x, y){
    if(x >= 2 * y){
        console.log("Yes");
    } else{
        console.log("No");
    }
}

// Input related code. Please do not change this.
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(input) {
  const nums = input.trim().split(' ');
  const x = parseInt(nums[0]); 
  const y = parseInt(nums[1]); 
  isAliceHappy(x, y);
});

```

---

[View on CodeChef](https://www.codechef.com/problems/CBSPEED)