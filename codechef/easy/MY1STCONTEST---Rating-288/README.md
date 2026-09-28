# MY1STCONTEST - Rating 288

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T17:24:38.050Z  

```js
// Solution

function isErrorProne(x, y){
    if(x < y){
        console.log("YES");
    } else {
        console.log("NO");
    }
}

// Input related code. Please do not change. 
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(input) {
  const nums = input.trim().split(' ');
  const x = parseInt(nums[0]); 
  const y = parseInt(nums[1]); 
  isErrorProne(x, y);
});


```

---

[View on CodeChef](https://www.codechef.com/problems/MY1STCONTEST)